package com.renj.provider.config;

import com.renj.provider.common.ApplicationCommon;
import com.renj.provider.utils.CheckUtils;
import com.renj.provider.utils.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-05   15:05
 * <p>
 * 描述：token 拦截器
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class TokenInterceptor implements HandlerInterceptor {

    private static Logger logger = LoggerFactory.getLogger(TokenInterceptor.class);
    private static List<String> tokenList = new ArrayList<>();
    private static long preRefreshTime;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (this.tokenCheck(request)) {
            // 通过校验
            logger.info("token检验通过");
            return true;
        } else {
            throw new MyException(ApplicationCommon.CODE_TOKEN_EXCEPTION, ApplicationCommon.MESSAGE_TOKEN_EXCEPTION);
        }
    }

    private boolean tokenCheck(HttpServletRequest request) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (CheckUtils.isEmpty(tokenList) || currentTimeMillis - preRefreshTime > ApplicationCommon.TOKEN_REFRESH_TIME) {
                tokenList.addAll(FileUtils.readFileToListString("token.data"));
                preRefreshTime = currentTimeMillis;
            }

            String headerToken = request.getHeader("token");
            if (CheckUtils.isEmpty(headerToken)) {
                String paramsToken = request.getParameter("token");

                if (CheckUtils.isEmpty(paramsToken)) return false;
                return tokenList.contains(paramsToken);
            } else {
                return tokenList.contains(headerToken);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new MyException(ApplicationCommon.CODE_HANDLER_EXCEPTION, ApplicationCommon.MESSAGE_HANDLER_EXCEPTION);
        }
    }
}

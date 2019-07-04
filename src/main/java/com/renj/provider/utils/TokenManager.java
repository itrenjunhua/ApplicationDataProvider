package com.renj.provider.utils;

import com.renj.provider.ApplicationConfig;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-05  01:18
 * <p>
 * 描述：token管理类
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class TokenManager {
    private final static TokenManager INSTANCE = new TokenManager();
    private static List<String> TOKEN_LIST = new ArrayList<>();
    private static long preRefreshTime;

    private TokenManager() {
    }

    public static TokenManager getInstance() {
        return INSTANCE;
    }

    public boolean tokenCheck(HttpServletRequest request) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (CheckUtils.isEmpty(TOKEN_LIST) || currentTimeMillis - preRefreshTime > ApplicationConfig.TOKEN_REFRESH_TIME) {
                TOKEN_LIST.addAll(FileUtils.readFileToListString("token.data"));
                preRefreshTime = currentTimeMillis;
            }

            String headerToken = request.getHeader("token");
            if (CheckUtils.isEmpty(headerToken)) {
                String paramsToken = request.getParameter("token");

                if (CheckUtils.isEmpty(paramsToken)) return false;
                return TOKEN_LIST.contains(paramsToken);
            } else {
                return TOKEN_LIST.contains(headerToken);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("service exception");
        }
    }
}

package com.renj.provider.config;

import com.renj.provider.common.ApplicationCommon;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-05   16:00
 * <p>
 * 描述：参数拦截器
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class ParamsInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String pageNo = request.getParameter("pageNo");
        String pageSize = request.getParameter("pageSize");
        if (Integer.valueOf(pageNo) <= 0 || Integer.valueOf(pageSize) <= 0)
            throw new MyException(ApplicationCommon.CODE_PARAMS_EXCEPTION, ApplicationCommon.MESSAGE_PARAMS_EXCEPTION);
        return true;
    }
}

package com.renj.provider.utils;

import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.bean.base.ListResponseBean;
import com.renj.provider.common.ApplicationCommon;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-204  00:49
 * <p>
 * 描述：响应创建工厂
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class ResponseFactory {
    /**
     * 创建参数异常响应
     */
    public static BaseResponseBean paramsExceptionResponse() {
        return new BaseResponseBean(ApplicationCommon.CODE_PARAMS_EXCEPTION, ApplicationCommon.MESSAGE_PARAMS_EXCEPTION, null);
    }

    /**
     * 创建成功响应
     */
    public static <T> BaseResponseBean successResponse(T data) {
        return new BaseResponseBean(ApplicationCommon.CODE_SUCCESS, ApplicationCommon.MESSAGE_SUCCESS, data);
    }

    /**
     * 创建列表响应
     */
    public static <T> BaseResponseBean listResponse(int total, int page, T data) {
        return new ListResponseBean(total, page, data);
    }

    /**
     * 创建失败响应
     */
    public static BaseResponseBean failResponse() {
        return new BaseResponseBean(ApplicationCommon.CODE_FAIL, ApplicationCommon.MESSAGE_FAIL, null);
    }

    /**
     * 创建token异常响应
     */
    public static BaseResponseBean tokenExceptionResponse() {
        return new BaseResponseBean(ApplicationCommon.CODE_TOKEN_EXCEPTION, ApplicationCommon.MESSAGE_TOKEN_EXCEPTION, null);
    }

    /**
     * 创建处理异常响应
     */
    public static BaseResponseBean handlerExceptionResponse() {
        return new BaseResponseBean(ApplicationCommon.CODE_HANDLER_EXCEPTION, ApplicationCommon.MESSAGE_HANDLER_EXCEPTION, null);
    }

    /**
     * 创建未知异常响应
     */
    public static BaseResponseBean unknowExceptionResponse() {
        return new BaseResponseBean(ApplicationCommon.CODE_UN_KNOW_EXCEPTION, ApplicationCommon.MESSAGE_UN_KNOW_EXCEPTION, null);
    }
}

package com.renj.provider.utils;

import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.bean.base.ListResponseBean;
import com.renj.provider.bean.base.IResponseValue;

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
        return new BaseResponseBean(IResponseValue.CODE_PARAMS_EXCEPTION, IResponseValue.MESSAGE_PARAMS_EXCEPTION, null);
    }

    /**
     * 创建成功响应
     */
    public static <T> BaseResponseBean successResponse(T data) {
        return new BaseResponseBean(IResponseValue.CODE_SUCCESS, IResponseValue.MESSAGE_SUCCESS, data);
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
        return new BaseResponseBean(IResponseValue.CODE_FAIL, IResponseValue.MESSAGE_FAIL, null);
    }

    /**
     * 创建token异常响应
     */
    public static BaseResponseBean tokenExceptionResponse() {
        return new BaseResponseBean(IResponseValue.CODE_TOKEN_EXCEPTION, IResponseValue.MESSAGE_TOKEN_EXCEPTION, null);
    }

    /**
     * 创建处理异常响应
     */
    public static BaseResponseBean handlerExceptionResponse() {
        return new BaseResponseBean(IResponseValue.CODE_HANDLER_EXCEPTION, IResponseValue.MESSAGE_HANDLER_EXCEPTION, null);
    }

    /**
     * 创建没找到/未知异常响应
     */
    public static BaseResponseBean noFoundExceptionResponse() {
        return new BaseResponseBean(IResponseValue.CODE_NOT_FOUNT, IResponseValue.MESSAGE_NOT_FOUNT, null);
    }
}

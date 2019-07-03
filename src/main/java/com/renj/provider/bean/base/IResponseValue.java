package com.renj.provider.bean.base;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-06-28   14:49
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public interface IResponseValue {
    /**
     * 成功
     */
    int CODE_SUCCESS = 200;
    String MESSAGE_SUCCESS = "success";
    /**
     * 参数异常
     */
    int CODE_PARAMS_EXCEPTION = 300;
    String MESSAGE_PARAMS_EXCEPTION = "params_exception";
    /**
     * 失败
     */
    int CODE_FAIL = 501;
    String MESSAGE_FAIL = "fail";
    /**
     * 处理异常
     */
    int CODE_HANDLER_EXCEPTION = 502;
    String MESSAGE_HANDLER_EXCEPTION = "handler_exception";
    /**
     * token异常
     */
    int CODE_KEY_EXCEPTION = 503;
    String MESSAGE_KEY_EXCEPTION = "key_exception";
    /**
     * 未知异常
     */
    int CODE_NOT_FOUNT = 404;
    String MESSAGE_NOT_FOUNT = "not_fount";
}

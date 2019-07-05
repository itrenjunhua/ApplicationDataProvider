package com.renj.provider.common;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-04   17:40
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public interface ApplicationCommon {
    /**
     * 数据根目录
     */
    String ROOT_DIR = "data";

    /**
     * token缓存更新间隔时间
     */
    long TOKEN_REFRESH_TIME = 1000 * 60;

    /**
     * 成功
     */
    int CODE_SUCCESS = 200;
    String MESSAGE_SUCCESS = "success";
    /**
     * 参数异常
     */
    int CODE_PARAMS_EXCEPTION = 300;
    String MESSAGE_PARAMS_EXCEPTION = "参数异常";
    /**
     * 失败
     */
    int CODE_FAIL = 501;
    String MESSAGE_FAIL = "fail";
    /**
     * 处理异常
     */
    int CODE_HANDLER_EXCEPTION = 502;
    String MESSAGE_HANDLER_EXCEPTION = "服务器处理异常";
    /**
     * token异常
     */
    int CODE_TOKEN_EXCEPTION = 503;
    String MESSAGE_TOKEN_EXCEPTION = "Token失效";
    /**
     * 未知异常
     */
    int CODE_UN_KNOW_EXCEPTION = 503;
    String MESSAGE_UN_KNOW_EXCEPTION = "位置异常";
}

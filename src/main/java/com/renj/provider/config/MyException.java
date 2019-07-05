package com.renj.provider.config;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-05   15:01
 * <p>
 * 描述：我的异常类
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class MyException extends RuntimeException {
    private int code;

    public MyException(int code) {
        this.code = code;
    }

    public MyException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

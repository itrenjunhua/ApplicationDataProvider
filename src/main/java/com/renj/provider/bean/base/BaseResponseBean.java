package com.renj.provider.bean.base;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-06-28   14:14
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class BaseResponseBean<T> {

    public String message;
    public int code;
    public T data;

    public BaseResponseBean(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}

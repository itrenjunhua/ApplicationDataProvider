package com.renj.provider.bean.base;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-204  00:56
 * <p>
 * 描述：专门为列表提供的响应类
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class ListResponseBean<T> extends BaseResponseBean<T> {
    public int total;
    public int page;

    public ListResponseBean(int total, int page, T data) {
        super(IResponseValue.CODE_SUCCESS, IResponseValue.MESSAGE_SUCCESS, data);
        this.total = total;
        this.page = page;
    }
}
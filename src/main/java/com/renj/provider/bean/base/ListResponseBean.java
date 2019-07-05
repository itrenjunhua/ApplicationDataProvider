package com.renj.provider.bean.base;

import com.renj.provider.common.ApplicationCommon;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

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
@ApiModel
@Getter
@Setter
public class ListResponseBean<T> extends BaseResponseBean<T> {
    private int total;
    private int page;

    public ListResponseBean(int total, int page, T data) {
        super(ApplicationCommon.CODE_SUCCESS, ApplicationCommon.MESSAGE_SUCCESS, data);
        this.total = total;
        this.page = page;
    }
}

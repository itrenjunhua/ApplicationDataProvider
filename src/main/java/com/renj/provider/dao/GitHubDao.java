package com.renj.provider.dao;

import com.renj.provider.bean.ListBean;
import com.renj.provider.data.ListDataFactory;

import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-01   11:21
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class ListDao {
    private ListDataFactory listDataFactory;

    public ListDao() {
        this.listDataFactory = new ListDataFactory();
    }

    public List<ListBean> createListBeanList(int count) {
        return listDataFactory.createListBeanList(count);
    }
}

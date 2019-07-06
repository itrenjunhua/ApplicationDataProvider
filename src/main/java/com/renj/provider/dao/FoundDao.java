package com.renj.provider.dao;

import com.renj.provider.bean.BannerBean;
import com.renj.provider.bean.ListBean;
import com.renj.provider.data.FoundDataFactory;

import java.io.IOException;
import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-06  18:48
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class FoundDao {
    private FoundDataFactory foundDataFactory;

    public FoundDao() {
        foundDataFactory = new FoundDataFactory();
    }

    /* ===========================  banner 数据 =========================== */

    public List<BannerBean> getBannerList() throws IOException {
        return foundDataFactory.getBannerList();
    }

    /* ===========================  推荐 list 数据 =========================== */

    public List<ListBean> getListBeanList() throws IOException {
        return foundDataFactory.getListBeanList();
    }
}

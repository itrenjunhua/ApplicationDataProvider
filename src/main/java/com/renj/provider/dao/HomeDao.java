package com.renj.provider.dao;

import com.renj.provider.bean.BannerBean;
import com.renj.provider.bean.ListBean;
import com.renj.provider.bean.NoticeBean;
import com.renj.provider.data.HomeDataFactory;

import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-06-28   14:58
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */

public class HomeDao {
    private HomeDataFactory homeDataFactory;

    public HomeDao() {
        homeDataFactory = new HomeDataFactory();
    }

    public BannerBean createBanner() {
        return homeDataFactory.createBanner();
    }

    public List<BannerBean> createBannerList(int count) {
        return homeDataFactory.createBannerList(count);
    }

    public NoticeBean createNoticeBean() {
        return homeDataFactory.createNoticeBean();
    }

    public List<NoticeBean> createNoticeBeanList(int count) {
        return homeDataFactory.createNoticeBeanList(count);
    }

    public ListBean createListBean() {
        return homeDataFactory.createListBean();
    }

    public List<ListBean> createListBeanList(int count) {
        return homeDataFactory.createListBeanList(count);
    }
}

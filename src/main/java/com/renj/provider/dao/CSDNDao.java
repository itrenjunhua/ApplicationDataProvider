package com.renj.provider.dao;

import com.renj.provider.bean.BannerBean;
import com.renj.provider.bean.ListBean;
import com.renj.provider.bean.NoticeBean;
import com.renj.provider.data.CSDNDataFactory;

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

public class CSDNDao {
    private com.renj.provider.data.CSDNDataFactory CSDNDataFactory;

    public CSDNDao() {
        CSDNDataFactory = new CSDNDataFactory();
    }

    public BannerBean createBanner() {
        return CSDNDataFactory.createBanner();
    }

    public List<BannerBean> createBannerList(int count) {
        return CSDNDataFactory.createBannerList(count);
    }

    public NoticeBean createNoticeBean() {
        return CSDNDataFactory.createNoticeBean();
    }

    public List<NoticeBean> createNoticeBeanList(int count) {
        return CSDNDataFactory.createNoticeBeanList(count);
    }

    public ListBean createListBean() {
        return CSDNDataFactory.createListBean();
    }

    public List<ListBean> createListBeanList(int pageNo,int pageSize) {
        return CSDNDataFactory.createListBeanList(pageNo,pageSize);
    }
}

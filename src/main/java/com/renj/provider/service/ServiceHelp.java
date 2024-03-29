package com.renj.provider.service;

import com.renj.provider.bean.BannerAndNoticeBean;
import com.renj.provider.bean.BannerBean;
import com.renj.provider.bean.ListBean;
import com.renj.provider.bean.NoticeBean;
import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.utils.ResponseFactory;

import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-04  20:14
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class ServiceHelp {
    static BaseResponseBean getBannerAndNotices(List<BannerBean> bannerList, List<NoticeBean> noticeBeanList) {
        BannerAndNoticeBean bannerAndNoticeBean = new BannerAndNoticeBean();
        bannerAndNoticeBean.setBanners(bannerList);
        bannerAndNoticeBean.setNotices(noticeBeanList);
        return ResponseFactory.successResponse(bannerAndNoticeBean);
    }

    static BaseResponseBean getListBean(int[] listTotalAndPage, List<ListBean> listBeanList) {
        return ResponseFactory.listResponse(listTotalAndPage[0], listTotalAndPage[1], listBeanList);
    }
}

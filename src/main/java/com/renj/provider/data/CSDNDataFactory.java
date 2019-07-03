package com.renj.provider.data;

import com.renj.provider.bean.BannerBean;
import com.renj.provider.bean.ListBean;
import com.renj.provider.bean.NoticeBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-06-28   14:59
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class CSDNDataFactory {
    private Random random;

    public CSDNDataFactory() {
        random = new Random();
    }

    /* ===========================  banner 数据 =========================== */

    public BannerBean createBanner() {
        BannerBean bannerBean = new BannerBean();
        int anInt = random.nextInt(CSDNStaticData.bannerIds.length);
        bannerBean.id = CSDNStaticData.bannerIds[anInt];
        bannerBean.title = CSDNStaticData.bannerTitles[anInt];
        bannerBean.image = CSDNStaticData.banners[anInt];
        bannerBean.url = CSDNStaticData.bannerUrls[anInt];
        return bannerBean;
    }

    public List<BannerBean> createBannerList(int count) {
        if (count > CSDNStaticData.banners.length)
            count = CSDNStaticData.banners.length;

        List<BannerBean> bannerBeans = new ArrayList<>();
        while (bannerBeans.size() < count) {
            BannerBean banner = createBanner();
            if (!bannerBeans.contains(banner))
                bannerBeans.add(banner);
        }
        return bannerBeans;
    }

    /* ===========================  notices 数据 =========================== */

    public NoticeBean createNoticeBean() {
        NoticeBean noticeBean = new NoticeBean();
        int anInt = random.nextInt(CSDNStaticData.noticesIds.length);
        noticeBean.id = CSDNStaticData.noticesIds[anInt];
        noticeBean.title = CSDNStaticData.notices[anInt];
        noticeBean.url = CSDNStaticData.noticeUrls[anInt];
        return noticeBean;
    }

    public List<NoticeBean> createNoticeBeanList(int count) {
        if (count > CSDNStaticData.notices.length)
            count = CSDNStaticData.notices.length;

        List<NoticeBean> noticeBeans = new ArrayList<>();
        while (noticeBeans.size() < count) {
            NoticeBean noticeBean = createNoticeBean();
            if (!noticeBeans.contains(noticeBean))
                noticeBeans.add(noticeBean);
        }
        return noticeBeans;
    }

    /* ===========================  list 数据 =========================== */

    public int getListTotal() {
        return CSDNStaticData.listIds.length;
    }

    public int getListPage(int pageSize) {
        if (CSDNStaticData.listIds.length % pageSize == 0)
            return CSDNStaticData.listIds.length / pageSize;

        return CSDNStaticData.listIds.length / pageSize + 1;
    }

    public ListBean createListBean() {
        return createListBean(random.nextInt(CSDNStaticData.titles.length));
    }

    public ListBean createListBean(int index) {
        ListBean listBean = new ListBean();
        listBean.pid = IPids.MY_CSDN;
        listBean.id = CSDNStaticData.listIds[index];
        listBean.title = CSDNStaticData.titles[index];
        listBean.content = CSDNStaticData.contents[index];
        listBean.url = CSDNStaticData.listUrls[index];
        return listBean;
    }

    public List<ListBean> createListBeanList(int pageNo, int pageSize) {
        int endIndex = pageNo * pageSize;
        int startIndex = endIndex - pageSize;

        if (startIndex < 0)
            startIndex = 0;

        if (endIndex < 0 || endIndex > CSDNStaticData.listIds.length)
            endIndex = CSDNStaticData.listIds.length;

        if (startIndex > CSDNStaticData.listIds.length)
            startIndex = endIndex - 10;

        List<ListBean> listBeans = new ArrayList<>();
        for (int i = startIndex; i < endIndex; i++) {
            listBeans.add(createListBean(i));
        }
        return listBeans;
    }
}

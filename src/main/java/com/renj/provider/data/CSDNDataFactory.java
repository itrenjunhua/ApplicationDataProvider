package com.renj.provider.data;

import com.renj.provider.bean.csdn.BannerBean;
import com.renj.provider.bean.csdn.ListBean;
import com.renj.provider.bean.csdn.NoticeBean;
import com.renj.provider.data.CSDNStaticData;

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

    public BannerBean createBanner() {
        BannerBean bannerBean = new BannerBean();
        int anInt = random.nextInt(CSDNStaticData.banners.length);
        bannerBean.title = CSDNStaticData.bannerTitles[anInt];
        bannerBean.image = CSDNStaticData.banners[anInt];
        bannerBean.clickResult = CSDNStaticData.bannerUrls[anInt];
        bannerBean.clickable = random.nextInt(2);
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

    public NoticeBean createNoticeBean() {
        NoticeBean noticeBean = new NoticeBean();
        int anInt = random.nextInt(CSDNStaticData.notices.length);
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

    public ListBean createListBean() {
        return createListBean(random.nextInt(CSDNStaticData.titles.length));
    }

    public ListBean createListBean(int index) {
        ListBean listBean = new ListBean();
        listBean.title = CSDNStaticData.titles[index];
        listBean.content = CSDNStaticData.contents[index];
        listBean.url = CSDNStaticData.listUrls[index];
        return listBean;
    }

    public List<ListBean> createListBeanList(int pageNo, int pageSize) {
        int endIndex = pageNo * pageSize;
        int startIndex = endIndex - pageSize;

        if (startIndex < 0 || startIndex > CSDNStaticData.titles.length)
            startIndex = 0;

        if (endIndex < 0 || endIndex > CSDNStaticData.titles.length)
            endIndex = CSDNStaticData.titles.length;

        List<ListBean> listBeans = new ArrayList<>();
        for (int i = startIndex; i < endIndex; i++) {
            listBeans.add(createListBean(i));
        }
        return listBeans;
    }
}

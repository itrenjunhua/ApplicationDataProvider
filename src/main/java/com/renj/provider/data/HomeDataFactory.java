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
public class HomeDataFactory {
    private Random random;

    public HomeDataFactory() {
        random = new Random();
    }

    public BannerBean createBanner() {
        BannerBean bannerBean = new BannerBean();
        int anInt = random.nextInt(StaticData.banners.length);
        bannerBean.title = StaticData.bannerTitles[anInt];
        bannerBean.image = StaticData.banners[anInt];
        bannerBean.clickResult = StaticData.bannerUrl;
        bannerBean.clickable = random.nextInt(2);
        return bannerBean;
    }

    public List<BannerBean> createBannerList(int count) {
        if (count > StaticData.banners.length)
            count = StaticData.banners.length;

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
        int anInt = random.nextInt(StaticData.notices.length);
        noticeBean.title = StaticData.notices[anInt];
        noticeBean.url = StaticData.noticeUrl;
        return noticeBean;
    }

    public List<NoticeBean> createNoticeBeanList(int count) {
        if (count > StaticData.notices.length)
            count = StaticData.notices.length;

        List<NoticeBean> noticeBeans = new ArrayList<>();
        while (noticeBeans.size() < count) {
            NoticeBean noticeBean = createNoticeBean();
            if (!noticeBeans.contains(noticeBean))
                noticeBeans.add(noticeBean);
        }
        return noticeBeans;
    }

    public ListBean createListBean() {
        List<String> images = new ArrayList<>();

        int nextInt = random.nextInt(4);
        for (int i = 0; i < nextInt; i++) {
            images.add(StaticData.listImages[random.nextInt(StaticData.listImages.length)]);
        }

        ListBean listBean = new ListBean();
        int anInt = random.nextInt(StaticData.titles.length);
        listBean.title = StaticData.titles[anInt];
        listBean.content = StaticData.contents[anInt];
        listBean.images = images;
        listBean.url = StaticData.listUrl;
        listBean.src = StaticData.sources[random.nextInt(StaticData.sources.length)];
        listBean.time = System.currentTimeMillis();
        return listBean;
    }

    public List<ListBean> createListBeanList(int count) {
        if (count > StaticData.titles.length)
            count = StaticData.titles.length;

        List<ListBean> listBeans = new ArrayList<>();
        while (listBeans.size() < count) {
            ListBean listBean = createListBean();
            if (!listBeans.contains(listBean))
                listBeans.add(listBean);
        }
        return listBeans;
    }
}

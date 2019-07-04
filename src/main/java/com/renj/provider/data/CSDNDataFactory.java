package com.renj.provider.data;

import com.renj.provider.bean.BannerBean;
import com.renj.provider.bean.ListBean;
import com.renj.provider.bean.NoticeBean;
import com.renj.provider.utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    private final static String FILE_DIR = "my_csdn";

    /* ===========================  banner 数据 =========================== */

    public List<BannerBean> getBannerList() throws IOException {
        List<BannerBean> bannerBeans = FileUtils.readFileToListBean(FILE_DIR + File.separator + "banner.data", BannerBean.class);
        return bannerBeans;
    }

    /* ===========================  notices 数据 =========================== */

    public List<NoticeBean> getNoticesList() throws IOException {
        List<NoticeBean> noticeBeans = FileUtils.readFileToListBean(FILE_DIR + File.separator + "notices.data", NoticeBean.class);
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

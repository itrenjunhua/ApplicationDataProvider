package com.renj.provider.data;

import com.renj.provider.bean.BannerBean;
import com.renj.provider.bean.ListBean;
import com.renj.provider.bean.NoticeBean;
import com.renj.provider.utils.FileUtils;

import java.io.File;
import java.io.IOException;
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
    private final static int MY_CSDN_PID = 1;

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

    /**
     * 获取列表的总数和页数
     *
     * @return int[] result[0]：总数 result[1]：页数
     */
    public int[] getListTotalAndPage(int pageSize) throws IOException {
        return FactoryHelp.getListTotalAndPage(MY_CSDN_PID, pageSize);
    }

    public List<ListBean> getListBeanList(int pageNo, int pageSize) throws IOException {
        return FactoryHelp.getListBeanList(MY_CSDN_PID, FILE_DIR + File.separator + "list.data", pageNo, pageSize);
    }

    public static void main(String[] args) throws IOException {
        List<ListBean> listBeans = new CSDNDataFactory().getListBeanList(4, 10);
        for (ListBean listBean : listBeans) {
            System.out.println(listBean);
        }
    }
}

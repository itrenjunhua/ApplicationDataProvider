package com.renj.provider.data;

import com.renj.provider.bean.BannerBean;
import com.renj.provider.bean.ListBean;
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
 * 创建时间：2019-07-06  18:44
 * <p>
 * 描述：发现也接口
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class FoundDataFactory {
    private final static String FILE_DIR = "found";

    /* ===========================  banner 数据 =========================== */

    public List<BannerBean> getBannerList() throws IOException {
        List<BannerBean> bannerBeans = FileUtils.readFileToListBean(FILE_DIR + File.separator + "banner.data", BannerBean.class);
        return bannerBeans;
    }

    /* ===========================  推荐 list 数据 =========================== */

    public List<ListBean> getListBeanList() throws IOException {
        return FileUtils.readFileToListBean(FILE_DIR + File.separator + "list.data", ListBean.class);
    }
}

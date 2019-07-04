package com.renj.provider.dao;

import com.renj.provider.bean.BannerBean;
import com.renj.provider.bean.ListBean;
import com.renj.provider.bean.NoticeBean;
import com.renj.provider.data.CSDNDataFactory;

import java.io.IOException;
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
    private CSDNDataFactory csdnDataFactory;

    public CSDNDao() {
        csdnDataFactory = new CSDNDataFactory();
    }

    public List<BannerBean> createBannerList() throws IOException {
        return csdnDataFactory.getBannerList();
    }

    public List<NoticeBean> createNoticeBeanList() throws IOException {
        return csdnDataFactory.getNoticesList();
    }

    /**
     * 获取列表的总数和页数
     *
     * @return int[] result[0]：总数 result[1]：页数
     */
    public int[] getListTotalAndPage(int pageSize) throws IOException {
        return csdnDataFactory.getListTotalAndPage(pageSize);
    }

    public List<ListBean> createListBeanList(int pageNo,int pageSize) throws IOException {
        return csdnDataFactory.createListBeanList(pageNo,pageSize);
    }
}

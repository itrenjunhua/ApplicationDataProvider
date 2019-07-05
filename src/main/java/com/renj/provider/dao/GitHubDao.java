package com.renj.provider.dao;

import com.renj.provider.bean.BannerBean;
import com.renj.provider.bean.ListBean;
import com.renj.provider.bean.NoticeBean;
import com.renj.provider.data.GitHubDataFactory;

import java.io.IOException;
import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-01   11:21
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class GitHubDao {
    private GitHubDataFactory gitHubDataFactory;

    public GitHubDao() {
        this.gitHubDataFactory = new GitHubDataFactory();
    }

    public List<BannerBean> getBannerList() throws IOException {
        return gitHubDataFactory.getBannerList();
    }

    public List<NoticeBean> getNoticeBeanList() throws IOException {
        return gitHubDataFactory.getNoticesList();
    }

    /**
     * 获取列表的总数和页数
     *
     * @return int[] result[0]：总数 result[1]：页数
     */
    public int[] getListTotalAndPage(int pageSize) throws IOException {
        return gitHubDataFactory.getListTotalAndPage(pageSize);
    }

    public List<ListBean> getListBeanList(int pageNo, int pageSize) throws IOException {
        return gitHubDataFactory.getListBeanList(pageNo, pageSize);
    }
}

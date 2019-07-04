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

    public List<BannerBean> createBannerList() throws IOException {
        return gitHubDataFactory.getBannerList();
    }


    public List<NoticeBean> createNoticeBeanList() throws IOException {
        return gitHubDataFactory.getNoticesList();
    }

    public int getTotal() {
        return gitHubDataFactory.getTotal();
    }

    public int getPage(int pageSize) {
        return gitHubDataFactory.getPage(pageSize);
    }

    public List<ListBean> createListBeanList(int pageNo, int pageSize) {
        return gitHubDataFactory.createListBeanList(pageNo, pageSize);
    }
}

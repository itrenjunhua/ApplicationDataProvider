package com.renj.provider.data;

import com.renj.provider.bean.github.ListBean;

import java.util.ArrayList;
import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-01   11:22
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class GitHubDataFactory {

    public GitHubDataFactory() {

    }

    public ListBean createListBean(int index) {
        ListBean listBean = new ListBean();
        listBean.title = GitHubStaticData.titles[index];
        listBean.content = GitHubStaticData.contents[index];
        listBean.url = GitHubStaticData.listUrls[index];
        listBean.isForked = listBean.content.startsWith("Forked");
        return listBean;
    }

    public List<ListBean> createListBeanList(int pageNo, int pageSize) {
        int endIndex = pageNo * pageSize;
        int startIndex = endIndex - pageSize;

        if (startIndex < 0)
            startIndex = 0;

        if (endIndex < 0 || endIndex > GitHubStaticData.titles.length)
            endIndex = GitHubStaticData.titles.length;

        if (startIndex > CSDNStaticData.titles.length)
            startIndex = endIndex - 10;

        List<ListBean> listBeans = new ArrayList<>();
        for (int i = startIndex; i < endIndex; i++) {
            listBeans.add(createListBean(i));
        }
        return listBeans;
    }
}

package com.renj.provider.data;

import com.renj.provider.bean.ListBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
public class ListDataFactory {
    private Random random;

    public ListDataFactory() {
        random = new Random();
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

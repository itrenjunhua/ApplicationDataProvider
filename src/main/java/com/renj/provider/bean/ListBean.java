package com.renj.provider.bean;

import java.util.List;
import java.util.Objects;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-06-28   15:32
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class ListBean {

    /**
     * title : 列表页数据2
     * content : 2-数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容
     * url :
     * time :
     * src : 来源2
     * images : ["",""]
     */

    public String title;
    public String content;
    public String url;
    public long time;
    public String src;
    public List<String> images;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListBean listBean = (ListBean) o;
        return time == listBean.time &&
                Objects.equals(title, listBean.title) &&
                Objects.equals(content, listBean.content) &&
                Objects.equals(url, listBean.url) &&
                Objects.equals(src, listBean.src) &&
                Objects.equals(images, listBean.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, url, time, src, images);
    }
}

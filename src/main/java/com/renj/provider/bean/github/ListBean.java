package com.renj.provider.bean.github;

import java.util.Objects;

public class ListBean {
    /**
     * title : 列表页数据2
     * content : 2-数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容
     * url :
     */

    public String title;
    public String content;
    public String url;
    public boolean isForked;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListBean listBean = (ListBean) o;
        return isForked == listBean.isForked &&
                Objects.equals(title, listBean.title) &&
                Objects.equals(content, listBean.content) &&
                Objects.equals(url, listBean.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, url, isForked);
    }
}

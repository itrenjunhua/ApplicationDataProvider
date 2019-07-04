package com.renj.provider.bean;

import java.util.List;

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
     */

    public int pid;
    public int id;
    public String title;
    public String content;
    public String url;
    public List<String> images;

    @Override
    public String toString() {
        return "ListBean{" +
                "pid=" + pid +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", images=" + images +
                '}';
    }
}

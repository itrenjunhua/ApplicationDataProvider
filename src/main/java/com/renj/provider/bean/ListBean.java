package com.renj.provider.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

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
@ApiModel(value = "列表对象", description = "列表对象")
@Getter
@Setter
public class ListBean {

    /**
     * title : 列表页数据2
     * content : 2-数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容数据内容
     * url :
     */

    @ApiModelProperty(value = "列表数据分类id")
    private int pid;
    @ApiModelProperty(value = "列表数据id")
    private int id;
    @ApiModelProperty(value = "列表数据标题")
    private String title;
    @ApiModelProperty(value = "列表数据简介")
    private String content;
    @ApiModelProperty(value = "列表数据内容详细地址")
    private String url;
    @ApiModelProperty(value = "列表数据相关图片")
    private List<String> images;

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

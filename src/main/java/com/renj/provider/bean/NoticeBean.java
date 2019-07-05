package com.renj.provider.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-06-28   15:36
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@ApiModel(value = "公告对象", description = "公告对象")
@Getter
@Setter
public class NoticeBean {

    /**
     * title : 公告标题
     * url : banner_url
     */

    @ApiModelProperty(value = "公告 id")
    private int id;
    @ApiModelProperty(value = "公告标题")
    private String title;
    @ApiModelProperty(value = "公告点击显示网页链接")
    private String url;

}

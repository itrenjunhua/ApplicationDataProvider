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
 * 创建时间：2019-06-28   14:13
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@ApiModel(value = "banner对象", description = "banner对象")
@Getter
@Setter
public class BannerBean {

    /**
     * title : 首页banner图1
     * image :
     * clickable : 1
     * clickResult : 点击banner图1
     */

    @ApiModelProperty(value = "banner id")
    private int id;
    @ApiModelProperty(value = "banner 标题")
    private String title;
    @ApiModelProperty(value = "banner 图片链接")
    private String image;
    @ApiModelProperty(value = "banner 点击显示网页链接")
    private String url;

}

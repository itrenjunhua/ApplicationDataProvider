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
 * 创建时间：2019-07-05  19:26
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@ApiModel(value = "banner对象以及Notices对象", description = "banner对象以及Notices对象")
@Getter
@Setter
public class BannerAndNoticeBean {
    @ApiModelProperty(value = "banner数据")
    private List<BannerBean> banners;
    @ApiModelProperty(value = "notices数据")
    private List<NoticeBean> notices;
}

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
 * 创建时间：2019-07-06  18:48
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@ApiModel(value = "发现页接口数据", description = "发现页接口数据")
@Getter
@Setter
public class FoundBean {
    @ApiModelProperty(value = "banner数据")
    private List<BannerBean> banners;
    @ApiModelProperty(value = "列表数据")
    private List<ListBean> beanList;
}

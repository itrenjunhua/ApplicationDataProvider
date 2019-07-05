package com.renj.provider.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-04   16:22
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@ApiModel(value = "分类对象", description = "分类对象")
@Getter
@Setter
public class ClassificationBean {

    /**
     * id : 1
     * desc : my_csdn
     * total : 54
     * file : data/my_csdn/list.data
     */
    @ApiModelProperty(value = "分类项id")
    private int id;
    @ApiModelProperty(value = "分类项描述")
    private String desc;
    @ApiModelProperty(value = "分类项标签")
    private String label;
    @ApiModelProperty(value = "分类项纪录条数")
    private int total;
    @ApiModelProperty(value = "分类项数据保存位置", hidden = true)
    private String file;

    @Override
    public String toString() {
        return "ClassificationBean{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", label='" + label + '\'' +
                ", total=" + total +
                ", file='" + file + '\'' +
                '}';
    }
}

package com.renj.provider.bean.csdn;

import java.util.Objects;

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
public class BannerBean {

    /**
     * title : 首页banner图1
     * image :
     * clickable : 1
     * clickResult : 点击banner图1
     */

    public String title;
    public String image;
    public int clickable;
    public String clickResult;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BannerBean that = (BannerBean) o;
        return clickable == that.clickable &&
                Objects.equals(title, that.title) &&
                Objects.equals(image, that.image) &&
                Objects.equals(clickResult, that.clickResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, image, clickable, clickResult);
    }
}

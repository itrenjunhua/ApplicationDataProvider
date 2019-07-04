package com.renj.provider.data;

import com.renj.provider.bean.ClassificationBean;

import java.io.IOException;
import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-04   17:00
 * <p>
 * 描述：列表数据工厂
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class ClassificationDataFactory {
    /**
     * 获取分类项
     *
     * @return
     * @throws IOException
     */
    public List<ClassificationBean> getClassificationBean() throws IOException {
        return FactoryHelp.getClassificationBean();
    }
}

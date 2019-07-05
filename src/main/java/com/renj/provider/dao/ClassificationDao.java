package com.renj.provider.dao;

import com.renj.provider.bean.ClassificationBean;
import com.renj.provider.bean.ListBean;
import com.renj.provider.data.ClassificationDataFactory;

import java.io.IOException;
import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-04   17:13
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class ClassificationDao {
    private ClassificationDataFactory classificationDataFactory;

    public ClassificationDao() {
        this.classificationDataFactory = new ClassificationDataFactory();
    }

    public List<ClassificationBean> getClassificationBean() throws IOException {
        return classificationDataFactory.getClassificationBean();
    }

    /* ===========================  list 数据 =========================== */

    /**
     * 获取列表的总数和页数
     *
     * @return int[] result[0]：总数 result[1]：页数
     */
    public int[] getListTotalAndPage(int pid, int pageSize) throws IOException {
        return classificationDataFactory.getListTotalAndPage(pid, pageSize);
    }

    public List<ListBean> getClassificationListBean(int pid, int pageNo, int pageSize) throws IOException {
        return classificationDataFactory.getClassificationListBean(pid, pageNo, pageSize);
    }
}

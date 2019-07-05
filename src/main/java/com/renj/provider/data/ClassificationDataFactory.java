package com.renj.provider.data;

import com.renj.provider.bean.ClassificationBean;
import com.renj.provider.bean.ListBean;
import com.renj.provider.utils.CheckUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

    /* ===========================  list 数据 =========================== */

    /**
     * 获取列表的总数和页数
     *
     * @return int[] result[0]：总数 result[1]：页数
     */
    public int[] getListTotalAndPage(int pid, int pageSize) throws IOException {
        return FactoryHelp.getListTotalAndPage(pid, pageSize);
    }

    public List<ListBean> getClassificationListBean(int pid, int pageNo, int pageSize) throws IOException {
        List<ClassificationBean> classificationBean = getClassificationBean();
        String filePath = null;
        for (ClassificationBean bean : classificationBean) {
            if (bean.getId() == pid) {
                filePath = bean.getFile();
                break;
            }
        }
        if (!CheckUtils.isEmpty(filePath))
            filePath = filePath.replace("/", File.separator);
        else // 获取文件失败
            return new ArrayList<>();

        return FactoryHelp.getListBeanList(pid, filePath, pageNo, pageSize);
    }
}

package com.renj.provider.data;

import com.renj.provider.bean.ClassificationBean;
import com.renj.provider.bean.ListBean;
import com.renj.provider.utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-04  20:10
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class FactoryHelp {
    /**
     * 获取分类项
     *
     * @return
     * @throws IOException
     */
    static List<ClassificationBean> getClassificationBean() throws IOException {
        List<ClassificationBean> classificationBeans = FileUtils.readFileToListBean("classification.data", ClassificationBean.class);
        return classificationBeans;
    }

    /**
     * 获取列表的总数和页数
     *
     * @param pid      父ID
     * @param pageSize 每页大小
     * @return int[] result[0]：总数 result[1]：页数
     * @throws IOException
     */
    static int[] getListTotalAndPage(int pid, int pageSize) throws IOException {
        int[] result = new int[2];
        List<ClassificationBean> classificationBean = getClassificationBean();
        for (ClassificationBean bean : classificationBean) {
            if (bean.id == pid) {
                result[0] = bean.total;
                if (bean.total % pageSize == 0)
                    result[1] = bean.total / pageSize;
                else
                    result[1] = bean.total / pageSize + 1;
            }
        }
        return result;
    }

    static List<ListBean> createListBeanList(int pid,String fileDir,int pageNo, int pageSize) throws IOException {
        int[] listTotalAndPage = getListTotalAndPage(pid,pageSize);
        int total = listTotalAndPage[0];

        // 从文件结尾处开始取数据
        int endIndex = total - pageNo * pageSize;
        int startIndex = endIndex + pageSize;

        if (startIndex < 0 || startIndex > total)
            startIndex = total;

        if (endIndex < 0 || endIndex > total)
            endIndex = startIndex - 10;

        if (endIndex < 0)
            endIndex = 0;

        List<ListBean> listBeans = FileUtils.readFileToListBean(fileDir + File.separator + "list.data", startIndex, endIndex, ListBean.class);
        return listBeans;
    }
}

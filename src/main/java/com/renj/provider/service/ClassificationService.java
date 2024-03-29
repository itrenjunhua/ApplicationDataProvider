package com.renj.provider.service;

import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.common.ApplicationCommon;
import com.renj.provider.config.MyException;
import com.renj.provider.dao.ClassificationDao;
import com.renj.provider.utils.ResponseFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-04   17:15
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@Service
public class ClassificationService {
    private ClassificationDao classificationDao;

    public ClassificationService() {
        this.classificationDao = new ClassificationDao();
    }

    public BaseResponseBean getClassificationBean(){
        try {
            return ResponseFactory.successResponse(classificationDao.getClassificationBean());
        } catch (IOException e) {
            e.printStackTrace();
            throw new MyException(ApplicationCommon.CODE_HANDLER_EXCEPTION, ApplicationCommon.MESSAGE_HANDLER_EXCEPTION);
        }
    }

    public BaseResponseBean getClassificationListBean(int pid, int pageNo, int pageSize) {
        try {
            return ServiceHelp.getListBean(classificationDao.getListTotalAndPage(pid,pageSize),classificationDao.getClassificationListBean(pid, pageNo, pageSize));
        } catch (IOException e) {
            e.printStackTrace();
            throw new MyException(ApplicationCommon.CODE_HANDLER_EXCEPTION, ApplicationCommon.MESSAGE_HANDLER_EXCEPTION);
        }
    }
}

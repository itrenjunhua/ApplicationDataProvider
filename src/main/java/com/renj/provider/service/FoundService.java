package com.renj.provider.service;

import com.renj.provider.bean.FoundBean;
import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.common.ApplicationCommon;
import com.renj.provider.config.MyException;
import com.renj.provider.dao.FoundDao;
import com.renj.provider.utils.ResponseFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-06  18:51
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@Service
public class FoundService {
    private FoundDao foundDao;

    public FoundService() {
        foundDao = new FoundDao();
    }

    public BaseResponseBean foundData() {
        try {
            FoundBean foundBean = new FoundBean();
            foundBean.setBanners(foundDao.getBannerList());
            foundBean.setBeanList(foundDao.getListBeanList());
            return ResponseFactory.successResponse(foundBean);
        } catch (IOException e) {
            e.printStackTrace();
            throw new MyException(ApplicationCommon.CODE_HANDLER_EXCEPTION, ApplicationCommon.MESSAGE_HANDLER_EXCEPTION);
        }
    }
}

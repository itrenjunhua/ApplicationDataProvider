package com.renj.provider.service;

import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.dao.CSDNDao;
import com.renj.provider.utils.ResponseFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-06-28   14:58
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@Service
public class CSDNService {
    private CSDNDao csdnDao;

    public CSDNService() {
        csdnDao = new CSDNDao();
    }

    public BaseResponseBean csdnBannerAndNotices() {
        try {
            return ServiceHelp.getBannerAndNotices(csdnDao.getBannerList(), csdnDao.getNoticeBeanList());
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseFactory.handlerExceptionResponse();
        }
    }

    public BaseResponseBean csdnList(int pageNo, int pageSize) {
        try {
            return ServiceHelp.getListBean(csdnDao.getListTotalAndPage(pageSize), csdnDao.getListBeanList(pageNo, pageSize));
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseFactory.handlerExceptionResponse();
        }
    }
}

package com.renj.provider.service;

import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.dao.CSDNDao;
import com.renj.provider.utils.ResponseFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
    private CSDNDao CSDNDao;

    public CSDNService() {
        CSDNDao = new CSDNDao();
    }

    public BaseResponseBean csdnBannerAndNotices() {
        Map<String, Object> map = new HashMap<>();
        try {
            map.put("banner", CSDNDao.createBannerList());
            map.put("notice", CSDNDao.createNoticeBeanList());
            return ResponseFactory.successResponse(map);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseFactory.handlerExceptionResponse();
        }
    }

    public BaseResponseBean csdnList(int pageNo, int pageSize) {
        return ResponseFactory.listResponse(CSDNDao.getListTotal(), CSDNDao.getListPage(pageSize), CSDNDao.createListBeanList(pageNo, pageSize));
    }
}

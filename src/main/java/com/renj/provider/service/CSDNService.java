package com.renj.provider.service;

import com.renj.provider.bean.BaseResponseBean;
import com.renj.provider.bean.ResponseResultType;
import com.renj.provider.dao.CSDNDao;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
        Random random = new Random();
        Map<String, Object> map = new HashMap<>();
        map.put("banner", CSDNDao.createBannerList(random.nextInt(6) + 1));
        map.put("notice", CSDNDao.createNoticeBeanList(random.nextInt(5) + 1));
        return new BaseResponseBean(ResponseResultType.CODE_SUCCESS, ResponseResultType.MESSAGE_SUCCESS, map);
    }

    public BaseResponseBean csdnList(int pageNo, int pageSize) {
        return new BaseResponseBean(ResponseResultType.CODE_SUCCESS, ResponseResultType.MESSAGE_SUCCESS, CSDNDao.createListBeanList(pageNo,pageSize));
    }
}
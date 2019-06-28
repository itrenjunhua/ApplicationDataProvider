package com.renj.provider.service;

import com.renj.provider.bean.BaseResponseBean;
import com.renj.provider.bean.ResponseResultType;
import com.renj.provider.dao.HomeDao;
import org.springframework.stereotype.Service;

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
public class HomeService {
    private HomeDao homeDao;

    public HomeService() {
        homeDao = new HomeDao();
    }

    public BaseResponseBean homeData() {
        Map<String, Object> map = new HashMap<>();
        map.put("banner", homeDao.createBannerList(4));
        map.put("notice", homeDao.createNoticeBeanList(4));
        map.put("list", homeDao.createListBeanList(8));

        return new BaseResponseBean(ResponseResultType.CODE_SUCCESS, ResponseResultType.MESSAGE_SUCCESS, map);
    }
}

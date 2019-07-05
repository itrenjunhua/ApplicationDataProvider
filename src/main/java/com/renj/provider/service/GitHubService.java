package com.renj.provider.service;

import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.common.ApplicationCommon;
import com.renj.provider.config.MyException;
import com.renj.provider.dao.GitHubDao;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-01   11:29
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@Service
public class GitHubService {
    private GitHubDao gitHubDao;

    public GitHubService() {
        this.gitHubDao = new GitHubDao();
    }

    public BaseResponseBean githubBannerAndNotices() {
        try {
            return ServiceHelp.getBannerAndNotices(gitHubDao.getBannerList(), gitHubDao.getNoticeBeanList());
        } catch (IOException e) {
            e.printStackTrace();
            throw new MyException(ApplicationCommon.CODE_HANDLER_EXCEPTION, ApplicationCommon.MESSAGE_HANDLER_EXCEPTION);
        }
    }

    public BaseResponseBean githubList(int pageNo, int pageSize) {
        try {
            return ServiceHelp.getListBean(gitHubDao.getListTotalAndPage(pageSize), gitHubDao.getListBeanList(pageNo, pageSize));
        } catch (IOException e) {
            e.printStackTrace();
            throw new MyException(ApplicationCommon.CODE_HANDLER_EXCEPTION, ApplicationCommon.MESSAGE_HANDLER_EXCEPTION);
        }
    }
}

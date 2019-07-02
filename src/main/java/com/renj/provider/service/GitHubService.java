package com.renj.provider.service;

import com.renj.provider.bean.BaseResponseBean;
import com.renj.provider.bean.ResponseResultType;
import com.renj.provider.dao.GitHubDao;
import org.springframework.stereotype.Service;

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

    public BaseResponseBean githubList(int pageNo, int pageSize) {
        return new BaseResponseBean(ResponseResultType.CODE_SUCCESS, ResponseResultType.MESSAGE_SUCCESS, gitHubDao.createListBeanList(pageNo,pageSize));
    }
}

package com.renj.provider.controller;

import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.service.GitHubService;
import com.renj.provider.utils.ResponseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-01   13:39
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@RestController
@RequestMapping("/github")
public class GitHubController {
    @Autowired
    private GitHubService gitHubService;

    @GetMapping("/index")
    public BaseResponseBean csdnBannerAndNotices() {
        return gitHubService.githubBannerAndNotices();
    }

    @GetMapping("/list")
    public BaseResponseBean githubList(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize) {
        if (pageNo <= 0 || pageSize <= 0)
            return ResponseFactory.paramsExceptionResponse();
        return gitHubService.githubList(pageNo, pageSize);
    }
}

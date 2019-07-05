package com.renj.provider.controller;

import com.renj.provider.bean.ListBean;
import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.service.GitHubService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
@Api(tags = "我的GitHub页面接口")
@RestController
@RequestMapping("/app/github")
public class GitHubController {
    @Autowired
    private GitHubService gitHubService;

    @ApiOperation("获取我的GitHub页面banner数据和公告数据")
    @GetMapping("/index")
    public BaseResponseBean csdnBannerAndNotices(HttpServletRequest request) {
        return gitHubService.githubBannerAndNotices();
    }

    @ApiOperation("获取我的GitHub页面列表数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo", value = "页数", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", paramType = "query", required = true)
    })
    @GetMapping("/list")
    public BaseResponseBean<ListBean> githubList(HttpServletRequest request,
                                                 @RequestParam("pageNo") Integer pageNo,
                                                 @RequestParam("pageSize") Integer pageSize) {
        return gitHubService.githubList(pageNo, pageSize);
    }
}

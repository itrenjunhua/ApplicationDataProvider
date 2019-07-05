package com.renj.provider.controller;

import com.renj.provider.bean.ListBean;
import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.service.CSDNService;
import com.renj.provider.utils.ResponseFactory;
import com.renj.provider.utils.TokenManager;
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
 * 创建时间：2019-06-28   13:44
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@Api(tags = "我的CSDN页面接口")
@RestController
@RequestMapping("/csdn")
public class CSDNController {

    @Autowired
    private CSDNService csdnService;

    @ApiOperation("获取我的CSDN页面banner数据和公告数据")
    @GetMapping("/index")
    public BaseResponseBean csdnBannerAndNotices(HttpServletRequest request) {
        if (!TokenManager.getInstance().tokenCheck(request))
            return ResponseFactory.tokenExceptionResponse();

        return csdnService.csdnBannerAndNotices();
    }

    @ApiOperation("获取我的CSDN页列表数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo", value = "页数", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", paramType = "query", required = true)
    })
    @GetMapping("/list")
    public BaseResponseBean<ListBean> csdnList(HttpServletRequest request,
                                               @RequestParam("pageNo") Integer pageNo,
                                               @RequestParam("pageSize") Integer pageSize) {
        if (!TokenManager.getInstance().tokenCheck(request))
            return ResponseFactory.tokenExceptionResponse();

        if (pageNo <= 0 || pageSize <= 0)
            return ResponseFactory.paramsExceptionResponse();
        return csdnService.csdnList(pageNo, pageSize);
    }
}

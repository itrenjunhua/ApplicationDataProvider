package com.renj.provider.controller;

import com.renj.provider.bean.ClassificationBean;
import com.renj.provider.bean.ListBean;
import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.service.ClassificationService;
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
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-04   17:19
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@Api(tags = "分类列表接口")
@RestController
@RequestMapping("/classification")
public class ClassificationController {
    @Autowired
    private ClassificationService classificationService;

    @ApiOperation("获取分类列表")
    @GetMapping("/index")
    public BaseResponseBean<ClassificationBean> classificationBean(HttpServletRequest request) {
        if (!TokenManager.getInstance().tokenCheck(request))
            return ResponseFactory.tokenExceptionResponse();

        return classificationService.getClassificationBean();
    }

    @ApiOperation("获取分类页列表数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pid", value = "分类父id", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "pageNo", value = "页数", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", paramType = "query", required = true)
    })
    @GetMapping("/list")
    public BaseResponseBean<ListBean> getClassificationListBean(HttpServletRequest request,
                                                                @RequestParam("pid") Integer pid,
                                                                @RequestParam("pageNo") Integer pageNo,
                                                                @RequestParam("pageSize") Integer pageSize) {
        if (!TokenManager.getInstance().tokenCheck(request))
            return ResponseFactory.tokenExceptionResponse();

        if (pageNo <= 0 || pageSize <= 0)
            return ResponseFactory.paramsExceptionResponse();

        return classificationService.getClassificationListBean(pid, pageNo, pageSize);
    }
}

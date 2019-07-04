package com.renj.provider.controller;

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
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "token", dataType = "String", paramType = "query", required = true)
    })
    @GetMapping("/index")
    public BaseResponseBean classificationBean(HttpServletRequest request) {
        if (!TokenManager.getInstance().tokenCheck(request))
            return ResponseFactory.tokenExceptionResponse();

        return classificationService.getClassificationBean();
    }
}

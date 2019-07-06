package com.renj.provider.controller;

import com.renj.provider.bean.FoundBean;
import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.service.FoundService;
import io.swagger.annotations.Api;
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
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-06  18:55
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@Api(tags = "发现页面接口")
@RestController
@RequestMapping("/app/found")
public class FoundController {
    @Autowired
    private FoundService foundService;

    @ApiOperation("获取我的CSDN页面banner数据和公告数据")
    @GetMapping("/index")
    public BaseResponseBean<FoundBean> foundData(HttpServletRequest request) {
        return foundService.foundData();
    }
}

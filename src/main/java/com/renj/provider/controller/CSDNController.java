package com.renj.provider.controller;

import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.bean.base.ResponseResultType;
import com.renj.provider.service.CSDNService;
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
 * 创建时间：2019-06-28   13:44
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@RestController
@RequestMapping("/csdn")
public class CSDNController {

    @Autowired
    private CSDNService CSDNService;

    @GetMapping("/index")
    public BaseResponseBean csdnBannerAndNotices() {
        return CSDNService.csdnBannerAndNotices();
    }

    @GetMapping("/list")
    public BaseResponseBean csdnList(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize) {
        if (pageNo <= 0 || pageSize <= 0)
            return new BaseResponseBean(ResponseResultType.CODE_PARAMS_EXCEPTION, ResponseResultType.MESSAGE_PARAMS_EXCEPTION, null);
        return CSDNService.csdnList(pageNo, pageSize);
    }
}

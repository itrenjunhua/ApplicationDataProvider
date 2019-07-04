package com.renj.provider.controller;

import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequestMapping("/classification")
public class ClassificationController {
    @Autowired
    private ClassificationService classificationService;

    @GetMapping("/index")
    public BaseResponseBean classificationBean() {
        return classificationService.getClassificationBean();
    }
}

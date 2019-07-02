package com.renj.provider.controller;

import com.renj.provider.bean.BaseResponseBean;
import com.renj.provider.service.ListService;
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
@RequestMapping("/list")
public class ListController {
    @Autowired
    private ListService listService;

    @GetMapping("/data")
    public BaseResponseBean listData(@RequestParam Integer size){
        return listService.listData(size);
    }
}

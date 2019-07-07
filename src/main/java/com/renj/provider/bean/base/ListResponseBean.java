package com.renj.provider.bean.base;

import com.renj.provider.common.ApplicationCommon;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-204  00:56
 * <p>
 * 描述：专门为列表提供的响应类
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@ApiModel
@Getter
@Setter
public class ListResponseBean<T> extends BaseResponseBean<Map> {
    public ListResponseBean(int total, int page, T list) {
        Map<String, Object> map = new HashMap<>();
        map.put("total", total);
        map.put("page", page);
        map.put("list", list);
        setCode(ApplicationCommon.CODE_SUCCESS);
        setMessage(ApplicationCommon.MESSAGE_SUCCESS);
        setData(map);
    }
}

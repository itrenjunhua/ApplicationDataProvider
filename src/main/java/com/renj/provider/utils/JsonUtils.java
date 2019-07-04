package com.renj.provider.utils;

import com.google.gson.Gson;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-04   16:36
 * <p>
 * 描述：json 工具类
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class JsonUtils {
    public static <T> T jsonToBean(String json, Class<T> clazz) {
        Gson gson = new Gson();
        return gson.fromJson(json, clazz);
    }

    public static <T> String beanToJson(Class<T> clazz) {
        Gson gson = new Gson();
        return gson.toJson(clazz);
    }
}

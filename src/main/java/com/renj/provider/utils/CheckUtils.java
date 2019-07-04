package com.renj.provider.utils;

import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-06-28   14:59
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class CheckUtils {
    public static boolean isEmpty(String string) {
        return string == null || string.length() == 0;
    }

    public static boolean isNull(Object object) {
        return object == null;
    }

    public static boolean isNull(Object... objects) {
        if (objects == null) return true;

        for (Object object : objects) {
            if (isNull(object)) return true;
        }
        return false;
    }

    public static boolean isEmpty(List list) {
        return list == null || list.isEmpty();
    }
}

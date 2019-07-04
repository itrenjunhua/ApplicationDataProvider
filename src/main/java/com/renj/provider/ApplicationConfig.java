package com.renj.provider;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-04   17:40
 * <p>
 * 描述：
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public interface ApplicationConfig {
    /**
     * 数据根目录
     */
    String ROOT_DIR = "data";

    /**
     * token缓存更新间隔时间
     */
    long TOKEN_REFRESH_TIME = 1000 * 60;
}

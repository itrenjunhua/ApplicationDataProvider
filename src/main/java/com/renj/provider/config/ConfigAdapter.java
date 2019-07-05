package com.renj.provider.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-05   15:38
 * <p>
 * 描述：拦截器配置
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@Configuration
public class ConfigAdapter implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new TokenInterceptor())
                .addPathPatterns("/app/**");
        // 排除拦截路径
        // .excludePathPatterns("");

        registry.addInterceptor(new ParamsInterceptor())
                .addPathPatterns("/**/list");
    }

}

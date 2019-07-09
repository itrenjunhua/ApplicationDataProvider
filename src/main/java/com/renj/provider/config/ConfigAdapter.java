package com.renj.provider.config;

import com.renj.provider.common.ApplicationCommon;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

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

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        /**
         *  /source/xxx   指文件的访问方式  如：localhost:8080/source/abc.wav
         *  file:d/voice/  指静态文件存放在服务器上的位置
         */
        File resourceFile = new File(ApplicationCommon.ROOT_DIR_IMAGES);
        registry.addResourceHandler("/source/**").addResourceLocations("file:" + resourceFile.getAbsolutePath() + File.separator);
    }

}

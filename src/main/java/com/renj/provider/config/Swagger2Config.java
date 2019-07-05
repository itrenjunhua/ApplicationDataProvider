package com.renj.provider.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：itrenjunhua@163.com
 * <p>
 * 创建时间：2019-07-05  01:59
 * <p>
 * 描述：Swagger2 配置
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Value("${swagger2.enable}")
    private boolean swagger2Enable;

    @Bean
    public Docket createRestApi() {
        // ---------------- 添加head参数start ---------------- //
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        tokenPar.name("token")
                .description("AccessToken令牌")
                .modelRef(new ModelRef("string"))
                .parameterType("header").required(false)
                .build();
        pars.add(tokenPar.build());
        // ---------------- 添加head参数end ---------------- //

        return new Docket(DocumentationType.SWAGGER_2)
                .enable(swagger2Enable)
                .apiInfo(apiInfo())
                .select()
                // 扫描指定包中的swagger注解
                // .apis(RequestHandlerSelectors.basePackage("com.renj.provider.bean"))
                // 扫描所有有注解的api
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBoot利用Swagger构建API文档")
                .description("我的应用数据提供服务器")
                .termsOfServiceUrl("https://github.com/itrenjunhua/ApplicationDataProvider")
                .version("1.0.0")
                .build();
    }

    @Bean
    UiConfiguration uiConfig() {
        return new UiConfiguration(true, false, -1, -1,
                ModelRendering.MODEL, true, DocExpansion.LIST, null, null,
                OperationsSorter.ALPHA, true, TagsSorter.ALPHA, null);
    }
}

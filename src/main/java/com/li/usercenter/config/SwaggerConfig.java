package com.li.usercenter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
@EnableOpenApi
public class SwaggerConfig {
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(myApiInfo())
                .select()
                // 接口扫描包
                .apis(RequestHandlerSelectors.basePackage("com.li.usercenter.controller"))
                .build();
    }

    private ApiInfo myApiInfo() {
        return new ApiInfo(
                "随便搞搞Api", //标题
                "随便搞搞", // 描述
                "v1.0", //版本
                "", //团队url
                // 联系信息
                new Contact("quake", "https://www.baidu.com/", "1234@qq.com"),
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<VendorExtension>()
        );
    }
}

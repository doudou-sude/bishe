package com.hsh.hsh.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("hanshuhang实习项目")
                        .version("1.0")
                        .description("hanshuhang接口文档")
                        .contact(new Contact().name("hanshuhang").url("www.hsh.com")));
    }
}

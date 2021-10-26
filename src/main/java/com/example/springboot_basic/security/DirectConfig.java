package com.example.springboot_basic.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class DirectConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 패스 변경하기 : /test -> /hello
        registry.addRedirectViewController("/test", "hello");

        // view path 설정하기
        registry.addViewController("/hello").setViewName("sequrity/hello");
        registry.addViewController("/my").setViewName("sequrity/my");
    }
}

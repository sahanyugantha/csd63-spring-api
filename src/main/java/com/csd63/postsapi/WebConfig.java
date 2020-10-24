package com.csd63.postsapi;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/**") // wildcard for all origins -> "/**"
                .allowedOrigins("http://localhost:3000","http://localhost:8080")// wildcard for all origins -> "*"
                .allowedMethods("*"); //"HEAD", "GET", "PUT", "POST", "DELETE", "PATCH"
    }

    // registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE");
}

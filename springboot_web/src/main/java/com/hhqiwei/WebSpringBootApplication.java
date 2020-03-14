package com.hhqiwei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.hhqiwei.entity.mapper")
@SpringBootApplication
public class WebSpringBootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WebSpringBootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebSpringBootApplication.class,args);
    }
}

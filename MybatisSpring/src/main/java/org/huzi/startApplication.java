package org.huzi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"org.huzi.dao"})
public class startApplication {
    public static void main(String[] args) {
        SpringApplication.run(startApplication.class, args);
    }
}

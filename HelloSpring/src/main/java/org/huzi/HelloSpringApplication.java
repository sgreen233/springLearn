package org.huzi;

import cn.hutool.core.util.StrUtil;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringApplication {

    @GetMapping("hello")
    public String hello(@RequestParam(required = false, name = "who")String who) {
        return StrUtil.format("Hello Spring {}", who);
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }
}
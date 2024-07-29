package org.huzi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringApplication {

    @GetMapping("/spring")
    public String spring() {
        return "spring";
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
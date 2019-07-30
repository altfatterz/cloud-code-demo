package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class CloudCodeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudCodeDemoApplication.class, args);
    }

    @GetMapping("/")
    public String greeting() {
        log.info("'/' endpoint invoked");
        return "Hello world!!";
    }
}

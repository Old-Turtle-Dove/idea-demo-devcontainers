package com.example.ideademodevcontainers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class IdeaDemoDevcontainersApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdeaDemoDevcontainersApplication.class, args);
    }

}

@RestController
@RequestMapping
class TestController {

    @GetMapping("test")
    public String map(){
        return "ab";
    }
}
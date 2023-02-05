package com.example.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SearchPossessionBrandController {

    public static void main(String[] args) {
        SpringApplication.run(SearchPossessionBrandController.class, args);
    }

    @GetMapping("/search")
    public String hello() {
        return "hello world";
    }

}

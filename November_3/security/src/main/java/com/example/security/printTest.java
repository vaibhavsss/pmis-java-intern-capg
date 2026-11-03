package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class printTest {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, Vlad! Your authenticated.";
    }
}

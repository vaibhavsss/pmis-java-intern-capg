package com.example.springDemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
public class test {
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    @GetMapping("/my-name")
    public String printName() {
        return "Harry";
        }
}

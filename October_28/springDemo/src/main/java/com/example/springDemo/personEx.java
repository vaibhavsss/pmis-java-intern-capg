package com.example.springDemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
public class personEx {   
    @GetMapping("/voting")
    public String canVote(@RequestParam int age) {
        if (age >= 18) {
            return "Eligible to vote";
        } else {
            return "Not eligible to vote";
        }
    }
}

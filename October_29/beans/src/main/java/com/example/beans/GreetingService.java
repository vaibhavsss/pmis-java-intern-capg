package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public String greet(String name){
        return "Welcome, " + name + "!";
    }
}

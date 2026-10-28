package com.example.springDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class evenOdd {
    @GetMapping ("/grading")
    public String graded(@RequestParam int marks) {
        if (marks >= 90){
            return "Grade A";
        } else if (marks >= 60 && marks <= 90) {
            return "Grade B";
        } else if (marks >= 40 && marks <= 60) {
            return "Grade C";
        } else if (marks >= 20 && marks <= 40) {
            return "Grade D";
        } else{
            return "Fail";
        }
    }
}

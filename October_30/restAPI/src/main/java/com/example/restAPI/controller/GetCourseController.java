package com.example.restAPI.controller;

import com.example.restAPI.entity.Course;
import com.example.restAPI.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class GetCourseController {
    private final CourseService courseService;

    public GetCourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses/{id}")
    public ResponseEntity<Course> getCourse(@PathVariable("id") Long courseId){
        Course course = courseService.getCourseById(courseId);

        if(course == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(course);
    }
}

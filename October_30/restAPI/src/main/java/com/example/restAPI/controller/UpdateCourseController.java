package com.example.restAPI.controller;

import com.example.restAPI.entity.Course;
import com.example.restAPI.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class UpdateCourseController {

    private final CourseService courseService;

    public UpdateCourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PutMapping("/{courseId}")
    public ResponseEntity<Course> updateCourse(
            @RequestBody Course courseDetails,
            @PathVariable Long courseId) {

        Course updatedCourse = courseService.updateCourse(courseId, courseDetails);

        if (updatedCourse == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.ok(updatedCourse);
    }
}

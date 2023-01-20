package com.github.alanaafsc.crudspring.controller;

import com.github.alanaafsc.crudspring.repository.CourseRepository;
import com.github.alanaafsc.crudspring.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public @ResponseBody List<Course> list() {

        return courseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {

       // System.out.println(course.getName());
       return courseRepository.save(course);
    }
}

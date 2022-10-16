package com.study.study.controller;

import com.study.study.domain.Course;
import com.study.study.domain.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping("/api/courses")
    public List<Course> getCourses() { // Course의 List를 반환하라는 메소드
        return courseRepository.findAll();
    }
}

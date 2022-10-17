package com.study.study.controller;

import com.study.study.domain.Course;
import com.study.study.domain.CourseRepository;
import com.study.study.domain.CourseRequestDto;
import com.study.study.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CourseController {
    private final CourseRepository courseRepository;

    private final CourseService courseService;

    // PostMapping을 통해서, 같은 주소라도 방식이 다름을 구분합니다.
    @PostMapping("/api/courses")
    public Course createCourse(@RequestBody CourseRequestDto requestDto) {
        // requestDto 는, 생성 요청을 의미합니다.
        // 강의 정보를 만들기 위해서는 강의 제목과 튜터 이름이 필요하잖아요?
        // 그 정보를 가져오는 녀석입니다.

        // 저장하는 것은 Dto가 아니라 Course이니, Dto의 정보를 course에 담아야 합니다.
        // 잠시 뒤 새로운 생성자를 만듭니다.
        Course course = new Course(requestDto);

        // JPA를 이용하여 DB에 저장하고, 그 결과를 반환합니다.
        return courseRepository.save(course);
    }

    @GetMapping("/api/courses")
    public List<Course> getCourses() { // Course의 List를 반환하라는 메소드
        return courseRepository.findAll();
    }

    @PutMapping("/api/courses/{id}")
    public Long updateCourse(@PathVariable Long id, @RequestBody CourseRequestDto courseRequestDto) {
        return courseService.update(id, courseRequestDto);
    }
}

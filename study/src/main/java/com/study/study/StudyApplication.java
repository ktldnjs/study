package com.study.study;

import com.study.study.domain.Course;
import com.study.study.domain.CourseRepository;
import com.study.study.domain.CourseRequestDto;
import com.study.study.service.CourseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class StudyApplication {
	public static void main(String[] args){
		SpringApplication.run(StudyApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CourseRepository courseRepository, CourseService courseService) {
		return (args) -> {
			courseRepository.save(new Course("프론트엔드의 꽃, 리액트", "김시원"));

			System.out.println("데이터 인쇄");
			List<Course> courseList = courseRepository.findAll();
			for (int i=0; i<courseList.size(); i++) {
				Course course = courseList.get(i);
				System.out.println(course.getId());
				System.out.println(course.getTitle());
				System.out.println(course.getTutor());
			}

			CourseRequestDto requestDto = new CourseRequestDto("웹개발의 봄, Spring", "김시원");
			courseService.update(1L, requestDto);
			courseList = courseRepository.findAll();
			for (int i=0; i<courseList.size(); i++) {
				Course course = courseList.get(i);
				System.out.println(course.getId());
				System.out.println(course.getTitle());
				System.out.println(course.getTutor());
			}
		};
	}
}

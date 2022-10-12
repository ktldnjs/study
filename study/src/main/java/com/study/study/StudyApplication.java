package com.study.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StudyApplication {

	// printInfo 가 메소드임.
	public static void printInfo() {
		String title = "Spring";
		String tutor = "김시원";
		int weeks = 5;
		float ratings = 5.0f;

		System.out.println("제목: " + title);
		System.out.println("튜터: " + tutor);
		System.out.println("주차: " + weeks);
		System.out.println("별점: " + ratings);
	}

	public static void main(String[] args) {
		printInfo();
		printInfo();
		printInfo();
		printInfo();
		printInfo();
	}

}

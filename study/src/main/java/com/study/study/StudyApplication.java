package com.study.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) {
		// 문자열이 많이 들어간 list 생성
		List<String> myList = new ArrayList<>();
		String word1 = "spring";
		String word2 = "react";
		myList.add(word1);
		myList.add(word2);
		System.out.println(myList);
		System.out.println(myList.get(1));
		myList.remove(1);
		System.out.println(myList);
	}

}

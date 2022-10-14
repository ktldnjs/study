package com.study.study.prac;

public class Prac {

    public static void main(String[] args){
        String title = "웹개발";
        String tutor = "김시원";
        int days = 30;
        Course course = new Course(title, tutor, days);
        System.out.println(course.title);
        System.out.println(course.tutor);
        System.out.println(course.days);
    }

}

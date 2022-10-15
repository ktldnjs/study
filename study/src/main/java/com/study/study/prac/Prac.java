package com.study.study.prac;

public class Prac {

    public static void main(String[] args){
        String title = "웹개발";
        String tutor = "김시원";
        int days = 30;
        Course course = new Course(title, tutor, days);
        course.setTitle(title);
        course.setTutor(tutor);
        course.setDays(days);
        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());
    }

}

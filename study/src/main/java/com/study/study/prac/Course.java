package com.study.study.prac;

public class Course {
    public String title;
    public String tutor;
    public int days;

    // 기본생성자
    public Course(){

    }

    // 생성자
    public Course(String title, String tutor, int days){
        this.title = title;
        this.tutor = tutor;
        this.days = days;
        // this. 이걸 안해주면 값이 null로 나옴.
    }
}

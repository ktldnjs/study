package com.study.study.prac;

public class TutorApp {
    public static void main(String[] args){
        String name = "김시원";
        int bio = 3;
        Tutor tutor = new Tutor(name, bio); // 이걸 쓰려면 클래스에 생성자를 추가해줘야함!! 원래 기본생성자는 파라미터 없는거니까.
        System.out.println(tutor.name);
        System.out.println((tutor.bio));
    }
}

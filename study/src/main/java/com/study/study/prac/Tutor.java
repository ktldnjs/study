package com.study.study.prac;



public class Tutor {
    private String name;
    private int bio;

    public Tutor(String name, int bio) {
        this.name = name;
        this.bio = bio;
    }

    // Getter
    public String getName(){
        return this.name;
    }
    public int getBio(){
        return this.bio;
    }
}

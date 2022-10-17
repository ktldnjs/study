package com.study.study.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
// @Setter 이제 setName 같은거 쓸 일 없으니까 필요없음(Post로 작성할거니까)
@Entity
@NoArgsConstructor // 기본생성자
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String address;

    public Person(PersonRequestDto personRequestDto){
        this.name = personRequestDto.getName();
        this.age = personRequestDto.getAge();
        this.address = personRequestDto.getAddress();
    }

    public void update(PersonRequestDto personRequestDto){
        this.name = personRequestDto.getName();
        this.age = personRequestDto.getAge();
        this.address = personRequestDto.getAddress();
    }
}

package com.study.study.controller;

import com.study.study.domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPersons() {
        Person person = new Person();
        person.setName("김시원");
        person.setAge(25);
        person.setAddress("서울");
        return person;
    }
}

package com.study.study.controller;

import com.study.study.domain.Person;
import com.study.study.domain.PersonRepository;
import com.study.study.domain.PersonRequestDto;
import com.study.study.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;
    private final PersonService personService;

    @GetMapping("/api/persons")
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    @PostMapping("/api/persons")
    public Person createPersons(@RequestBody PersonRequestDto personRequestDto){
        Person person = new Person(personRequestDto);

        return personRepository.save(person);
    }

    @PutMapping("/api/persons/{id}")
    public Person updatePersons(@PathVariable Long id, @RequestBody PersonRequestDto personRequestDto){
        return personService.update(id, personRequestDto);
    }

    @DeleteMapping("/api/persons/{id}")
    public Long deletePersons(@PathVariable Long id){
        personRepository.deleteById(id);
        return id;
    }
}

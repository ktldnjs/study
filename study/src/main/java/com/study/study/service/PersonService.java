package com.study.study.service;

import com.study.study.domain.Person;
import com.study.study.domain.PersonRepository;
import com.study.study.domain.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    @Transactional
    public Person update(Long id, PersonRequestDto personRequestDto){
        Person updatePerson = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디 없음")
        );

        updatePerson.update(personRequestDto);
        return updatePerson;
    }
}

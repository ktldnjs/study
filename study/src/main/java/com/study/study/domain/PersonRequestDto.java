package com.study.study.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PersonRequestDto {
    private final String name;
    private final int age;
    private final String address;
}

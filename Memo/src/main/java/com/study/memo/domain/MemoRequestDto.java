package com.study.memo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemoRequestDto {
    private String username;
    private String contents;
}

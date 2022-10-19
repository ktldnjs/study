package com.study.memo.service;

import com.study.memo.domain.Memo;
import com.study.memo.domain.MemoRepository;
import com.study.memo.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoRepository memoRepository; // final 꼭 적어줘야함

    @Transactional // update된 내용이 DB에 반영되어야한다.
    public Long update(Long id, MemoRequestDto memoRequestDto){
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디 없음")
        );

        memo.update(memoRequestDto);
        return id;
    }
}

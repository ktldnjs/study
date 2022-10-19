package com.study.memo.controller;

import com.study.memo.domain.Memo;
import com.study.memo.domain.MemoRepository;
import com.study.memo.domain.MemoRequestDto;
import com.study.memo.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemoController {

    private final MemoRepository memoRepository;
    private final MemoService memoService;

    @PostMapping("/api/memos")
    public Memo createMemo(@RequestBody MemoRequestDto memoRequestDto){
        Memo memo = new Memo(memoRequestDto);

        return memoRepository.save(memo); // save는 저장한 거 그대로 return 한다.
    }

    @GetMapping("/api/memos")
    public List<Memo> readMemo(){
        return memoRepository.findAllByOrderByModifiedAtDesc();
    }

}

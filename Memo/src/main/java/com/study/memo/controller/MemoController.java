package com.study.memo.controller;

import com.study.memo.domain.Memo;
import com.study.memo.domain.MemoRepository;
import com.study.memo.domain.MemoRequestDto;
import com.study.memo.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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
        LocalDateTime start = LocalDateTime.now().minusDays(1);
        LocalDateTime end = LocalDateTime.now();
        return memoRepository.findAllByModifiedAtBetweenOrderByModifiedAtDesc(start, end);
    }

    @PutMapping("/api/memos/{id}")
    public Long updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto memoRequestDto){
        return memoService.update(id, memoRequestDto);
    }

    @DeleteMapping("/api/memos/{id}")
    public Long deleteMemo(@PathVariable Long id){
        memoRepository.deleteById(id);
        return id;
    }

}

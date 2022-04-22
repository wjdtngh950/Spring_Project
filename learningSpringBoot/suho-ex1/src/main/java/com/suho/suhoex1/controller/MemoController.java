package com.suho.suhoex1.controller;

import com.suho.suhoex1.dto.MemoDto;
import com.suho.suhoex1.dto.MemoRegistDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


@Slf4j
@RestController
@RequestMapping("/api/v1")
public class MemoController {

    @PostMapping("/memos")
    public MemoDto createMemo(
            @RequestBody MemoRegistDto memoRegistDto) {
        log.info("memo"+memoRegistDto.getMemo());
        log.info("name"+memoRegistDto.getName());

        return MemoDto.builder()
                .content(memoRegistDto.getMemo())
                .writer(memoRegistDto.getName())
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();
  }
}

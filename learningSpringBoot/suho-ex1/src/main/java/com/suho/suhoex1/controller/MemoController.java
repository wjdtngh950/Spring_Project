package com.suho.suhoex1.controller;

import com.suho.suhoex1.dto.MemoDto;
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
            @RequestParam(value = "memo")String memo,
            @RequestParam(value = "name") String name
    ){

        return MemoDto.builder()
                .content(memo)
                .writer(name)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();
  }
}

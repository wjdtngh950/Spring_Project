package com.example.ex3.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sample")
@Log4j2

public class SampleController {
    @GetMapping("/ex1")
    public void getEx1() {
        log.info("get ex1.............................");
    }
        //데이터베이스에서 데이터를 읽어서 화면에 보여줄 때
       //게시판 읽을 때나 조회할때

    @PostMapping("/ex1")
    public void postEx1(){
        log.info("post ex1.............................");
    }
    //데이터베이스에 데이터를 넣을 때
    // 글쓰기 버튼을 누르고 글을 등록할 때

    @PutMapping("/ex1")
    public void putEx1(){
        log.info("put ex1.............................");
    }
    //서버에서 수정할 때
    //내가 쓴 글 -> 수정하거나 변경할 때

    @DeleteMapping("/ex1")
    public void deleteEx1(){
      

        // 지울때
        //글 삭제할 때
    }
}

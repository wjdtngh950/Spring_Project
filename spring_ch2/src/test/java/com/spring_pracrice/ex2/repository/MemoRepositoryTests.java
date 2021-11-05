package com.spring_pracrice.ex2.repository;

import com.spring_pracrice.ex2.entity.Memo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testClass(){
        System.out.println(memoRepository.getClass().getName());
    }

    @Test
    public void testInsertDummies(){ //Create

        IntStream.rangeClosed(1,100).forEach(i->{
            Memo memo =Memo.builder().memoText("Sample ...."+i).build();
            memoRepository.save(memo);
        });
    }

    @Test
    public void testSelect(){ //Read
        Long mno =100L;
        Optional<Memo> result = memoRepository.findById(mno);

        System.out.println("=================");

        if(result.isPresent()){
            Memo memo = result.get();
            System.out.println(memo);
        }
    
}

package com.example.test_ex2.repository;

import com.example.test_ex2.entity.Memo;
import org.hibernate.sql.Insert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {
    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testclass(){
        System.out.println(memoRepository.getClass().getName());
    }

    @Test
    public void testInsertDummies(){

        IntStream.rangeClosed(1, 100).forEach(i->{
            Memo memo =Memo.builder().memoText("Sample..."+i).build();
            memoRepository.save(memo);
        });
    }
}

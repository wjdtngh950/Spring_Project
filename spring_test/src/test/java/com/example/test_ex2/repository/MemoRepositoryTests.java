package com.example.test_ex2.repository;

import com.example.test_ex2.entity.Memo;
import org.hibernate.sql.Insert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {
    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testclass() {
        System.out.println(memoRepository.getClass().getName());

    }

   /* @Test
    public void testInsertDummies(){

        IntStream.rangeClosed(1, 100).forEach(i->{
            Memo memo =Memo.builder().memoText("Sample..."+i).build();
            memoRepository.save(memo);
        });
    }*/
    /*@Test
    public void testSelect(){
        Long mno = 100L;
        Optional<Memo> result = memoRepository.findById(mno);
        System.out.println("=================================================");
        if(result.isPresent()){
            Memo memo =result.get();
            System.out.println(mno);
        }
    }*/
   /* @Transactional
    @Test
    public void testSelect2(){
        Long mno = 100L;
        Memo memo = memoRepository.getOne(mno);
        System.out.println("=============================================");
        System.out.println(mno);
    }*/ //이 부분이 안됨
    @Test
    public void testUpdate(){
        Memo memo = Memo.builder().mno(100L).memoText("Update Text").build();

        System.out.println(memoRepository.save(memo));
    }
}
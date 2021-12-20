package com.example.ex4.repository;

import com.example.ex4.entity.Guestbook;
import com.example.ex4.entity.QGuestbook;
import com.querydsl.core.BooleanBuilder;

import com.querydsl.core.types.dsl.BooleanExpression;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class GuestbookRepositoryTests {
    @Autowired
    private GuestbookRepository guestbookRepository;

    @Test
    public void insertDummies(){
        IntStream.rangeClosed(1,300).forEach(i->{
            Guestbook guestbook = Guestbook.builder()
                    .title("Title..." + i)
                    .content("Content..." +i)
                    .writer("user"+(i%10))
                    .build();
            System.out.println(guestbookRepository.save(guestbook));
        });
    }

    @Test
    public void updateTest(){
        Optional<Guestbook> result = guestbookRepository.findById(300L);

        if(result.isPresent()){
            Guestbook guestbook = result.get();
            guestbook.changeTitle("Changed Title.....");
            guestbook.changeContent("Changed Content");

            guestbookRepository.save(guestbook);
        }
    }

    @Test
    public void testQuery1(){

        Pageable pageable = PageRequest.of(0, 10, Sort.by("gno").descending());

        QGuestbook qGuestbook = QGuestbook.guestbook; //1

        String keyword = "1";

        String username = "user0";

        BooleanBuilder builder = new BooleanBuilder(); //2

        BooleanExpression expression1 = qGuestbook.title.contains(keyword); //3
        BooleanExpression expression2 = qGuestbook.writer.contains(username);

        builder.and(expression1); //4

        builder.and(expression2);

        Page<Guestbook> result = guestbookRepository.findAll(builder, pageable); //5

        result.stream().forEach(guestbook -> {
            System.out.println(guestbook);
        });
    }
}

package com.example.ex4.service;

import com.example.ex4.dto.GuestbookDTO;
import com.example.ex4.entity.Guestbook;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class GuestbookServiceImpl implements GuestbookService{

    @Override
    public Long register(GuestbookDTO dto) {

        log.info("DTO--------------------------");
        log.info(dto);

        Guestbook entity = dtoToEntity(dto);

        log.info(entity);
        return null;
    }
}

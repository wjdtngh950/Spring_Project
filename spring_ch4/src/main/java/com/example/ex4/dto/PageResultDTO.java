package com.example.ex4.dto;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Data
public class PageResultDTO<DTO, EN> {

    //DTO 리스트
    private List<DTO> dtoList;

    //총 페이지 번호
    private int page;
    //목록 사이즈
    private int size;

    //시작 페이지번호, 끝 페이지번호

    private List<DTO> dtoList;
    public PageResultDTO(Page<EN> result, Function<EN, DTO> fn){

        dtoList = result.stream().map(fn).collect(Collectors.toList());
    }
}

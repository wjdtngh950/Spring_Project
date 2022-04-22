package com.suho.suhoex1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemoDto {
    private String content;
    private String writer;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}

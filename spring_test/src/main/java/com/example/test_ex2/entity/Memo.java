package com.example.test_ex2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memo;
   @Column(length = 200, nullable = false)
    private String memoText;
}

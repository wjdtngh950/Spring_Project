package com.example.test_ex2.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "tbl_memo")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter


public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;
    @Column(length = 200, nullable = false)
    private String memoText;

}

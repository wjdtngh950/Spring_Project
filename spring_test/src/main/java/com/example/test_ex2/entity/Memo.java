package com.example.test_ex2.entity;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString
public class Memo {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memo;
}

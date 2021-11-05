package com.spring_pracrice.ex2.repository;

import com.spring_pracrice.ex2.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {

}

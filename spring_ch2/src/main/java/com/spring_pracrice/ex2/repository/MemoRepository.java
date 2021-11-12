package com.spring_pracrice.ex2.repository;

import com.spring_pracrice.ex2.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findByMnoGreaterThanEqualOrderByMnoDesc(Long form);


}

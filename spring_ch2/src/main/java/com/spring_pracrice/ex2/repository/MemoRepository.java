package com.spring_pracrice.ex2.repository;

import com.spring_pracrice.ex2.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findByMnoGreaterThanEqualOrderByMnoDesc(Long form);
    @Query("select m from Memo m order by m.mno desc")
    List<Memo> getListDesc();


}

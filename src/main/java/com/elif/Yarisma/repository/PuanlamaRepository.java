package com.elif.Yarisma.repository;

import com.elif.Yarisma.entity.Kazananlar;
import com.elif.Yarisma.entity.Puanlama;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PuanlamaRepository extends JpaRepository<Puanlama,Long> {
    List<Puanlama> findAllByOrderByPuanDesc();
}

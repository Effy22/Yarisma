package com.elif.Yarisma.service;

import com.elif.Yarisma.entity.Kazananlar;
import com.elif.Yarisma.repository.KazananlarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KazananlarService {
    @Autowired
    public KazananlarRepository repository;

    public void save(Kazananlar kazananlar){
        repository.save(kazananlar);
    }
    public List<Kazananlar> findAll(){return repository.findAll();}
}

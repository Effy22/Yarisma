package com.elif.Yarisma.service;

import com.elif.Yarisma.entity.Soru;
import com.elif.Yarisma.repository.SoruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoruService {
    @Autowired
    public SoruRepository repository;

    public void save(Soru soru){
        repository.save(soru);
    }
    public List<Soru> findAll(){return repository.findAll();}

}

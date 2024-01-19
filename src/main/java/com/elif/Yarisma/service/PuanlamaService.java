package com.elif.Yarisma.service;

import com.elif.Yarisma.entity.Kazananlar;
import com.elif.Yarisma.entity.Puanlama;
import com.elif.Yarisma.repository.PuanlamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PuanlamaService {
    @Autowired
    public PuanlamaRepository repository;

    public void save(Puanlama puanlama){
        repository.save(puanlama);
    }
    public List<Puanlama> findAll(){return repository.findAll();}

    public List<Puanlama> saveAll(List<Puanlama> puanlamaList) {
       return repository.saveAll(puanlamaList);
    }
}

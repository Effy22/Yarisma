package com.elif.Yarisma.service;

import com.elif.Yarisma.entity.Yarisma;
import com.elif.Yarisma.repository.YarismaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YarismaService {
    @Autowired
    public YarismaRepository repository;

    public void save(Yarisma yarisma){
        repository.save(yarisma);
    }
    public List<Yarisma> findAll(){return repository.findAll();}

}

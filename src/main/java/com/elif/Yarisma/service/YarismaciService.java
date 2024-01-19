package com.elif.Yarisma.service;

import com.elif.Yarisma.entity.Yarismaci;
import com.elif.Yarisma.repository.YarismaciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class YarismaciService {
    @Autowired
    public YarismaciRepository repository;

    public void save(Yarismaci yarismaci){
        repository.save(yarismaci);
    }
    public List<Yarismaci> findAll(){return repository.findAll();}

}

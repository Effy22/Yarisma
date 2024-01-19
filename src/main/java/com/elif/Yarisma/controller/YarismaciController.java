package com.elif.Yarisma.controller;

import com.elif.Yarisma.entity.Yarismaci;
import com.elif.Yarisma.service.YarismaciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping
public class YarismaciController {
    @Autowired
    public YarismaciService service;
    @GetMapping("/save")
    public void save(Yarismaci yarismaci){
        service.save(yarismaci);
    }
    @GetMapping("/find-all")
    public List<Yarismaci> findAll(){
        return service.findAll();
    }


}

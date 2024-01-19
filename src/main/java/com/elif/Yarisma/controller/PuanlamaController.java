package com.elif.Yarisma.controller;


import com.elif.Yarisma.entity.Puanlama;
import com.elif.Yarisma.service.PuanlamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/puanlama")
public class PuanlamaController {
    Random rnd=new Random();
    @Autowired
    public PuanlamaService puanlamaService;
    @GetMapping("/save")
    public void save(Puanlama puanlama){
        puanlamaService.save(puanlama);
    }
    @GetMapping("/find-all")
    public List<Puanlama> findAll(){
        return puanlamaService.findAll();
    }

    @GetMapping ("/save-all")
    public List<Puanlama> saveAll(){
       Puanlama puan1 = Puanlama.builder()
                .id(rnd.nextLong(1,100))
                .userId(rnd.nextLong(1,100))
                .yarismaId(rnd.nextLong(1,100))
                .build();
        Puanlama puan2 =  Puanlama.builder()
                .id(rnd.nextLong(1,100))
                .userId(rnd.nextLong(1,100))
                .yarismaId(rnd.nextLong(1,100))
                .build();
        Puanlama puan3 =  Puanlama.builder()
                .id(rnd.nextLong(1,100))
                .userId(rnd.nextLong(1,100))
                .yarismaId(rnd.nextLong(1,100))
                .build();
        Puanlama puan4 =  Puanlama.builder()
                .id(rnd.nextLong(1,100))
                .userId(rnd.nextLong(1,100))
                .yarismaId(rnd.nextLong(1,100))
                .build();
        List<Puanlama> puanlamaList=List.of(puan1,puan2,puan3,puan4);
        return puanlamaService.saveAll(puanlamaList);
    }

}

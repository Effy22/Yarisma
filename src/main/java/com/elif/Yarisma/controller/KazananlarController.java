package com.elif.Yarisma.controller;

import com.elif.Yarisma.entity.Kazananlar;
import com.elif.Yarisma.entity.Puanlama;
import com.elif.Yarisma.repository.PuanlamaRepository;
import com.elif.Yarisma.repository.YarismaRepository;
import com.elif.Yarisma.service.KazananlarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kazananlar")
public class KazananlarController {
    @Autowired
    public KazananlarService kazananlarService;
    @Autowired
    public PuanlamaRepository puanlamaRepository;
    @Autowired
    public YarismaRepository yarismaRepository;


    @GetMapping("/save")
    public void save(Kazananlar kazananlar){

        kazananlarService.save(kazananlar);
    }
    @GetMapping("/find-all")
    public List<Kazananlar> findAll(){
        return kazananlarService.findAll();
    }
    /**
     * SQL SORGUSUNDA;
     * YARIŞMANIN EN YÜKSEK PUANINIA SAHİP OLANINI KAZANANLAR TABLOSUNA EKLE
     */







}

package com.elif.Yarisma.controller;

import com.elif.Yarisma.entity.Soru;
import com.elif.Yarisma.service.SoruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/soru")
public class SoruController {
    @Autowired
    public SoruService soruService;

    @GetMapping("/save")
    public void save(Soru soru){
        soruService.save(soru);
    }
    @GetMapping("/find-all")
    public List<Soru> findAll(){
        return soruService.findAll();
    }

}

package com.elif.Yarisma.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_soru")
public class Soru {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length = 800)
    String soru;
    Integer sure;
    @ElementCollection
    Map<String,String> cevaplar;
    /**
     * cevaplar.put("A","BU DOĞRU CEVAP MIDIR?");
     * Doğru cevap için cevaplar mapinin key'i kullanılacak
     */
    String dogruCevap;
    Integer puan;
    @ManyToOne
    Yarisma yarisma;

}

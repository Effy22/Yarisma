package com.elif.Yarisma.controller;

import com.elif.Yarisma.entity.Puanlama;
import com.elif.Yarisma.entity.Soru;
import com.elif.Yarisma.entity.Yarisma;
import com.elif.Yarisma.entity.Yarismaci;
import com.elif.Yarisma.repository.YarismaRepository;
import com.elif.Yarisma.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/yarisma")
public class YarismaController {
    Random rnd=new Random();
    @Autowired
    public YarismaService service;
    @Autowired
    KazananlarService kazananlarService;
    @Autowired
    PuanlamaService puanlamaService;
    @Autowired
    public SoruController soruController;
    @Autowired
    public YarismaciService yarismaciService;


    @GetMapping("/save")
    public void save(Yarisma yarisma){
        service.save(yarisma);
    }
    @GetMapping("/find-all")
    public List<Yarisma> findAll(){
        return service.findAll();
    }



    @GetMapping("/save-a-yarisma")
    public void saveAYarisma(){
        Map<String, String> map1 = new HashMap<>();
        map1.put("A", "Türkiye");
        map1.put("B", "Almanya");
        map1.put("C", "Yunanistan");
        map1.put("D", "Fransa");
        Map<String, String> map2 = new HashMap<>();
        map2.put("A", "Pazartesi");
        map2.put("B", "Salı");
        map2.put("C", "Pazar");
        map2.put("D", "Cuma");
        Soru soru1 = Soru.builder()
                .soru("Hangi ülkenin 3 tarafı denizlerle çevrilidir?")
                .sure(13)
                .cevaplar(map1)
                .dogruCevap("A")
                .puan(rnd.nextInt(0,50))
                .build();
        soruController.save(soru1);
        Soru soru2 = Soru.builder()
                .soru("Bugün günlerden pazartesi ise 55 gün sonra hangi gün olur?")
                .sure(13)
                .cevaplar(map2)
                .dogruCevap("C")
                .puan(rnd.nextInt(0,50))
                .build();
        soruController.save(soru2);

        Map<String, String> map3 = new HashMap<>();
        map3.put("A", "126");
        map3.put("B", "-135");
        map3.put("C", "9614");
        map3.put("D", "73128");
        Soru soru3 = Soru.builder()
                .soru("Hangi sayı diğerlerinden daha büyüktür?")
                .sure(13)
                .cevaplar(map3)
                .dogruCevap("D")
                .puan(rnd.nextInt(0,50))
                .build();

        Map<String, String> map4 = new HashMap<>();
        map4.put("A", "Venüs");
        map4.put("B", "Merkür");
        map4.put("C", "Jüpiter");
        map4.put("D", "Saturn");
        Soru soru4 = Soru.builder()
                .soru("Hangi gezegen Dünya'ya daha yakındır?")
                .sure(13)
                .cevaplar(map4)
                .dogruCevap("A")
                .puan(rnd.nextInt(0,50))
                .build();

        Map<String, String> map5 = new HashMap<>();
        map5.put("A", "E Vitamini");
        map5.put("B", "D  Vitamini");
        map5.put("C", "A  Vitamini");
        map5.put("D", "B  Vitamini");

        Soru soru5 = Soru.builder()
                .soru("Hangisi suda çözünen vitaminlerdendir?")
                .sure(13)
                .cevaplar(map5)
                .dogruCevap("D")
                .puan(rnd.nextInt(0,50))
                .build();
        soruController.save(soru5);
        Map<String, String> map6 = new HashMap<>();
        map6.put("A", "Zonguldak");
        map6.put("B", "Rize");
        map6.put("C", "İstanbul");
        map6.put("D", "Bursa");
        Soru soru6 = Soru.builder()
                .soru("Türkiye’nin en fazla yağış alan ili hangisidir?")
                .sure(13)
                .cevaplar(map6)
                .dogruCevap("B")
                .puan(rnd.nextInt(0,50))
                .build();
        soruController.save(soru6);
        Map<String, String> map7 = new HashMap<>();
        map7.put("A", "Çikolata");
        map7.put("B", "Mısır");
        map7.put("C", "Yulaf");
        map7.put("D", "Çeltik");
        Soru soru7 = Soru.builder()
                .soru("Pirinç hangi ürünün kabuğunun soyulması ile elde edilir?")
                .sure(13)
                .cevaplar(map7)
                .dogruCevap("D")
                .puan(rnd.nextInt(0,50))
                .build();
        soruController.save(soru7);

        Map<String, String> map8 = new HashMap<>();
        map8.put("A", "Mimar Kemal");
        map8.put("B", "Mimar Elif");
        map8.put("C", "Mimar Sinan");
        map8.put("D", "Mimar Meryem");
        Soru soru8 = Soru.builder()
                .soru("Türk tarihinin en ünlü mimarı kimdir?")
                .sure(13)
                .cevaplar(map8)
                .dogruCevap("C")
                .puan(rnd.nextInt(0,50))
                .build();
        soruController.save(soru8);

        Map<String, String> map9 = new HashMap<>();
        map9.put("A", "Kuzey-Batı");
        map9.put("B", "Güney-Doğu");
        map9.put("C", "Batı-Cermen");
        map9.put("D", "Ural-Altay");
        Soru soru9 = Soru.builder()
                .soru("Kemalin evi nerededir?")
                .sure(13)
                .cevaplar(map9)
                .dogruCevap("D")
                .puan(rnd.nextInt(0,50))
                .build();
        soruController.save(soru9);

        Map<String, String> map10 = new HashMap<>();
        map10.put("A", "7(Yedi)");
        map10.put("B", "5(Beş)");
        map10.put("C", "4(Dört)");
        map10.put("D", "8(Sekiz)");
        Soru soru10 = Soru.builder()
                .soru("Türkiye’de kaç tane coğrafi bölge bulunmaktadır?")
                .sure(13)
                .cevaplar(map10)
                .dogruCevap("A")
                .puan(rnd.nextInt(0,50))
                .build();
        soruController.save(soru10);

        Yarismaci yarismaci1 = Yarismaci.builder()
                .ad("Ahmet")
                .avatar("avatar....")
                .email("ahmet@gmail.com")
                .username("ahmet06")
                .build();
        yarismaciService.save(yarismaci1);
        Yarismaci yarismaci2 = Yarismaci.builder()
                .ad("Ayşe")
                .avatar("avatar....")
                .email("ayse@gmail.com")
                .username("ayse34")
                .build();
        yarismaciService.save(yarismaci2);
        Yarismaci yarismaci3 = Yarismaci.builder()
                .ad("Ali")
                .avatar("avatar....")
                .email("ali3425@gmail.com")
                .username("ali_45")
                .build();
        yarismaciService.save(yarismaci3);
        Yarisma yarisma1=Yarisma.builder()
                .ad("Matematik Yarışması")
                .baslangicTarihi(rnd.nextLong(1,100))
                .sure(rnd.nextLong(0,50))
                .build();

        yarisma1.setSorular(List.of(soru1,soru2,soru3,soru4,soru5,soru6,soru7,soru8,soru9,soru10));
        yarisma1.setYarismacilar(List.of(yarismaci1,yarismaci2,yarismaci3));
        service.save(yarisma1);
        Puanlama puanlama1=Puanlama.builder()
                .yarismaId(yarisma1.getId())
                .userId(yarismaci1.getId())
                .puan(rnd.nextLong(0,50))
                .build();
        puanlamaService.save(puanlama1);
        Puanlama puanlama2=Puanlama.builder()
                .yarismaId(yarisma1.getId())
                .userId(yarismaci2.getId())
                .puan(rnd.nextLong(0,50))
                .build();
        puanlamaService.save(puanlama2);

        Puanlama puanlama3=Puanlama.builder()
                .yarismaId(yarisma1.getId())
                .userId(yarismaci3.getId())
                .puan(rnd.nextLong(0,50))
                .build();
        puanlamaService.save(puanlama3);

        Puanlama puanlama4=Puanlama.builder()
                .yarismaId(yarisma1.getId())
                .userId(yarismaci2.getId())
                .puan(rnd.nextLong(0,50))
                .build();
        puanlamaService.save(puanlama4);

        Puanlama puanlama5=Puanlama.builder()
                .yarismaId(yarisma1.getId())
                .userId(yarismaci3.getId())
                .puan(rnd.nextLong(0,50))
                .build();
        puanlamaService.save(puanlama5);

        Puanlama puanlama6=Puanlama.builder()
                .yarismaId(yarisma1.getId())
                .userId(yarismaci1.getId())
                .puan(rnd.nextLong(0,50))
                .build();
        puanlamaService.save(puanlama6);

        Puanlama puanlama7=Puanlama.builder()
                .yarismaId(yarisma1.getId())
                .userId(yarismaci2.getId())
                .puan(rnd.nextLong(0,50))
                .build();
        puanlamaService.save(puanlama7);

        Puanlama puanlama8=Puanlama.builder()
                .yarismaId(yarisma1.getId())
                .userId(yarismaci3.getId())
                .puan(rnd.nextLong(0,50))
                .build();
        puanlamaService.save(puanlama8);

        Puanlama puanlama9=Puanlama.builder()
                .yarismaId(yarisma1.getId())
                .userId(yarismaci2.getId())
                .puan(rnd.nextLong(0,50))
                .build();
        puanlamaService.save(puanlama9);

        Puanlama puanlama10=Puanlama.builder()
                .yarismaId(yarisma1.getId())
                .userId(yarismaci1.getId())
                .puan(rnd.nextLong(0,50))
                .build();
        puanlamaService.save(puanlama10);

        //soru hazırladıktan sonra içine mapleri atcaz.
        //sonra sorulara yarişmayı set etcez
        //sonra yarisma1'e üstte soruları ekliycez. aşağıdada sorulara yarımayı set etcez.
        soru1.setYarisma(yarisma1);
        soru2.setYarisma(yarisma1);
        soru3.setYarisma(yarisma1);
        soru4.setYarisma(yarisma1);
        soru5.setYarisma(yarisma1);
        soru6.setYarisma(yarisma1);
        soru7.setYarisma(yarisma1);
        soru8.setYarisma(yarisma1);
        soru8.setYarisma(yarisma1);
        soru9.setYarisma(yarisma1);
        soru10.setYarisma(yarisma1);
        yarismaci1.setYarisma(yarisma1);
        yarismaci2.setYarisma(yarisma1);
        yarismaci3.setYarisma(yarisma1);

        service.save(yarisma1);
    }
}

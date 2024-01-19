package com.elif.Yarisma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YarismaApplication {

	public static void main(String[] args) {
		SpringApplication.run(YarismaApplication.class, args);
	}


	/**
	 * Repository'leri oluşturulacak. Controller ve
	 * Servis katmanlarında metotlar şimdilik birbirisinin kopyası olacak şekilde yazılsın.
	 * Controller-> Save();
	 * Service-> Save();
	 * -------------
	 * 1. ADET yarışma oluşturuyoruz.
	 * 10 adet soru oluşturcaz.
	 * 3 adet yarışmacı (puanlama veriyoruz)
	 * 1 adet büyük ödül olsun
	 * her bir yarışmacıya puan verilecek. 1,2,3. şeklinde sıralansınlarak.
	 * ------------
	 * Sorgular;
	 * - yarışmaların kazananları kimlerdir? yarışma adı, tarihi, kazan kullanıcı
	 * -Tüm zamanların en yüksek puanını alan yarışmacı kimdir?
	 * -
	 *
	 */
}

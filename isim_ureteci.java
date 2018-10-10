import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class IsimUreteci {
	public static void main (String[] args) {
		
		Scanner s = new Scanner (System.in);

		boolean durum = true;
		String dil = "";
		int adet = 0;
		String tercih = "";

		while (durum) {

			System.out.println ("Dil seçin");
			dil = s.next().toLowerCase();

			if (dil.equals("tr") || dil.equals("en")) {

				System.out.println ("Adet girin ");
				adet = s.nextInt();
				durum = false;
			}
			
			else {

				System.out.println ("Yanlış dil tercihinde bulundunuz lütfen tekrar giriş yapınız");
				System.out.println ("Programdan çıkmak için 'E'e devam etmek için herhangi bir tuşa basınız");
		
				tercih = s.next().toLowerCase();
				
				if (tercih.equals("e"))
					return;
			}
		}
		
		isimUret(dil, adet);
	}

	static void isimUret (String dil, int adet) {
		
		String[]
				TrAdlar = {
					
					"abajur",
					"baca",
					"canavar",
					"çaba",
					"demeç",
					"el",
					"fakülte",
					"gaflet",
					"ıhlamur",
					"iade",
					"jandarma",
					"kaş",
					"labirent",
					"medeniyet",
					"nabız",
					"ocak",
					"puan",					
					"rahat",
					"sene",
					"şablon",
					"tesis",
					"ücret",
					"vaat",
					"yoğurt",
					"zehir",
				},
				
				EnAdlar = {
			
					"ability",
					"bigot",
					"cab",
					"dab",
					"eagle",
					"fable",
					"gable",
					"haberdasher",
					"ice",
					"jackal",
					"karat",
					"lab",
					"machine",
					"nail",
					"oak",
					"pace",
					"quack",
					"rabbit",
					"saber",
					"tabby",
					"vacancy",
					"wad",
					"xenophobia",
					"yacht",
					"zinc",
				},
				
				TrSifatlar = {
		
					"basit",
					"cıvık",
					"çabuk",
					"dinamik",
					"feci",
					"gri",
					"hoyrat",
					"ılık",
					"iki",
					"kaplı",
					"lacivert",
					"müstakil",
					"nitel",
					"olağan",
					"öncül",
					"patlayıcı",
					"rafadan",
					"sade",
					"şık",
					"tatlı",
					"uçan",
					"ücra",
					"vasat",
					"yıkık",
					"zayıf",
				},
				
				EnSifatlar = {
		
					"akin",
					"beatiful",
					"conscious",
					"damned",
					"each",
					"fair",
					"gangling",
					"habitual",
					"idle",
					"jocular",
					"known",
					"laconic",
					"macabre",
					"nasty",
					"oblique",
					"pugnacious",
					"quadruple",
					"radical",
					"sad",
					"tactful",
					"ubiqutous",
					"vague",
					"warlike",
					"yellow",
					"zigzag",
				};

		String[] Adlar = null, Sifatlar = null;
		String yol = "";

		if (dil.equals("tr")) {

			Adlar = TrAdlar;
			Sifatlar = TrSifatlar;
			yol = "Turkce Dosyalar/";
		}

		else {

			Adlar = EnAdlar;
			Sifatlar = EnSifatlar;
			yol = "Ingilizce Dosyalar/"; 
		}

		Random rnd = new Random();
		
		int olasilik = Sifatlar.length * Adlar.length;
		String kokDizin = "/home/celikel/ProgDil/";
		
		for (int i = 0; i < adet;) {

			int AdIndex = rnd.nextInt (Adlar.length);
			int SifatIndex = rnd.nextInt (Sifatlar.length);
			String ifade = Sifatlar[SifatIndex] + "-" + Adlar[AdIndex];
			
			File dosya = new File (kokDizin + yol);
			int dosyaSayisi = dosya.list().length;
			
			File uretilecekDosya = new File (kokDizin + yol + ifade);

			if (uretilecekDosya.isDirectory())
				Kontrol(dosyaSayisi, olasilik);
			
			else {
			 
			 	EkranaYaz (i, ifade);
				uretilecekDosya.mkdir();
				i++;
			}
		}
	}
	
	static void Kontrol (int dosyaSayisi, int olasilik) {
			
			if (dosyaSayisi  == olasilik) { 

					System.out.println ("\nÜRETİLEBİLECEK MAKSIMUM DOSYA SAYISINA ULAŞILMIŞTIR!\n");
					System.exit(1); 
			}
	}
	
	static void EkranaYaz (int i, String ifade) {
		
		System.out.println ((i + 1) + ". Üretilen => " + ifade);
	}
}

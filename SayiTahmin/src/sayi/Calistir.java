package sayi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calistir {

	public static void main(String[] args) {
		Tahmin tahmin = new Tahmin();
		TahminSonucu sonuc = null;
		int tahminAdedi;
		try (Scanner scanner = new Scanner(System.in)) {
			tahmin.yeniSayiTut();
			tahminAdedi = 0;
			System.out.println("Bir say� tuttum.");
			do {
				System.out.println("Tahmininiz:");
				try {
					int tahminSayisi = scanner.nextInt();
					tahminAdedi++;
					sonuc = tahmin.tahminiKontrolEt(tahminSayisi);
					if (sonuc.isHataliTahmin()) {
						System.out.println("Hatal� tahminde bulundunuz. Yeniden tahmin ediniz.");
					} else {
						System.out.format("Do�ru basamak say�s�: %s, Yanl�� basamak say�s�: %s%n", sonuc.getDogruBasamak(), sonuc.getYanlisBasamak());
						if (sonuc.getDogruBasamak() == 4) {
							System.out.format("Tebrikler, %s defada bildiniz..", tahminAdedi);
						}
					}
				} catch (InputMismatchException e) {
					System.out.println("L�tfen tamsay� giriniz.");
					// giri� tamponunu temizle
					scanner.nextLine();
					sonuc = new TahminSonucu();
				}
			} while (sonuc.getDogruBasamak() != 4);
		}

	}

}

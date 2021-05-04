package ornek18;

import java.util.Scanner;

public class Baslat {
    private Islem islem = new Islem();

    public static void main(String[] args) {
	new Baslat().oyunBaslat();
    }

    private void oyunBaslat() {
	try (Scanner scn = new Scanner(System.in)) {
	    while (true) {
		System.out.println(TahminSonuclar�.DOGRU_TAHMIN.ordinal());
		islem.birSayiTut();
		System.out.println("bir say� tuttum . Bilmeye �al�� bakal�m");
		TahminSonuclar� durum;
		do {
		    System.out.println("tahmininiz : ");
		    int tahmin = scn.nextInt();
		    durum = islem.tahmindeBulun(tahmin);
		    if (durum == TahminSonuclar�.TAHMIN_BUYUK) {
			System.out.println("tamnininizi azalt�n");
		    } else if (durum == TahminSonuclar�.TAHMIN_KUCUK) {
			System.out.println("tahmininizi art�r�n");
		    } else {
			System.out.println("tebrikler " + islem.getTahminAdedi() + " defada bildiniz");
		    }
		} while (durum != TahminSonuclar�.DOGRU_TAHMIN);
	    }
	}
    }

}

package paket1;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
	System.out.println("-----------------------------");
	try (Scanner scanner = new Scanner(System.in)) {
	    int toplam = 0;
	    int SayiAdet = 0;
	    int sayi;
	    do {
		System.out.println("L�tfen bir say� giriniz ��kmak i�in 0 = ");
		sayi = scanner.nextInt();
		if (sayi != 0) {
		    SayiAdet++;
		    toplam += sayi;
		}
	    } while (sayi != 0);

	    System.out.println("Say� adet = " + SayiAdet);
	    System.out.println("Ortalama= " + toplam / (double) SayiAdet);
	}
    }
}

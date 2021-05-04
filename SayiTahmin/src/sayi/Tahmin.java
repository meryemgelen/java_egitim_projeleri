package sayi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Tahmin {
	private int tutulanSayi;

	public Tahmin() {
		yeniSayiTut();
	}

	public void yeniSayiTut() {
		tutulanSayi = 0;
		List<Integer> sayilar = IntStream.range(0, 10).parallel().collect(ArrayList::new, List::add, List::addAll);
		Integer basamak;
		// diger basamaklar� da tutal�m
		for (int i = 3; i >= 0; i--) {
			if (i == 3) {
				// ilk basamak 0 olmas�n
				basamak = sayilar.get((int) (Math.random() * (sayilar.size() - 1)) + 1);
			} else {
				basamak = sayilar.get((int) (Math.random() * sayilar.size()));
			}
			tutulanSayi += basamak * Math.pow(10, i);
			// tutulan basama�� sayilar listesinden ��kar�yoruz ki bir daha se�ilmesin.
			sayilar.remove(basamak);
		}
	}

	public TahminSonucu tahminiKontrolEt(int tahmin) {
		TahminSonucu sonuc = new TahminSonucu();
		if (basamakKontrol(tahmin)) {
			disDongu: for (int i = 1; i <= 4; i++) {
				int basamak = getBasamak(tahmin, i); // sa�dan i. basama�� verir.
				// basamak de�erinin tutulan tahmindeki t�m basamaklar ile kar��la�t�r�lmas�
				for (int y = 1; y <= 4; y++) {
					int tahminBasamak = getBasamak(tutulanSayi, y);
					if (tahminBasamak == basamak) {
						if (i == y) {
							sonuc.dogruBasamakArttir();
						} else {
							sonuc.yanlisBasamakArttir();
						}
						continue disDongu;
					}
				}
			}
		} else {
			sonuc.setHataliTahmin(true);
		}
		return sonuc;
	}

	private boolean basamakKontrol(int tahmin) {
		Set<Integer> basamaklar = new HashSet<Integer>();
		for (int i = 1; i <= 4; i++) {
			int basamak = getBasamak(tahmin, i);
			basamaklar.add(basamak);
		}
		if (tahmin <= 0 || tahmin > 9999 || basamaklar.size() != 4 || getBasamak(tahmin, 4) == 0) {
			// 4 farkl� basamak girilmemi� ya da 0 ile ba�layan bir say� girilmi�
			return false;
		}
		return true;
	}

	private int getBasamak(int tahmin, int basamak) {
		int s = (int) Math.pow(10, basamak - 1);
		int kusurat = tahmin % s;
		int sonuc = ((tahmin - kusurat) / s) % 10;
		return sonuc;
	}
}

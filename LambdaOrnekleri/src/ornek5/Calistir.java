package ornek5;

import java.util.Arrays;
import java.util.List;

public class Calistir {
    public static interface InsanYazmaKosulu {
	public boolean test(Insan insan);
    }

    public static void main(String[] args) {

	List<Insan> insanlar = Arrays.asList(new Insan("Muharrem", "Uzun", 45), new Insan("Kamuran", "Akkor", 80),
		new Insan("Levent", "Guren", 41), new Insan("Do�a", "Kavak", 14), new Insan("Baha", "Arbak", 49));

	// 1-butun adlar� ekran bas
	insanlariYaz(insanlar, insan -> true);
	System.out.println("-------------------------------------------");

	// 2- soyadar� A ile ba�layan insanlar� ekrana bas
	insanlariYaz(insanlar, insan -> insan.getSoyadi().startsWith("A"));
	System.out.println("-------------------------------------------");

	// 3- ismi F harfi ve daha �nce harf ile ba�layan insanlar�n ya�lar�n� ekrana
	// bas
	insanlariYaz(insanlar, insan -> insan.getAdi().charAt(0) <= 'F');
	System.out.println("-------------------------------------------");

    }

    private static void insanlariYaz(List<Insan> insanlar, InsanYazmaKosulu kosul) {
	for (Insan insan : insanlar)
	    if (kosul.test(insan)) {
		System.out.println(insan);
	    }
    }

}

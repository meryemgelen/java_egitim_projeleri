package ornek6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;;

public class Calistir {
    public static void main(String[] args) {

	List<Insan> insanlar = Arrays.asList(new Insan("Muharrem", "Uzun", 45), new Insan("Kamuran", "Akkor", 80),
		new Insan("Levent", "Guren", 41), new Insan("Do�a", "Kavak", 14), new Insan("Baha", "Arbak", 49));

	// 1-butun adlar� ekran bas
	insanlariYaz(insanlar, insan -> true, insan -> System.out.println(insan));
	System.out.println("-------------------------------------------");

	// 2- soyadar� A ile ba�layan insanlar� ekrana bas
	// insanlariYaz(insanlar, insan -> insan.getSoyadi().startsWith("A"), i ->
	// System.out.println(i));
	insanlariYaz(insanlar, insan -> insan.getSoyadi().startsWith("A"), System.out::println);

	System.out.println("-------------------------------------------");

	// 3- ismi F harfi ve daha �nce harf ile ba�layan insanlar�n ya�lar�n� ekrana
	// bas
	insanlariYaz(insanlar, insan -> insan.getAdi().charAt(0) <= 'F', insan -> System.out.println(insan.getYasi()));
	System.out.println("-------------------------------------------");

    }

    private static void insanlariYaz(List<Insan> insanlar, Predicate<Insan> kosul, Consumer<Insan> consumer) {
	for (Insan insan : insanlar)
	    if (kosul.test(insan)) {
		consumer.accept(insan);
	    }
    }

}

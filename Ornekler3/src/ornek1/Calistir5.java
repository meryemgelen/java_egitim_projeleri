package ornek1;

public class Calistir5 {

    public static void main(String[] args) {
	System.out.println("Program ba�lad�");
	// try {
	test(0);
	// } catch (Exception e) {

	// System.out.println("hata olu�tu : " + e.getMessage());
	// }
	System.out.println("Program bitti");
    }

    private static void test(int sayi) {
	if (sayi == 0) {
	    // hatal� durum
	    RuntimeException e = new RuntimeException("S�f�r g�nderilemez");
	    throw e;
	} else {
	    System.out.println(sayi);
	}
    }

}

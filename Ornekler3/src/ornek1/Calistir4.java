package ornek1;

public class Calistir4 {

    public static void main(String[] args) {
	System.out.println("Program ba�lad�");
	try {
	    test(0);
	} catch (Exception e) {

	    System.out.println("hata olu�tu : " + e.getMessage());
	}
	System.out.println("Program bitti");
    }

    private static void test(int sayi) throws Exception {
	if (sayi == 0) {
	    // hatal� durum
	    Exception e = new Exception("S�f�r g�nderilemez");
	    throw e;
	} else {
	    System.out.println(sayi);
	}
    }

}

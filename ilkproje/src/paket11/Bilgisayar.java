package paket11;

public class Bilgisayar {
    static String marka;
    int bellekMiktari;

    public String toString() {
	// String sonuc = "Marka";
	/// sonuc = sonuc + marka + ", bellek miktar� = " + bellekMiktari;
	// return sonuc;

	StringBuilder sb = new StringBuilder();
	sb.append("marka : ");
	sb.append(marka);
	sb.append(", bellek miktar� = ");
	sb.append(bellekMiktari);
	return sb.toString();
    }

    static void markaYaz() {
	System.out.println(marka);
    }

}

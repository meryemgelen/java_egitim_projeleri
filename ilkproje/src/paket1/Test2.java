package paket1;

public class Test2 {
    public static void main(String[] args) {
	int c = 2;
	c = c + 3;
	c += 3;
	// sat�r a��klama
	/*
	 * blok a��klama % kalan� verir
	 */
	int t = 4;
	int p = t++ + ++t;
	System.out.println(p);
	int o = 3;
	o = ++o * 2;
	System.out.println(o);

    }
}

package paket25;

public class Bilgisayar {
    int ram;
    String marka;

    public Bilgisayar() {
	System.out.println("pc olu�turuldu");
    }

    public Bilgisayar(int ram, String marka) {
	this();
	this.ram = ram;
	this.marka = marka;
    }
}

package ornek14;

public class Motosiklet extends Arac {
    @Override
    public String toString() {
	return "Motosiklet hizi = " + hiz;
    }

    public void hiziArttir() {
	System.out.println("motorun h�z� art�r�l�yor");
	super.hiziArttir();
    }
}

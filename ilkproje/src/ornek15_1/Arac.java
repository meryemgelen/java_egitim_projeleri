package ornek15_1;

public class Arac extends Object {
    private int hiz;

    @Override
    public String toString() {
	return "Ara� hizi = " + hiz;
    }

    public void hiziArttir() {
	hiz++;
	System.out.println("ara� h�z� art�r�l�yor");
    }
}
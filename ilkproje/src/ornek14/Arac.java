package ornek14;

public class Arac extends Object {
    int hiz;

    @Override
    public String toString() {
	return "Ara� hizi = " + hiz;
    }

    public void hiziArttir() {
	hiz++;
    }
}
package streamOrnegi2;

import java.util.Arrays;

public class Calistir {

    public static void main(String[] args) {
	// stream = Array list gibi kavramlar �zerinde kolay i�lemler yapmaya yar�yor
	int[] sayilar = { 10, 2, 3, 6, 8 };
	Arrays.stream(sayilar).filter(i -> i % 2 == 0).sorted().forEach(c -> System.out.println(c));
    }

}

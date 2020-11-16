package ejercicios02;

import java.util.Scanner;

public class LongMediaCincoNombres {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		final int CUANTOS_NOMBRES = 5;
		int i;
		double res = 0.0;

		System.out.println("Inserte los nombres: ");
		for (i = 0; i < CUANTOS_NOMBRES; i++) {
			name = in.nextLine();
			res += name.length();
		}
		System.out.printf("La media es: %.2f", res / 5);
		in.close();
	}
}

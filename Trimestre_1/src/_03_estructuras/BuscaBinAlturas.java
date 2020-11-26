package _03_estructuras;
import java.util.Scanner;

public class BuscaBinAlturas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float[] alt = { 1.65f,     1.67f, 1.67f, 1.80f, 1.80f,   1.83f,       1.88f,     1.90f,    1.91f,   1.91f,   2.1f     , 2.1f };
		String[] nom = { "Pedro", "Ana", "Ana", "Juan", "Jose", "Pau Gasol", "Antonio", "Maria", "Carmen", "Lucas", "Marcos",  "Ali"};
		int izq = 0;
		int der = alt.length - 1;
		int medio = (der + izq) / 2;

		System.out.println("Escribe una altura: ");
		float alturaBuscada = in.nextFloat();

		while (alt[medio] != alturaBuscada && izq < der) {
			if (alturaBuscada < alt[medio])
				der = medio - 1;
			else
				izq = medio + 1;
			medio = (der + izq) / 2;
		}
		if (alt[medio] == alturaBuscada) {
			System.out.println(nom[medio] + " tiene una altura de: " + alt[medio]+" m.");
		} else {
			System.out.println("Nadie tiene esa altura");
		}

	}
}
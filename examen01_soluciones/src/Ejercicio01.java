import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		float[] numeros = new float[10];
		float minimo, suma, aux;

		int iz, de;
		int i;

		Scanner in = new Scanner(System.in);
		for (i = 0; i < numeros.length; i++) {
			System.out.printf("Num (%d).- ", i + 1);
			numeros[i] = in.nextFloat();
		}
		System.out.print("Mínimo.- ");
		minimo = in.nextFloat();

		for (iz = 0, de = numeros.length - 1; iz < de; iz++, de--) {
			suma = numeros[iz] + numeros[de];
			if (suma > minimo && suma % 10 != 5) {
				aux = numeros[iz];
				numeros[iz] = numeros[de];
				numeros[de] = aux;
			}
		}
		System.out.print("{");
		for (i = 0; i < numeros.length - 1; i++) 
			System.out.printf(" %.2f ,", numeros[i]);
		System.out.printf(" %.2f }\n", numeros[i]);
	}
}
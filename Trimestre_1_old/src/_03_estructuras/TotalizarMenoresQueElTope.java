package _03_estructuras;
import java.util.Scanner;

public class TotalizarMenoresQueElTope {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float[] numeros;
		float tope;
		int i;
		float total=0.0f;
		numeros = new float[10];
		total = 0;
		// leer por consola los diez números y colocarlos en las casillas de la tabla
		System.out.printf("Introduce %d números...\n",numeros.length);
		for(i=0;i<numeros.length;i++) {
			System.out.print("> ");
			numeros[i] = in.nextFloat();
		}
		System.out.print("Introduce el número tope: ");
		tope=in.nextFloat();
		for(i=0;i<numeros.length;i++) {
			if (numeros[i] <= tope) {
				total = total + numeros[i];
			}
		}
		System.out.println("El total es: "+total);
		in.close();
	}
}
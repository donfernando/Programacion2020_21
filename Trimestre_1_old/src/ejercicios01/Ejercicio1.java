package ejercicios01;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int precio;
		double precioTotal;
		System.out.println("¿Cuánto vale el producto?");
		precio = teclado.nextInt();
		precioTotal = precio + precio * 11 / 100.0;
		
		//precioTotal = precio*1.11;
		if (precioTotal>=1000) {
			System.out.println("\"Cariiisimo\"");
		}
		else {
			//System.out.println("El precio es: "+precioTotal+"€");
			System.out.printf("El precio es: %.2f€ ",precioTotal);
		}
		teclado.close();
	}
}

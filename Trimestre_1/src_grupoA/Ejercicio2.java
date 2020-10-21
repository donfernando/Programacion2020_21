import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final double CUOTA_FIJA = 6;
		final double CUOTA_2TRAMO_COMPLETO = 150*0.1;
		System.out.println("Escriba la cantidad de litros usados: ");
		double litros = teclado.nextInt();
		if (litros <= 50) {
			System.out.println("Solo pagas la cuota fija, que son: " + CUOTA_FIJA + "€");
		} else if (litros < 200) {
			System.out.println("Pagas la cantidad de: " + ((litros-50) * 0.1 + CUOTA_FIJA) + "€");
		} else
			System.out.println("Pagas la cantidad de: " + ((litros-200) * 0.3 + CUOTA_2TRAMO_COMPLETO + CUOTA_FIJA) + "€");
		teclado.close();
	}

}

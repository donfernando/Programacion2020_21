package _03_estructuras;
import java.util.Date;
import java.util.Scanner;

public class BusquedaBinFechas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Date[] fechas = { new Date(60, 0, 14), new Date(65, 2, 15),
						  new Date(67, 7, 2), new Date(72, 6, 10),
						  new Date(76, 3, 19), new Date(83, 7, 27),
						  new Date(96, 11, 10) };
		String[] nombres = { "Alejandro", "Patricia", "David", "Pedro", "Sandra", "Tere", "Andres" };
		int izquierda = 0;
		int derecha = fechas.length - 1;
		int media = (izquierda + derecha) / 2;
		int año, mes, dia;

		System.out.println("Día(1...): ");
		dia = in.nextInt();
		System.out.println("Mes(1-12): ");
		mes = in.nextInt();
		System.out.println("Año: ");
		año = in.nextInt();
		
		Date fechaBuscada = new Date(año - 1900, mes - 1, dia);

		while (!fechas[media].equals(fechaBuscada) && izquierda < derecha) {
			if (fechas[media].compareTo(fechaBuscada) > 0) {
				derecha = media - 1;
			} else {
				izquierda = media + 1;
			}
			media = (derecha + izquierda) / 2;

		}
		if (fechaBuscada.equals(fechas[media])) {
			System.out.println(nombres[media] + " nació el " + fechaBuscada);
		} else {
			System.out.println("Nadie nació en esa fecha");
		}

	}

}

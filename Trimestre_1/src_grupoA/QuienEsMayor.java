/* Este codigo ha sido generado por el modulo psexport 20180802-l64 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "QUIENESMAYOR.java."

import java.util.Scanner;

public class QuienEsMayor {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String nombre1;
		String nombre2;
		int edad1;
		int edad2;
		System.out.print("Hola, ¿cómo te llamas?");
		nombre1 = in.nextLine();
		System.out.println("Buenas, ¿y tú, cómo te llamas?");
		nombre2 = in.nextLine();
		System.out.println("Bueno, "+nombre1+"¿qué edad tienes?");
		edad1 = in.nextInt();
		System.out.println("Bueno, "+nombre2+"¿qué edad tienes?");
		edad2 = in.nextInt();
		if (edad2>edad1) {
			System.out.println(nombre2+" ES EL MAYOR DE LOS DOS");
		} else {
			if (edad2<edad1) {
				System.out.println(nombre1+" ES EL MAYOR DE LOS DOS");
			} else {
				System.out.println("AMBOS SON DE LA MISMA EDAD");
			}
		}
	}


}


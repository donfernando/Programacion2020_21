package _03_estructuras;

import java.util.Scanner;

public class PosicionFrase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String fr = "Hola me llamo Alejandro";
		
		StringBuffer frase = new StringBuffer(fr);
		char[] tablaCaracteres = new char[fr.length() + 1];
		int pos, posicion;

		for (pos = 0; pos < frase.length(); pos++) {
			tablaCaracteres[pos] = frase.charAt(pos);
		}
		System.out.println(
				"Introduce la posición entre 0 y 23 donde quieras insertar el * en la frase \"Hola me llamo Alejandro\"");
		posicion = in.nextInt();
		if (posicion >= 0 && posicion <= fr.length()) {
			System.out.println("Usando StringBuffer:");
			frase.insert(posicion, "*");
			System.out.println(frase);

			System.out.println("Ulilizando la Tabla:");
			for (pos = tablaCaracteres.length - 1; pos > posicion ; pos--) {
				tablaCaracteres[pos] = tablaCaracteres[pos - 1];
			}
			tablaCaracteres[posicion] = '*';
			System.out.println(tablaCaracteres);

		} else {
			System.out.println("El valor no esta entre los permitidos");
		}
	}
}

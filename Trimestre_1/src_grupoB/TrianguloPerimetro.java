/* Este codigo ha sido generado por el modulo psexport 20180802-l64 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "TRIANGULOPERIMETRO.java."

import java.util.Scanner;

public class TrianguloPerimetro {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		boolean esValido;
		float l1,l2,l3;
		System.out.println("Dame los lados: ");
		l1 = in.nextFloat();
		l2 = in.nextFloat();
		l3 = in.nextFloat();
		if (l1>l2 && l1>l3) {
			esValido = l1<l2+l3;
		} else {
			if (l2>l3) {
				esValido = l2<l1+l3;
			} else {
				esValido = l3<l2+l1;
			}
		}
		if (esValido) {
			System.out.println("Perímetro: "+(l1+l2+l3));
		} else {
			System.out.println("El triángulo no es válido");
		}
	}


}


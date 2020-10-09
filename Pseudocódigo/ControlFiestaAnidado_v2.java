/* Este codigo ha sido generado por el modulo psexport 20180802-l64 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CONTROLFIESTA.java."

import java.io.*;

public class controlfiesta {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String acompanado;
		boolean acompaÑado;
		double edad;
		boolean tienecarnet;
		System.out.println("Tiene Carnet del Club: ");
		tienecarnet = Boolean.parseBoolean(bufEntrada.readLine());
		if (tienecarnet) {
			System.out.println("Tu edad: ");
			edad = bufEntrada.readLine();
			if (edad>=18) {
				System.out.println("Puede pasar");
			} else {
				if (edad>15) {
					System.out.println("Viene acompañado de un adulto: ");
					acompanado = bufEntrada.readLine();
					if (acompanado) {
						System.out.println("Puede pasar");
					} else {
						System.out.println("Se queda fuera. No tiene permiso para entrar");
					}
				} else {
					System.out.println("No pasas");
				}
			}
		} else {
			System.out.println("Se queda fuera. No tiene permiso para entrar");
		}
	}


}


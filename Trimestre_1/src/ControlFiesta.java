/* Este codigo ha sido generado por el modulo psexport 20180802-l64 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "CONTROLFIESTA.java."

import java.util.Scanner;
public class ControlFiesta {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		boolean acompañado;
		int edad;
		boolean tienecarnet;
		System.out.print("Tiene Carnet del Club: ");
		tienecarnet = in.nextBoolean();
		if (tienecarnet) {
			System.out.print("Tu edad: ");
			edad = in.nextInt();
			if (edad>=18) {
				System.out.println("Puede pasar");
			} else {
				if (edad>15) {
					System.out.println("Viene acompañado de un adulto: ");
					acompañado = in.nextBoolean();
					if(acompañado)
						System.out.println("Puede pasar");
					else 
						System.out.println("Tu acompañante no sé, pero tú no puedes entrar.");						
				}
				else
					System.out.println("No puede pasar");
				
			}			
		} else {
			System.out.println("Se queda fuera. No tiene permiso para entrar");
		}
	}


}


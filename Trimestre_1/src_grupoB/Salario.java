/* Este codigo ha sido generado por el modulo psexport 20180802-l64 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SIN_TITULO.java."

import java.util.Scanner;

public class Salario {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int antiguedad;
		char categoria;
		int nhijos;
		double retencion;
		double salario;
		int trienios;
		System.out.println("Dame los datos...");
		categoria = in.nextLine().charAt(0);
		antiguedad = in.nextInt();
		nhijos = in.nextInt();
		switch (categoria) {
		case 'A':
			salario = 1800;
			break;
		case 'B':
			salario = 1500;
			break;
		case 'C':
			salario = 980;
			break;
		default:
			salario=0;
			
		}
		if (antiguedad>=5) {
			// La división debe ser sin decimales
			trienios = antiguedad/3;
		} else {
			trienios = 0;
		}
		salario = salario+trienios*80;
		if (nhijos!=0) {
			retencion = 16*salario/100;
		} else {
			retencion = 19*salario/100;
		}
		salario = salario-retencion;
		System.out.println("Salario: "+salario);
	}


}


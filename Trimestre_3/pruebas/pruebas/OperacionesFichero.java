package pruebas;

import java.io.*;
import java.util.Scanner;

public class OperacionesFichero {

	public static void main(String[] args) throws IOException {
		File fich = new File("operaciones.txt");
		Scanner lectorLineas = new Scanner(fich);

		String operacion = "";
		String linea;
		int numero;
		int suma;
		int multi;
		char[] ch;
		String expresion;

		while (lectorLineas.hasNextLine()) {
			linea = lectorLineas.nextLine();
			Scanner analizador = new Scanner(linea);
			operacion = analizador.next();
			expresion="";
			switch (operacion) {
			case "SUM":
				suma = 0;
				while (analizador.hasNextInt()) {
					numero = analizador.nextInt();
					suma += numero;
					if(numero>=0)
						expresion += numero;
					else
						expresion += "(" + numero + ")";
					if (analizador.hasNextInt()) {
						expresion += " + ";
					}
				}
				System.out.println(expresion + " = " + suma);
				break;
			case "PRO":
				multi=1;
				while (analizador.hasNextInt()) {
					numero = Integer.parseInt(analizador.next());
					multi *= numero;
					
					if (numero<0) {
						System.out.print("("+numero + ")");
					} else {
						System.out.print(numero);
					}					
					if (analizador.hasNextInt()) {
						System.out.print(" * ");
					}
				}
				System.out.println(" = " + multi);
			}
		}
	}
}
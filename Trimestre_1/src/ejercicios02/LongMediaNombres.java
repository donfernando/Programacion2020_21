package ejercicios02;

import java.util.Scanner;

public class LongMediaNombres {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;

		int contName=0;
		double res = 0.0;

		System.out.println("Inserte los nombres (acabando al escribir 'FIN'): ");
		name = in.nextLine();
		while(!name.equals("FIN")) {
			res += name.length();
			contName++;
			name = in.nextLine();
		}
		if(contName!=0)
			System.out.printf("La media es: %.2f", res / contName);
		else
			System.out.println("No se ha escrito ningún nombre");
		in.close();
	}
}

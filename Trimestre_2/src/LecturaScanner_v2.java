

import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaScanner_v2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int MAXINTENTOS=3;
        int x, y;
        boolean hayError;
        int intentos=1;
        do {
			System.out.print("Valor para y = ");
			try {
				y = in.nextInt();
				System.out.println("y = " + y);
				x = 11 + 8 * 3 - (y = 18 - y) + y;
				System.out.println("\n\nResultado \nx = " + x);
				System.out.println("y = " + y);
				hayError=false;
			} catch (InputMismatchException e) {
				System.out.printf("El dato \"%s\" no es válido.", in.nextLine());
				System.out.println("...repite...");
	        	intentos++;
				hayError=true;
			} 
		} while (hayError && intentos < MAXINTENTOS);
        if(hayError)
        	System.out.println("Lo siento pero no hay más intentos.");
/*        else
        	System.out.println("intentos gastados: "+intentos);
*/
        System.out.println("FIN");
	}
}

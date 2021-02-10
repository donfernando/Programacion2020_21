

import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaScanner_v1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int x, y;
        
        System.out.print("Valor para y = ");
        try {
			y = in.nextInt();
			System.out.println("y = "+ y);
			
			x = 11 + 8 * 3 - (y = 18 - y) + y ; 
			
			System.out.println("\n\nResultado \nx = "+ x);
			System.out.println("y = "+ y);
		} catch (InputMismatchException e) {
			System.out.println("Los datos introducidos no son válidos.");
		}
        in.close();
	}
}

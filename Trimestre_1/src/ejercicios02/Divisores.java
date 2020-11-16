package ejercicios02;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	        int num, i;

	        System.out.println("Introduzca un número: ");
	        num = in.nextInt();
	        for (i = 1; i < num ; i++) {
	            if (num%i == 0){
	                System.out.print(i + ", ");
	            }
	        }
            System.out.println(i);
	        in.close();	}

}

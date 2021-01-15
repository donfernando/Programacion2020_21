package _02_sentenciasControl;

import java.util.Scanner;

public class EcuacionSegGrado {
	public static void main(String[] args) {		
		int a;
		int b;
		int c;
		int bajoLaRaiz;
		Scanner in = new Scanner(System.in);
		
		// Leer los coeficientes
		System.out.print("A: ");
		a = in.nextInt();
		System.out.print("B: ");
		b = in.nextInt();
		System.out.print("C: ");
		c = in.nextInt();

		if (a != 0) {
			bajoLaRaiz = b*b -4*a*c;
			if (bajoLaRaiz < 0) {
				System.out.println("la solución precisa de números complejos");
			}
			else {
				if (bajoLaRaiz == 0) {
					System.out.println("Solución única: " + (-b/(2.0*a)));
				}
				else {
					System.out.println("Primera solución: "+ (-b+Math.sqrt(bajoLaRaiz))/(2*a));
					System.out.println("Segunda solución: "+ (-b-Math.sqrt(bajoLaRaiz))/(2*a));
				}
			}
		}
		else {
			if(b != 0) {
				System.out.println("Solución única: " + (-b/(double)c));
			}
			else {
				if (c != 0) {
					System.out.println("NO HAY SOLUCIONES");
				}
				else {
					System.out.println("INFINAS SOLUCIONES");
				}
			}
		}
		in.close();
	}
}

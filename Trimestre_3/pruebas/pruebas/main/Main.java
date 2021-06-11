package pruebas.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import pruebas.PalabraSecreta;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PalabraSecreta psecret = new PalabraSecreta(new File("peliculas.txt"));
		System.out.println("Adivina la película oculta....");
		char ch;

		do {
			System.out.println("----->   " + psecret);
			ch = in.nextLine().charAt(0);
			if (psecret.intento(ch))
				System.out.println("Bien!!!");
			else
				System.out.println("OOhhh");
		} while (!psecret.terminado());
		
		System.out.println(psecret);

	}

}

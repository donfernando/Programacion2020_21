package main;

import java.io.IOException;
import java.util.Scanner;

import misClases.Ahorcado;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		Ahorcado juego= new Ahorcado("Barabaridad");
		while(true){
			juego.dibujar();
			juego.intentar(in.nextLine().charAt(0));
		}
	}

}

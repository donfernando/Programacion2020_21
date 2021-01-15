package ejercicios02;

import java.util.Scanner;

public class ContarPalabras {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;
        int contPalabras=0;
        int i;
        char antCaracter=' ';
        
        System.out.print("> ");
        frase = in.nextLine();
        for (i = 0; i < frase.length(); i++) {
			if(Character.isLetter(frase.charAt(i)) & !Character.isLetter(antCaracter))
				contPalabras++;
			antCaracter=frase.charAt(i);
		}
        
        System.out.println("La frase introducida tiene " + contPalabras + " palabras.");
	}

}

package _03_estructuras;

/*
analizar si una palabra o frase es polindromo
pasar a minuscula y usar isSpace para evitar los espacios
Character.isLetter es la mejor opcion
 */
import java.util.Scanner;
public class Palindromo {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);	
	String frase;
	int inicio=0,fin,i=0,pos;
	char letra;
	char[] tabla;
	
	System.out.print("Introduzca la palabra o frase a comprobar: ");
	frase = entrada.nextLine();
	
	tabla = new char [frase.length()];
	
	for (pos = 0; pos < frase.length(); pos++) {
		letra = frase.charAt(pos);
		if (Character.isLetter(letra)) {
			tabla[i] = Character.toLowerCase(letra); 
			i++;}
	}
	fin = i-1;		
	while (inicio<fin & tabla[inicio]==tabla[fin]) {
		inicio++;
		fin--;
	}
	if (tabla[inicio]==tabla[fin]) {
		System.out.print("Se trata de un palíndromo.");	
	}
	else {
		System.out.print("No se trata de un palíndromo.");
	}
	
	}
}

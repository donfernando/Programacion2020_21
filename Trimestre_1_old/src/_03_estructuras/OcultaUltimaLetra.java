package _03_estructuras;
import java.util.Scanner;

public class OcultaUltimaLetra {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String frase, frResult;
		char[] fraseTabla;
		int pos,contador = 0;
		char chActual;
		char ultChar;

		System.out.println("Introduce una frase");
		frase = in.nextLine();
		fraseTabla = frase.toCharArray();
		ultChar = Character.toLowerCase(fraseTabla[fraseTabla.length-1]);
		
		for (pos = 0; pos < fraseTabla.length; pos++) {
			chActual = Character.toLowerCase(fraseTabla[pos]);
			if (chActual == ultChar) {
				contador++;
				fraseTabla[pos] = '?';
			}
		}
		frResult = new String(fraseTabla);
		System.out.println("El caracter '" + ultChar + "' sale " + contador + " vez/veces");
		System.out.println(frResult);
	}                 
}

package _03_estructuras;

import java.util.Scanner;

public class OcultaConsonantesEnLaTabla {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String frase, frResult;
		char[] fraseTabla;
		int pos;
		char ch;

		System.out.println("Introduzca frase...");
		frase = in.nextLine();
		fraseTabla = frase.toCharArray();

		for (pos = 0; pos < frase.length(); pos++) {
			ch = Character.toLowerCase(fraseTabla[pos]);
			// ch = Character.toLowerCase(ch);
			if (Character.isLetter(ch) & ch != 'a' & ch != 'e' & ch != 'i' & ch != 'o' & ch != 'u')
				fraseTabla[pos] = '*';
		}

		frResult = new String(fraseTabla);
		System.out.println(frResult);
		in.close();
	}
}

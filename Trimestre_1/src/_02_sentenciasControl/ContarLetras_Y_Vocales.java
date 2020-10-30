package _02_sentenciasControl;
import java.util.Scanner;

public class ContarLetras_Y_Vocales {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int contA,contE,contI,contO,contU;
		int contLetras=0;
		String frase;
		char ch;
		int pos;

		contA=contE=contI=contO=contU=0;
		System.out.println("Escribe una frase");
		frase = in.nextLine();
		for (pos=0;pos<=frase.length()-1;pos++) {
			ch = frase.charAt(pos);
			ch = Character.toLowerCase(ch);
			if (Character.isLetter(ch)) {
				contLetras = contLetras+1;
				switch (ch) {
				case 'a':
					contA++;
					break;
				case 'e':
					contE++;
					break;
				case 'i':
					contI++;
					break;
				case 'o':
					contO++;
					break;
				case 'u':
					contU++;
					break;
				}
			}
		}
		System.out.println("Letras: "+contLetras);
		System.out.println("Aes: "+contA);
		System.out.println("Ees: "+contE);
		System.out.println("Ies: "+contI);
		System.out.println("Oes: "+contO);
		System.out.println("Ues: "+contU);
		in.close();
	}


}


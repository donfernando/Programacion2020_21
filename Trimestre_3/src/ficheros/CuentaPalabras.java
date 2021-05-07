package ficheros;

import java.io.FileReader;

public class CuentaPalabras {

	public static void main(String[] args) {

		int i;
		char antCaracter = ' ';
		int contPalabras = 0;
		int code;
		char ch;

		try {
			FileReader frase = new FileReader("input.txt");
			code = frase.read();
			System.out.println("Data in the file:");
			while (code != -1) {
				ch = (char) code;
				System.out.print(ch);
				if (Character.isLetter(ch) & !(Character.isLetter(antCaracter)))
					contPalabras++;
				antCaracter = ch;
				code=frase.read();
			}
			
			System.out.println("\n---> Hay " + contPalabras + " palabras en el fichero");
			frase.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
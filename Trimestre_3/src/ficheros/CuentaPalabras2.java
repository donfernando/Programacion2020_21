package ficheros;

import java.io.FileReader;

public class CuentaPalabras2 {

	public static void main(String[] args) {
		char[] datos= new char[100]; 
		int pos;
		char antCaracter = ' ';
		int contPalabras = 0;
		int charLeidos;

		try {
			FileReader frase = new FileReader("input.txt");
			charLeidos = frase.read(datos);
			System.out.println("Data in the file:");
			while (charLeidos!=-1) {
				for (pos = 0; pos < charLeidos; pos++) {
					System.out.print(datos[pos]);
					if (Character.isLetter(datos[pos]) & !(Character.isLetter(antCaracter)))
						contPalabras++;
					antCaracter = datos[pos];
				}
				charLeidos = frase.read(datos);
			}
			System.out.println("\n---> Hay " + contPalabras + " palabras en el fichero");
			frase.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
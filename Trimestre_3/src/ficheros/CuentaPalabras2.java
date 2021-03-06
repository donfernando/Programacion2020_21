package ficheros;

import java.io.FileReader;
import java.io.StringReader;

public class CuentaPalabras2 {

	public static void main(String[] args) {
		char[] datos= new char[100]; 
		int pos;
		char antCaracter = ' ';
		int contPalabras = 0;
		int charLeidos;

		try {
			//FileReader entrada = new FileReader("input.txt");
			StringReader entrada = new StringReader("input.txt");
			charLeidos = entrada.read(datos);
			System.out.println("Data in the file:");
			while (charLeidos!=-1) {
				for (pos = 0; pos < charLeidos; pos++) {
					System.out.print(datos[pos]);
					if (Character.isLetter(datos[pos]) & !(Character.isLetter(antCaracter)))
						contPalabras++;
					antCaracter = datos[pos];
				}
				charLeidos = entrada.read(datos);
			}
			System.out.println("\n---> Hay " + contPalabras + " palabras en el fichero");
			entrada.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
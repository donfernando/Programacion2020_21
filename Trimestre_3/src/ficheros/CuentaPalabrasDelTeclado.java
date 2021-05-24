package ficheros;

import java.io.InputStreamReader;

public class CuentaPalabrasDelTeclado {
	public static void main(String[] args) {
		char antCaracter = ' ';
		int contPalabras = 0;
		char ch;
		int code;

		try {
			InputStreamReader lectorCaracteres = new InputStreamReader(System.in);
			System.out.println("Introduzca un texto acabado en el caracter 'ö' ... \n");
			
			while ((code = lectorCaracteres.read()) != -1 && (ch=(char)code)!='ö') {
				// Procesamiento
				if (Character.isLetter(ch) & !(Character.isLetter(antCaracter)))
					contPalabras++;
				antCaracter = ch;
			}
			System.out.println("\n---> Se han contado " + contPalabras + " palabras.");
			lectorCaracteres.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
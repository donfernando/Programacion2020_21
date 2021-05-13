package pruebas;

import java.io.FileReader;

public class PruebaFicheros {

	public static void main(String[] args) {
		FileReader fichero;
		int  palabras;
		try {
			fichero = new FileReader("input.txt");
// TODO Ejercicio propuesto
//			palabras = Ejercicios.cuentaPalabras(fichero);
//			System.out.println("Palabras: "+palabras);
			fichero.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
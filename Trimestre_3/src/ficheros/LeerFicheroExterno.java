package ficheros;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerFicheroExterno {

	public static void main(String[] args) throws IOException {
		int code;
		char ch;
		FileInputStream fichero;
		InputStreamReader lectorCaracteres;
		int caracteres = 0;

		if (args.length < 2)
			System.err.println("El formato debe ser:\n" + "java LeerFicheroExterno <nombreFichero> <charSet>");
		else {
			fichero = new FileInputStream(args[0]);
			lectorCaracteres = new InputStreamReader(fichero, args[1]);
			// lectorCaracteres = new InputStreamReader(System.in);

			code = lectorCaracteres.read();
			while (code != -1) {
				ch = (char) code;
				// PROCESARLO
				caracteres++;
				System.out.print(ch);

				code = lectorCaracteres.read();
			}
			lectorCaracteres.close();
			fichero.close();
			System.out.println("Hay " + caracteres + " caracteres");
		}
	}
}

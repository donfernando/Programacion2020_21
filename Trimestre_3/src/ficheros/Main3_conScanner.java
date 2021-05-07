package ficheros;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main3_conScanner {
	public static void main(String[] args) {
		try {
			String line;
			int cont = 0, contPalabras = 0;
			int pos;
			char antCaracter;
			// Creates a reader using the FileReader
			Scanner input = new Scanner(new File("input.txt"));
			//Scanner input = new Scanner("tururu tarari uno,dos.");

			System.out.println("Data in the file: ");
			// Reads characters
			while (input.hasNextLine()) {
				antCaracter = ' ';
				line = input.nextLine();
				for (pos = 0; pos < line.length(); pos++) {
					if (Character.isLetter(line.charAt(pos)) & !(Character.isLetter(antCaracter)))
						contPalabras++;
					antCaracter = line.charAt(pos);
				}

				System.out.printf("%d: %s\n", ++cont, line);
			}
			System.out.printf(">> %d líneas.\n", cont);
			System.out.printf(">> %d palabras.\n", contPalabras);

			input.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
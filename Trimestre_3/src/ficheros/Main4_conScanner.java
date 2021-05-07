package ficheros;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4_conScanner {
	public static void main(String[] args) {
		int tot = 0;
		Scanner input = new Scanner("10 2\n3 4 \nn 4 1");

		while (input.hasNext()) {
			try {
				tot += input.nextInt();
			} catch (InputMismatchException e) {
				input.next();
			}
		}
		System.out.printf(">> Total: %d \n", tot);

		input.close();
	}
}
package practicasExamen;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {
		int numeroAc, numeroAn = Integer.MIN_VALUE;
		try(Scanner in = new Scanner(new File(args[0]));
			FileWriter fw = new FileWriter(args[1])) {
			while (in.hasNext()) {
				try {
					//numeroAc = Integer.parseInt(in.next());
					numeroAc = in.nextInt();
					if (numeroAc < numeroAn) 
						fw.write("\n");
					fw.write(numeroAc+" ");
					numeroAn = numeroAc;
				} catch (InputMismatchException e) {
					in.next();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
package ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lee_conScanner {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("salida.dat"));
		int num;
		System.out.println(input.next());
		//while (input.hasNext()) {
			num=input.nextInt();
			System.out.println(num);
		//}
		input.close();
	}
}
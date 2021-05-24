package ficheros;

import java.io.*;
import java.util.Scanner;

public class MediaNumerosFichero_v2 {
	public static void main(String[] args) throws IOException {
		FileWriter mediaFW;
		FileOutputStream mediaFOS;
		float total = 0;
		String strNum;
		float numero;
		float media;
		int contNumeros = 0;
		String linea;
		Scanner troceador= new Scanner(new File("numeros.txt"));
		

		while(troceador.hasNext()) {
			strNum = troceador.next();
			try {
				numero = Integer.parseInt(strNum);			
				contNumeros++;
				total += numero;
			} catch (NumberFormatException e) {	}
		}
		media = total / contNumeros;
		
		// Fichero de texto
		mediaFW = new FileWriter("media.txt");
		BufferedWriter media2 = new BufferedWriter(mediaFW);
		media2.write(media+"");
		media2.newLine();
		//mediaFW.write(media + "\n");

		// Fichero binario
		mediaFOS = new FileOutputStream("media.dat");
		DataOutputStream media3 = new DataOutputStream(mediaFOS);
		media3.writeFloat(media);

		// En la consola
		System.out.println(media);

		media3.close();
		mediaFOS.close();
		
		media2.close();
		mediaFW.close();
		
		troceador.close();
	}
}
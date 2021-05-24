package ficheros;

import java.io.*;
import java.util.Scanner;

public class MediaNumerosFichero {
	public static void main(String[] args) throws IOException {
		FileReader file;
		BufferedReader lecCaract;
		FileWriter mediaFW;
		FileOutputStream mediaFOS;
		BufferedWriter salidaDatosTexto;
		DataOutputStream salidaDatosBinarios;
		
		PrintWriter pw;
		
		
		float total = 0;
		String strNum;
		float numero;
		float media;
		int contNumeros = 0;
		String linea;
//		Scanner troceador= new Scanner(new File("numeros.txt"));
		Scanner troceador;
		
		file = new FileReader("numeros.txt");
		lecCaract = new BufferedReader(file);

		linea = lecCaract.readLine();
		while (linea != null) {
			troceador = new Scanner(linea);
			while(troceador.hasNext()) {
				strNum = troceador.next();
				try {
					numero = Integer.parseInt(strNum);			
					contNumeros++;
					total += numero;
				} catch (NumberFormatException e) {	}
			}
			linea = lecCaract.readLine();
		}
		media = total / contNumeros;
		
		// Fichero de texto
		mediaFW = new FileWriter("media.txt");
		
		//Opcion 1
		salidaDatosTexto = new BufferedWriter(mediaFW);
		salidaDatosTexto.write(media+"");
		salidaDatosTexto.newLine();
		
		//Opcion 2
		//mediaFW.write(media + "\n");

		// Opcion 3
		/*
		pw = new PrintWriter(mediaFW);
		//pw.println(media);
		pw.printf("%2f\n",media);
		pw.close();
		*/
		
		// Fichero binario
		mediaFOS = new FileOutputStream("media.dat");
		salidaDatosBinarios = new DataOutputStream(mediaFOS);
		salidaDatosBinarios.writeFloat(media);

		// En la consola
		System.out.println(media);

		salidaDatosBinarios.close();
		mediaFOS.close();
		
		salidaDatosTexto.close();
		mediaFW.close();
		
		lecCaract.close();
		file.close();
	}
}
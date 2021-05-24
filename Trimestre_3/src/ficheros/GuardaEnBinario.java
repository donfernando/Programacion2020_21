package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class GuardaEnBinario {

	public static void main(String[] args) {
		char tipoD;
		String numeroLineSTR;
		int numeroLine;
		String str;
		FileReader file=null;
		BufferedReader buffer=null;
		FileWriter fichNue=null;
		BufferedWriter bufferWr=null;
		FileOutputStream fichBinario=null;
		DataOutputStream binario=null;
		// pedira 3 argumentos el 1º es el nombre del fichero "input" 2º sera el nombre
		// con el que se guardara el fichero de txt
		// y por ultimo 3º sera el nombre con el cual se va a guardar el binario

		try {
			file = new FileReader(args[0]);// fichero entrada
			buffer = new BufferedReader(file);
			fichNue = new FileWriter(args[1]);// fichero salida texto
			bufferWr = new BufferedWriter(fichNue);
			fichBinario = new FileOutputStream(args[2]);// fichero salida "binario"
			binario = new DataOutputStream(fichBinario);
			while ((str = buffer.readLine()) != null) {
				tipoD = str.charAt(0);// coge la primera pos que es donde se encuentra la opcion del switch
				numeroLineSTR = str.substring(2);// coge la tercera posision del string que es donde esta el numero de
													// datos
				numeroLine = Integer.parseInt(numeroLineSTR);// pasa el char a int para usarlo en los bucles
				switch (tipoD) {

				case 'F':
					float flo;
					for (int i = 0; i < numeroLine; i++) {
						str = buffer.readLine();
						flo = Float.parseFloat(str);
						System.out.println(flo);
						bufferWr.write(flo + "\n");
						binario.writeFloat(flo);
					}
					break;

				case 'D':
					Double dou;
					for (int i = 0; i < numeroLine; i++) {
						str = buffer.readLine();
						dou = Double.parseDouble(str);
						System.out.println(dou);
						bufferWr.write(dou + "\n");
						binario.writeDouble(dou);
					}
					break;

				case 'C':
					char cha;
					for (int i = 0; i < numeroLine; i++) {
						str = buffer.readLine();
						cha = str.charAt(0);
						System.out.println(cha);
						bufferWr.write(cha + "\n");
						binario.writeChar(cha);
					}
					break;

				case 'B':
					Boolean boo;
					for (int i = 0; i < numeroLine; i++) {
						str = buffer.readLine();
						boo = Boolean.parseBoolean(str);
						System.out.println(boo);
						bufferWr.write(boo + "\n");
						binario.writeBoolean(boo);
					}
					break;
				case 'S':
					for (int i = 0; i < numeroLine; i++) {
						str = buffer.readLine();
						System.out.println(str);
						bufferWr.write(str + "\n");
						binario.writeUTF(str);
					}
					break;

				case 'I':
					int ent;
					for (int i = 0; i < numeroLine; i++) {
						str = buffer.readLine();
						ent = Integer.parseInt(str);
						System.out.println(ent);
						bufferWr.write(ent + "\n");
						binario.writeInt(ent);
					}

					break;

				case 'L':
					Long lon;
					for (int i = 0; i < numeroLine; i++) {
						str = buffer.readLine();
						lon = Long.parseLong(str);
						System.out.println(lon);
						bufferWr.write(lon + "\n");
						binario.writeLong(lon);
					}
					break;
				}
			}
		} catch (IOException e) {
			e.getStackTrace();
		} finally {
			try {
				binario.close();
				fichBinario.close();
				bufferWr.close();
				fichNue.close();
				buffer.close();
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
package ficheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class LeeFloats {
	public static void main(String[] args) {
		FileInputStream fi;
		DataInputStream dis;
		
		try {
			fi=new FileInputStream("numeros.dat");
			dis =  new DataInputStream(fi);
			try {
				while(true) {
					System.out.println("Número: "+dis.readFloat());	
				}
			} catch (EOFException e) {}

			dis.close();
			fi.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

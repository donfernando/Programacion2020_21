package ficheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class LeeDatos {
	public static void main(String[] args) {
		FileInputStream fi;
		DataInputStream dis;
		
		try {
			fi=new FileInputStream("datos.dat");
			dis =  new DataInputStream(fi);
			System.out.println("Dato: "+dis.readFloat());	
			System.out.println("Dato: "+dis.readUTF());	
			System.out.println("Dato: "+dis.readBoolean());	


			dis.close();
			fi.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

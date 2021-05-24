package ficheros.ejerDni;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;

public class Ficheros {
	/* private Ficheros() {
	   }
	*/

	public static void guardar(Iterator<Carnet> i, String nFich) {		
		guardar(i, nFich,false);
	}

	public static void guardar(Iterator<Carnet> i, String nFich, boolean añade) {		
		try {
			FileOutputStream fo = new FileOutputStream(nFich,añade);
			DataOutputStream dos = new DataOutputStream(fo);
			Carnet dato;
			
			while(i.hasNext()) {
				dato=i.next();
				dos.writeUTF(dato.getNombre());
				dos.writeLong(dato.getNumero());
				dos.writeChar(dato.getLetra());
				dos.writeFloat(dato.getAltura());
			}
			dos.close();
			fo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void listar(String nFich) {
		Carnet dni;
		try {
			FileInputStream fi = new FileInputStream(nFich);
			DataInputStream dis = new DataInputStream(fi);
			try {
				while (true) {
					dni = new Carnet(dis.readUTF(),dis.readLong(),dis.readChar(),dis.readFloat());
					System.out.println(dni);
					/*
					System.out.println("Nombre: "+dis.readUTF());
					System.out.println("DNI: "+dis.readLong()+"-"+dis.readChar());
					System.out.println("Altura: "+dis.readFloat());
					*/
				}
			} catch (EOFException e) {}
			dis.close();
			fi.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}

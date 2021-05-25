package pruebas;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

import ficheros.ejerDni.Carnet;

public class PruebaFicherosLeeObjetosDNI {

	public static void main(String[] args) throws IOException, ClassNotFoundException{		
		LinkedList<Carnet> l = new LinkedList<Carnet>();

		FileInputStream fis= new FileInputStream("documentosDNI.binario");
		ObjectInputStream ois = new ObjectInputStream(fis);
		int tam=ois.readInt();
		for (int i = 0; i < tam; i++) {
			l.add((Carnet)ois.readObject());			
		}
		ois.close();
		fis.close();
		//System.out.println(l);
		/*
		Iterator<Carnet> i = l.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		*/
		for (Carnet carnet : l) {
			System.out.println(carnet);
		}
	}
}





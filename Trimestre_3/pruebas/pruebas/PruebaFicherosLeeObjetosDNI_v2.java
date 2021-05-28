package pruebas;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

import ficheros.ejerDni.Carnet;

public class PruebaFicherosLeeObjetosDNI_v2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{		
		FileInputStream fis= new FileInputStream("documentosDNI.binario");
		ObjectInputStream ois = new ObjectInputStream(fis);
		LinkedList<Carnet> l;
		
		//l=(LinkedList<Carnet>)ois.readObject();			
		l=new LinkedList<>();
		int tam=ois.readInt();
		for (int i = 0; i < tam; i++) {
			l.add((Carnet)ois.readObject());
		}
		
		//System.out.println(l);
		for (Carnet carnet : l) {
			System.out.println(carnet);
		}

		ois.close();
		fis.close();
	}
}





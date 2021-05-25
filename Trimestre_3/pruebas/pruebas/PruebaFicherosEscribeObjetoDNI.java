package pruebas;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedList;

import ficheros.ejerDni.Carnet;

public class PruebaFicherosEscribeObjetoDNI {

	public static void main(String[] args) throws IOException{		
		LinkedList<Carnet> l = new LinkedList<Carnet>();
		l.add(new Carnet("Manolo",12345L,'D',1.67f));
		l.add(new Carnet("Mañoli",566234L,'F',1.82f));
		l.add(new Carnet("Julio Iglesias",277543L,'A',1.35f));
		l.add(new Carnet("Yo",20000L,'L',1.03f));

		//ByteArrayOutputStream 
		FileOutputStream fos= new FileOutputStream("documentosDNI.binario");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Iterator<Carnet> i = l.iterator();
		oos.writeInt(l.size());
		while(i.hasNext())
			oos.writeObject(i.next());
		
		oos.close();
		fos.close();
	}
}





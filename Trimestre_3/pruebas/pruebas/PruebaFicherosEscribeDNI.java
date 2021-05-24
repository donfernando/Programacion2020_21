package pruebas;

import java.util.Iterator;
import java.util.LinkedList;

import ficheros.ejerDni.Carnet;
import ficheros.ejerDni.Ficheros;

public class PruebaFicherosEscribeDNI {

	public static void main(String[] args) {		
		LinkedList<Carnet> l = new LinkedList<Carnet>();
		l.add(new Carnet("Manolo",12345L,'D',1.67f));
		l.add(new Carnet("Mañoli",566234L,'F',1.82f));
		l.add(new Carnet("Julio Iglesias",277543L,'A',1.35f));

		Iterator<Carnet> i=l.iterator();
		i.next();
		Ficheros.guardar( i , "listaDNIs.dat");
	}
}
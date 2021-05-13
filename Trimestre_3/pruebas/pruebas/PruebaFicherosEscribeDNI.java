package pruebas;

import java.util.LinkedList;

import ficheros.ejerDni.Carnet;
import ficheros.ejerDni.Ficheros;

public class PruebaFicherosEscribeDNI {

	public static void main(String[] args) {		
		LinkedList<Carnet> l = new LinkedList<Carnet>();
		l.add(new Carnet("Manolo",12345L,'D',1.67f));
		l.add(new Carnet("Manoli",566234L,'F',1.82f));
		l.add(new Carnet("Julio Iglesias",277543L,'A',1.35f));

		Ficheros.guardar(l.iterator(), "listaDNIs.dat",  false);
	}

}

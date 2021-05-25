package ficheros.objetos;

import java.util.LinkedList;

public class SerializarObjetoBinarioSobreFicheroDeTexto {

	public static void main(String[] args) {
		LinkedList<Botella> l = new LinkedList<Botella>();
		l.add(new Botella());
		l.add(new Botella(1));
		l.add(new Botella(.2f));
		l.add(new Botella(.7f));
		l.get(0).cerrar();
		l.get(l.size()-1).cerrar();
		
		
		
	}

}

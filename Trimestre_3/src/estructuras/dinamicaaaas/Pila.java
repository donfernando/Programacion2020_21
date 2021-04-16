package estructuras.dinamicaaaas;


import interfaces.Apilable;
import interfaces.YaApiladoException;

public class Pila {
	private static class Nodo{
		Apilable dato;
		Nodo debajo;
	}
	
	private Nodo cima;  // = null;
	
	public void apilar(Apilable dato) {
		Nodo nuevo;
		try {	
				dato.apilar();
				nuevo = new Nodo();
				nuevo.dato=dato;
				nuevo.debajo=cima;
				cima=nuevo;		
		} catch (YaApiladoException e) {
		}		
	}
	public Apilable desapilar() {
		Apilable aux;		
		aux=

				
		return aux;
	}

	public boolean vacia() {
		return cima==null;
	}
	
	@Override
	public String toString() {
		String s="[";
		int i;
		for (i = 0; i < cima; i++) {
			s += datos[i]+",";		
		}
		if(cima!=-1)
			s += datos[i];
		s += '[';
		return s;
	}	
	
}
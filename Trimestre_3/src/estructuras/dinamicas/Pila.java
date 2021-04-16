package estructuras.dinamicas;

import interfaces.Apilable;
import interfaces.YaApiladoException;

public class Pila {

	private static class Nodo{
		Apilable dato;
		Nodo debajo;
	}
	private Nodo cima;   //=null;
	
	public void apilar(Apilable dato) {
		Nodo nuevo;
		try {
			dato.apilar();
			nuevo=new Nodo();
			nuevo.dato=dato;
			nuevo.debajo=cima;
			cima=nuevo;
		} catch (YaApiladoException e) {
		}
		
	}
	public Apilable desapilar() {
		Apilable aux;		
		aux=cima.dato;
		aux.desapilar();
		cima=cima.debajo;
		return aux;
	}

	public boolean vacia() {
		return cima==null;
	}
}
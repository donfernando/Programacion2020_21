package estructuras.dinamicas;


import interfaces.Apilable;
import interfaces.YaApiladoException;

public class Pila {
	private static class Nodo{
		Apilable dato;
		Nodo debajo;
		Nodo(Apilable d, Nodo n) {
			dato=d;
			debajo=n;
		}
	}
	
	private Nodo cima;  // = null;
	
	public void apilar(Apilable dato) {
		Nodo nuevo;
		try {	
				dato.apilar();
				nuevo = new Nodo(dato,cima);
				//nuevo = new Nodo();
				//nuevo.dato=dato;
				//nuevo.debajo=cima;
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
	
	
	@Override
	public String toString() {
		String s="";
		Nodo i;
		i=cima;
		while(i != null) {
			//s = s + i.dato+",";
			s = i.dato+","+ s;
			i=i.debajo;
		}
		if(!vacia())
			s=s.substring(0, s.length()-1);
		s='['+s+'[';
		return s;
	}
	
	
}
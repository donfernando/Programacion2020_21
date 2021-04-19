package estructuras.dinamicas;


import interfaces.Apilable;
import interfaces.YaApiladoException;

public class Pila_toStringRecursivo {

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
	
	
	// implementación recursiva para terminar con el elemento de la cima.
	@Override
	public String toString() {
		String s;
		Nodo i;
		i=cima;
		s="["+losQueQuedan(i);
		if(!vacia())
			s=s.substring(0, s.length()-1);
		s+='[';
		return s;
	}
	private String losQueQuedan(Nodo i) {
		String s="";
		if(i!=null)
//			s=i.dato+","+losQueQuedan(i.debajo);
			s=losQueQuedan(i.debajo)+i.dato+",";
		return s;
	}
	
}
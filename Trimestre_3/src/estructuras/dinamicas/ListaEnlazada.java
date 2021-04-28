package estructuras.dinamicas;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaEnlazada implements Iterable{
	private static class Nodo {
		Object dato;
		Nodo sig;
	}

	private Nodo falsoNodoInicial = new Nodo();
	private int size;
	
	public void add(Object obj) {
		Nodo i = falsoNodoInicial;
		Nodo nuevo;

		while (i.sig != null)
			i = i.sig;
		nuevo = new Nodo();
		nuevo.dato = obj;
		// nuevo.sig=null;
		i.sig = nuevo;
		size++;
	}

	public void add(int pos, Object obj) {
		if (pos < 0 | pos > size()) {
			throw new RuntimeException();
		}
		Nodo nuevo = new Nodo();
		nuevo.dato = obj;
		Nodo nodoAnterior;
		nodoAnterior = falsoNodoInicial;
		while (pos != 0) {
			nodoAnterior = nodoAnterior.sig;
			pos--;
		}
		nuevo.sig = nodoAnterior.sig;
		nodoAnterior.sig = nuevo;
		size++;
	}

	public void set(int pos, Object obj) {
		if (pos < 0 | pos >= size()) {
			throw new RuntimeException();
		}
		int i = 0;
		Nodo nodoActual;
		nodoActual = falsoNodoInicial.sig;
		while (pos != i) {
			nodoActual = nodoActual.sig;
			i++;
		}
		nodoActual.dato=obj;
	}
	public Object get(int pos) {
		if (pos < 0 | pos >= size()) {
			throw new RuntimeException();
		}
		int i = 0;
		Nodo nodoActual;
		nodoActual = falsoNodoInicial.sig;
		while (pos != i) {
			nodoActual = nodoActual.sig;
			i++;
		}
		return nodoActual.dato;
	}

	public Object remove(int pos) {
		Nodo nodoAnterior;
		int j = 0;
		Object aux;
		
		if (pos < 0 | pos >= size()) {
			throw new RuntimeException();
		}
		nodoAnterior = falsoNodoInicial;
		while (pos != j) {
			nodoAnterior = nodoAnterior.sig;
			j++;
		}
		aux = nodoAnterior.sig.dato;

		nodoAnterior.sig = nodoAnterior.sig.sig;
		size--;
		return aux;
	}

	public int size() {
		return size;
	}

	public void vaciar() {
		falsoNodoInicial.sig = null;
		size=0;
	}

	/*
	@Override
	public String toString() {
		Iterator   
		return .....;
	}
*/	
	public Iterator iterator() {
		return new Desplazarse();
	} 
	
	
	private class Desplazarse implements Iterator {
		private Nodo actual=falsoNodoInicial;
		
		public boolean hasNext() {
			return actual.sig != null; 
		} 
		public Object next(){
			if(!hasNext())
				throw new NoSuchElementException("No hay mas elementos en la lista.");
			actual= actual.sig;
			return actual.dato;
			} 
		 }
	
	 
}

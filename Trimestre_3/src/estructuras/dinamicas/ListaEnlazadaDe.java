package estructuras.dinamicas;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaEnlazadaDe<T> implements Iterable<T> {
	private class Nodo {
		T dato;
		Nodo sig;
	}

	private Nodo falsoNodoInicial = new Nodo();
	private int size;

	public void add(T obj) {
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

	public void add(int pos, T obj) {
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

	public void set(int pos, T obj) {
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
		nodoActual.dato = obj;
	}

	public T get(int pos) {
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

	public T remove(int pos) {
		Nodo nodoAnterior;
		int j = 0;
		T aux;

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
		size = 0;
	}

	@Override
	public String toString() {
		String s = "";
		Iterator<T> i;
		i = iterator();
		while (i.hasNext()) {
			s += i.next() + ",";
		}
		if (size() != 0)
			s = s.substring(0, s.length() - 1);
		s = '[' + s + ']';
		return s;
	}
	/*
	 * @Override public String toString() { String s=""; Nodo i;
	 * i=falsoNodoInicial.sig; while(i != null) { s += i.dato+","; i=i.sig; }
	 * if(falsoNodoInicial.sig!=null) s=s.substring(0, s.length()-1); s='['+s+']';
	 * return s; }
	 */

	public Iterator<T> iterator() {
		return new Desplazarse();
	}

	private class Desplazarse implements Iterator<T> {
		private Nodo actual = falsoNodoInicial;

		public boolean hasNext() {
			return actual.sig != null;
		}

		public T next() {
			if (!hasNext())
				throw new NoSuchElementException("No hay mas elementos en la lista.");
			actual = actual.sig;
			return actual.dato;
		}
	}
}

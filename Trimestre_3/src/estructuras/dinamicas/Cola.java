package estructuras.dinamicas;

public class Cola {
	private static class Nodo {
		Object dato;
		Nodo next;
	}

	private Nodo cabeza;
	private Nodo cola;

	public void acolar(Object dato) {
		Nodo nuevo = new Nodo();
		nuevo.dato = dato;
		if (cabeza == null) {
			cabeza = nuevo;
		} else {
			cola.next = nuevo;
		}
		cola = nuevo;
	}

	public Object desacolar() {
		Object aux;
		aux = cabeza.dato;
		cabeza = cabeza.next;
		if(cabeza==null)
			cola=null;
		return aux;
	}

	public boolean vacia() {
		return cabeza == null;
	}
}
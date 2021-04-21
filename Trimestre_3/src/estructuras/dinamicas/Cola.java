package estructuras.dinamicas;


public class Cola {
	private static class Nodo {
		Object dato;
		Nodo next;
	}

	private Nodo cabeza; // =null;
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
		// opcional
		if(cabeza==null)
			cola=null;
		
		return aux;
	}

	public boolean vacia() {
		return cabeza == null;
	}
	
	public boolean contains(Object dato) {
		
	}
	
	
	@Override
	public String toString() {
		String s="";
		Nodo i;
		i=cabeza;
		while(i != null) {
			s = i.dato+","+ s;
			i=i.next;
		}
		if(!vacia())
			s=s.substring(0, s.length()-1);
		s='['+s+'}';
		return s;
	}
	
	
}
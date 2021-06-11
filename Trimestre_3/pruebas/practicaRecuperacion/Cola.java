package practicaRecuperacion;

public class Cola<T> {
	private int cabeza = 1;
	private int cola;
	private Object[] datos;
	private final static int TAM = 10;

	public Cola() {
		this(TAM);
	}

	public Cola(int tam) {
		datos = new Object[tam+1];
	}

	public boolean vacia() {
		return sig(cola) == cabeza;
	}

	public boolean llena() {
		return sig(sig(cola)) == cabeza;
	}

	public void acolar(T dato) {
		if (llena()) 
			throw new RuntimeException();
		cola = sig(cola);
		datos[cola] = dato;
	}
	
	@SuppressWarnings("unchecked")
	public T desacolar() {
		T aux;
		if (vacia()) 
			throw new RuntimeException();
		
		aux = (T)datos[cabeza];
		cabeza = sig(cabeza);
		return aux;
	}

	public String toString() {
		int i;
		String txt="[";
		if(!vacia()) {
			i = cabeza;
			while(i!=cola) {
				txt += datos[i] + ", ";
				i=sig(i);
			}
			txt += datos[i];
		}
		txt += "]";
		return txt;
	}

	private int sig(int num) {
		if (num == datos.length - 1) {
			return 0;
		} else {
			return num + 1;
		}
	}
}
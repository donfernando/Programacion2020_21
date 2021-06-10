package practicaRecuperacion;

public class ColaCircular {
	private int cabeza = 1;
	private int cola;
	private Object[] datos;
	private final static int TAM = 10;

	public ColaCircular() {
		//datos = new Object[TAM+1];
		this(TAM);
	}

	public ColaCircular(int tam) {
		datos = new Object[tam+1];
	}

	public boolean vacia() {
		return sig(cola) == cabeza;
	}

	public boolean llena() {
		return sig(sig(cola)) == cabeza;
	}

	public void acolar(Object insertar) {
		if (llena()) 
			throw new RuntimeException();
		cola = sig(cola);
		datos[cola] = insertar;
	}
	public Object desacolar() {
		Object extraer;
		if (vacia()) 
			throw new RuntimeException();
		extraer = datos[cabeza];
		cabeza = sig(cabeza);
		return extraer;
	}

	//public String toString()
	
	public void mostrar() {
		int i;
		System.out.print("[");
		if(!vacia()) {
			i = cabeza;
			while(i!=cola) {
				System.out.print(datos[i] + ", ");
				i=sig(i);
			}
			System.out.print(datos[i]);
		}
		System.out.println("]");
	}

	private int sig(int num) {
		if (num == datos.length - 1) {
			return 0;
		} else {
			return num + 1;
		}
	}
}
package minik.java;


public class TablaDeStrings_tamFijo {
	private String[] datos;
	private int size;
	private int modCount;

	public TablaDeStrings_tamFijo() {
		this(10);
		// datos= new String[10];
	}

	public TablaDeStrings_tamFijo(int tam) {
		datos = new String[tam];
		// size=0;
		// modCount=0;
	}

	public int size() {
		return size;
	}

	public boolean add(String s) {
		boolean cabe;
		if (size < datos.length) {
			cabe = true;
			datos[size] = s;
			size++;
			modCount++;
		} else
			cabe = false;
		return cabe;
	}

	public boolean add(int pos, String s) {
		boolean cabe;
		int i;
		if (pos < 0 || pos > size)
			throw new RuntimeException();
		if (size < datos.length) {
			cabe = true;
			for (i = size; i > pos; i--) {
				datos[i] = datos[i - 1];
			}
			datos[pos] = s;
			size++;
			modCount++;
		} else
			cabe = false;
		return cabe;
	}
	public String remove(int pos) {
		String aux;
		int i;
		if (pos < 0 || pos >= size)
			throw new RuntimeException();
		aux=datos[pos];
		for (i = pos; i < size-1; i++) {
			datos[i]=datos[i+1];
		}
		datos[i]=null;
		size--;
		modCount++;
		return aux;
	}

	public String get(int pos) {
		if (pos < 0 || pos >= size)
			throw new RuntimeException();
		return datos[pos];
	}

	public void set(int pos, String dato) {
		if (pos < 0 || pos >= size)
			throw new RuntimeException();
		datos[pos] = dato;
	}

	@Override
	public String toString() {
		int i;
		String aux = "[";
		for (i = 0; i < size - 1; i++) {
			aux += datos[i] + " , ";
		}
		if (size != 0)
			aux += datos[i];
		aux += "]";
		return aux;
	}

}

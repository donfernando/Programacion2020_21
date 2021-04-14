package ejemplos.Pablo.a;

import ejemplos.Pablo.b.Apilable;
import interfaces.YaApiladoException;

public class Pila {
	Apilable[] datos;
	int pos=0;
	public Pila(int tamax) {
		datos=new Apilable[tamax];
	}
	public Pila() {
		this(10);
	}
	public void apilar(Apilable dato) {
		try {
			if(pos<datos.length) {
				dato.apilar();
				datos[pos]=dato;
				pos++;
			}
		} catch (YaApiladoException e) {
		}		
	}
	public Apilable desapilar() {
		Apilable aux;
		aux=datos[pos-1];
		datos[pos-1]=null;
		pos--;
		aux.desapilar();
		return aux;
	}

	public boolean vacia() {
		return pos==0;
		
	}

}
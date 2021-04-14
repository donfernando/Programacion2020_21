package estructuras;

import interfaces.Apilable;
import interfaces.YaApiladoException;

public class Pila {
	Apilable[] datos;
	int cima=-1;
	public Pila(int tamax) {
		datos=new Apilable[tamax];
	}
	public Pila() {
		this(10);
	}
	public void apilar(Apilable dato) {
		try {
			if(cima<datos.length-1) {
				dato.apilar();
				cima++;
				datos[cima]=dato;
			}
		} catch (YaApiladoException e) {
		}		
	}
	public Apilable desapilar() {
		Apilable aux;		
		aux=datos[cima];
		datos[cima]=null;
		cima--;
		aux.desapilar();
		return aux;
	}

	public boolean vacia() {
		return cima==-1;
	}
}
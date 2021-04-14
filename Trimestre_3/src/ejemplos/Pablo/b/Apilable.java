package ejemplos.Pablo.b;

import interfaces.YaApiladoException;

public interface Apilable {
	void apilar() throws YaApiladoException;
	boolean desapilar();

	
	//apilar() debe apilarse
	//desapilar() tengo que darle una pos de la pila e ir quitando desde (en este caso 10)
	//el ultimo objeto apilado hasta llegar al que me interesa
	
	//vacia devuelve una excepcion que dice vacia\/

}
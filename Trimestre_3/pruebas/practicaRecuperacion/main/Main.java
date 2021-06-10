package practicaRecuperacion.main;

import practicaRecuperacion.ColaCircular;

public class Main {
	public static void main(String[] args) {
		System.out.println("Prueba de cola circular");
		ColaCircular cola = new ColaCircular(5);
		System.out.println("Acolar todos los datos posibles");
		try {
			cola.acolar(1);
			cola.acolar(Integer.valueOf(2));
			cola.acolar(3);
			cola.acolar(4);
			cola.acolar(5);
			cola.acolar(6);
			cola.acolar(7);
			cola.acolar(8);
			cola.acolar(9);
		} catch (RuntimeException e) {}
		
		//System.out.println(datos);
		cola.mostrar();
		
		
		System.out.println();
		System.out.println("¿Esta llena? " + cola.llena());
		System.out.println("¿Esta vacia? " + cola.vacia());
		System.out.println("Desacolar todos los datos posibles");
		
		while(!cola.vacia())
			System.out.println(cola.desacolar());
		
		
		cola.mostrar();
		System.out.println();
		System.out.println("¿Esta vacia? " + cola.vacia());
		System.out.println("¿Esta llena? " + cola.llena());
	}

}

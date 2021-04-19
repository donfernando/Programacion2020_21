package pruebas;


import estructuras.dinamicas.Cola;

//import estructuras.dinamicas.Pila_toStringRecursivo;
import pizarra.figuras.Circulo;
import pizarra.figuras.Figura;
import pizarra.figuras.Rectangulo;

public class PruebaCola {

	public static void main(String[] args) {
		Cola cola = new Cola();
		
		Rectangulo r = new Rectangulo(0, 0, 10, 10);
		Rectangulo r2 = new Rectangulo(0, 0, 40, 10);
		Figura c = new Circulo(0, 0, 30);

		System.out.println("Pilas------------------");     
		System.out.println(cola);
		
		cola.acolar(c);
		cola.acolar(c); 
		cola.acolar(r); 
		cola.acolar(r2);
		
		System.out.println("Pilas------------------");     
		System.out.println(cola);
	 

		System.out.println("------------------");     
		while(!cola.vacia())
			System.out.println(cola.desacolar());
	
		     
	}
}

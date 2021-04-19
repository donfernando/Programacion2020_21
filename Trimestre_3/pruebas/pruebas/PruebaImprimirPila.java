package pruebas;


import estructuras.dinamicas.Pila;

//import estructuras.dinamicas.Pila_toStringRecursivo;
import pizarra.figuras.Circulo;
import pizarra.figuras.Figura;
import pizarra.figuras.Rectangulo;

public class PruebaImprimirPila {

	public static void main(String[] args) {
		Pila p = new Pila();
		
		Rectangulo r = new Rectangulo(0, 0, 10, 10);
		Rectangulo r2 = new Rectangulo(0, 0, 40, 10);
		Figura c = new Circulo(0, 0, 30);

		System.out.println("Pilas------------------");     
		System.out.println(p);
		
		p.apilar(c);
		p.apilar(c); //NO
		p.apilar(r); 
		p.apilar(r2);
		
		System.out.println("Pilas------------------");     
		System.out.println(p);
	 

		System.out.println("------------------");     
		while(!p.vacia())
			System.out.println(p.desapilar());
	
		     
	}
}

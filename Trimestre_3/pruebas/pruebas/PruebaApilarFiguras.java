package pruebas;

import estructuras.Pila;
import pizarra.figuras.Circulo;
import pizarra.figuras.Figura;
import pizarra.figuras.Rectangulo;

public class PruebaApilarFiguras {

	public static void main(String[] args) {
		Pila p = new Pila();
		Pila otraPila = new Pila();
		Rectangulo r = new Rectangulo(0, 0, 10, 10);
		Figura c = new Circulo(0, 0, 30);
		p.apilar(c);
		p.apilar(c);
		p.apilar(r);
		// System.out.println(p);
		otraPila.apilar(r);
		
		System.out.println("Pilas------------------");     
		System.out.println(p);
		System.out.println("------------------");     
		System.out.println(otraPila);
		
		System.out.println("------------------");     
		while(!p.vacia())
			System.out.println(p.desapilar());
		System.out.println("------------------");     
		while(!otraPila.vacia())
			System.out.println(otraPila.desapilar());
		     
	}
}

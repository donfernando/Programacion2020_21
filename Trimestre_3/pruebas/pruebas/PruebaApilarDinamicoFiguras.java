package pruebas;

import estructuras.dinamicas.Pila;
import pizarra.figuras.Circulo;
import pizarra.figuras.Figura;
import pizarra.figuras.Rectangulo;

public class PruebaApilarDinamicoFiguras {

	public static void main(String[] args) {
		Pila p = new Pila();
		Pila otraPila = new Pila();
		Rectangulo r = new Rectangulo(0, 0, 10, 10);
		Rectangulo r2 = new Rectangulo(0, 0, 40, 10);
		Figura c = new Circulo(0, 0, 30);
		p.apilar(c);
		p.apilar(c); //NO
		otraPila.apilar(r);
		p.apilar(r); //NO
		p.apilar(r2);
		// System.out.println(p);
		
		
		/*
		System.out.println("Pilas------------------");     
		System.out.println(p);
		System.out.println("------------------");     
		System.out.println(otraPila);
		*/
		System.out.println("------------------");     
		while(!p.vacia())
			System.out.println(p.desapilar());
		System.out.println("------------------");     
		while(!otraPila.vacia())
			System.out.println(otraPila.desapilar());
		     
	}
}

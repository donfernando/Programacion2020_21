package pruebas;

import estructuras.Pila;
import pizarra.figuras.Circulo;
import pizarra.figuras.Figura;
import pizarra.figuras.Rectangulo;

public class PruebaApilarFiguras {

	public static void main(String[] args) {
		Pila p = new Pila();
		Rectangulo r = new Rectangulo(0, 0, 10, 10);
		Figura c = new Circulo(0, 0, 30);
		p.apilar(c);
		p.apilar(c);
		p.apilar(r);
		// System.out.println(p);
		
		while(!p.vacia())
			System.out.println(p.desapilar());
		     
	}
}

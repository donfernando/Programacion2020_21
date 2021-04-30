package pruebas;


import java.util.Iterator;
import java.util.RandomAccess;

import estructuras.dinamicas.ListaEnlazada;
import pizarra.figuras.*;

public class PruebaLista_02b {

	public static void main(String[] args) {
		float areaTotal=0;
		ListaEnlazada l = new ListaEnlazada();

		Rectangulo r = new Rectangulo(0, 0, 10, 10);
		Rectangulo r2 = new Rectangulo(0, 0, 40, 10);
		Figura c = new Circulo(0, 0, 30);

		System.out.println("Lista Vacía------------------");
		System.out.println(l);

		l.add(r);
		l.add(c);
		l.add(r2);
		l.add(1, new Cuadrado(0, 0, 25));

		System.out.println(l instanceof RandomAccess);

		System.out.println("Lista------------------");
		System.out.println(l);		
		
		for(Object obj : l) {
			System.out.println(obj);
			areaTotal+=((Figura)obj).area();
		}
		System.out.println("Area total: "+areaTotal);
	}
}

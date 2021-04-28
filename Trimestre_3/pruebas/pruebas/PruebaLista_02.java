package pruebas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

import estructuras.dinamicas.ListaEnlazada;
import pizarra.figuras.*;

public class PruebaLista_02 {

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

		if (l instanceof RandomAccess) {
			System.out.println("Lista de acceso directo ------------------");
			for (int i = 0; i < l.size(); i++)
				System.out.printf("dato[%d]:%s\n", i, l.get(i));
		}
		else {
			Iterator i;
			Figura f;
			int pos=0;
			i=l.iterator();
			System.out.println("Lista de acceso No directo ------------------");
			while(i.hasNext()) {
				f=(Figura)i.next();
				//System.out.printf("dato[%d]:%s\n",pos,f);
				System.out.println("dato["+pos+"]:"+f);
				pos++;
				areaTotal+=f.area();
			}
			System.out.println("Area total: "+areaTotal);
			
		}

		/*
		for (Figura figura : l) {
			areaTotal+=figura.area();
		}
		System.out.println("Area total: "+areaTotal);
		for (Iterator<Figura> iterator = l.iterator(); iterator.hasNext();) {
			Figura figura = iterator.next();			
		}
		*/
	}
}

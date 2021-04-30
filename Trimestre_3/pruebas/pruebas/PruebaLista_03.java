package pruebas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

import estructuras.dinamicas.ListaEnlazada;
import pizarra.figuras.*;

public class PruebaLista_03 {

	public static void main(String[] args) {
		float areaTotal = 0;
		List<Figura> l = new LinkedList<Figura>();
		//List<Figura> l = new ArrayList<Figura>();
		//ListaEnlazada l = new ListaEnlazada();

		Rectangulo r = new Rectangulo(0, 0, 10, 10);
		Rectangulo r2 = new Rectangulo(0, 0, 40, 10);
		Figura c = new Circulo(0, 0, 30);
		l.add(r);
		l.add(c);
		l.add(r2);
		l.add(1, new Cuadrado(0, 0, 25));

		System.out.println("Lista------------------");
		System.out.println(l);

		Iterator<Figura> i;
		Figura f;
		int pos = -1;
		int pendientesDeBorrar = 2;
		final int POS_A_BORRAR=1;
		i = l.iterator();
		while (i.hasNext() & pos < POS_A_BORRAR) {
			pos++;
			i.next();
		}
		try {
			if (pos == POS_A_BORRAR) {
				i.remove();
				pendientesDeBorrar--;
				while (pendientesDeBorrar != 0 & i.hasNext()) {
					i.next();
					i.remove();
					pendientesDeBorrar--;
				}
			}
		} catch (UnsupportedOperationException e) {
			System.out.println("El elemento no puede ser eliminado con iterator por no impementar la operacion");
			l.remove(POS_A_BORRAR);
			l.remove(POS_A_BORRAR);
		}
		System.out.println(l);
	}
}

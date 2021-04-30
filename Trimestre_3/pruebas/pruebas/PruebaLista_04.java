package pruebas;


import java.util.Iterator;
import estructuras.dinamicas.ListaEnlazadaDe;
import pizarra.figuras.*;

public class PruebaLista_04 {

	public static void main(String[] args) {
		ListaEnlazadaDe<Figura> l = new ListaEnlazadaDe<Figura>();
		
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

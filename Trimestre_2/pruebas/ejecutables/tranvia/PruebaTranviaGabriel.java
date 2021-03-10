package ejecutables.tranvia;

import gabriel.metropolitano.Pasajero;
import gabriel.metropolitano.Tranvia;

public class PruebaTranviaGabriel {

	public static void main(String[] args) {
		Pasajero a = new Pasajero("Ana");
		Tranvia t = new Tranvia();
		t.subir(null, 1);
		t.subir(a, 1);

	}

}

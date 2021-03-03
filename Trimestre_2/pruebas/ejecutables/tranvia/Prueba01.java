package ejecutables.tranvia;


import minik.metropolitano.*;

public class Prueba01 {

	public static void main(String[] args) {
		Pasajero a,j;
		//VagonPasajeros v=new VagonPasajeros(6); DEBE DAR ERROR
		Tranvia tranvia = new Tranvia();
		a=new Pasajero("Ana");
		j=new Pasajero("Julio");
		tranvia.subir(a, 1);
		tranvia.subir(j, 3);
		// tranvia.subir(a, 4); 
	}

}

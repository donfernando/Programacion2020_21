package ejecutables.tranvia;


import minik.metropolitano.*;

public class Prueba02 {

	public static void main(String[] args) {
		Pasajero a,j;
			
		a=new Pasajero("Ana");
		j=new Pasajero("Julio");
		
		System.out.println(a.toString());
		/*
		 * Esto produce error por no se publico el constructor del VagonPasajeros
		VagonPasajeros v = new VagonPasajeros(3);
		v.subir(a);
		v.subir(j);
		System.out.println(v);
		v.bajar("Ana");
		System.out.println(v);
		 */
		
	}

}

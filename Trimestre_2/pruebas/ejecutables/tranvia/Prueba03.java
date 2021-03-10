package ejecutables.tranvia;


import minik.metropolitano.*;

public class Prueba03 {

	public static void main(String[] args) {
		Pasajero a,j;
		
		Tranvia tranvia = new Tranvia();
		
		
		a=new Pasajero("Ana");
		j=new Pasajero("Julio");
		
		
		tranvia.subir(a,1);
		tranvia.subir(j,4);
		tranvia.subir(new Pasajero("Rubén"), 1);
		tranvia.subir(new Pasajero("Jaime"), 1);
		tranvia.subir(new Pasajero("Alicia"), 1);
		tranvia.subir(new Pasajero("Sara"), 1);
		tranvia.subir(new Pasajero("David"), 1);
		tranvia.subir(new Pasajero("Fabiola"), 2);
		//tranvia.subir(new Pasajero("Agonay"), 1);
		System.out.println(tranvia);
		tranvia.bajar("Ana",1);
		tranvia.subir(new Pasajero("Agonay"), 3);
		System.out.println(tranvia);
		
	}

}

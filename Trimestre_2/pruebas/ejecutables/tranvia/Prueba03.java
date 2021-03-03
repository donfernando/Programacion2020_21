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
		System.out.println(tranvia);
		tranvia.bajar("Ana",1);
		System.out.println(tranvia);
		
	}

}

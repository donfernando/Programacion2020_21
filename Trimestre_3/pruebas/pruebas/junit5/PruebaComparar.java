package pruebas.junit5;

import pizarra.figuras.Circulo;
import pizarra.figuras.Rectangulo;

public class PruebaComparar {

	public static void main(String[] args) {
		String a= "Hola";
		String b= "Adios";
		
		System.out.println(a.equals(b));
		System.out.println(a.compareTo(b));  //  <0 ... ==0 ...  >0

		
		System.out.println("___________");
		Rectangulo r1,r2;
		r1=new Rectangulo(0, 0, 122, 18);
		r2=new Rectangulo(0, 0, 15, 15);
		System.out.println(r1.compareTo(r2));
		
		
		System.out.println(elPrimeroEsMenor(r1, r2));
		System.out.println(elPrimeroEsMenor(a, b));

	
		Circulo c1 = new Circulo(0,0,15);
		Circulo c2 = new Circulo(0,0,25);
		c1.compareTo(c2);
		// elPrimeroEsMenor(c1, c2);
	}
	
	static boolean elPrimeroEsMenor(Comparable o1  ,  Comparable o2  ) {
		return o1.compareTo(o2) < 0;
	}
}

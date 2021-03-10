package ejecutables.herencia;

import minik.herencia.PuntoAcotado;
import minik.herencia.PuntoGrueso;

public class Prueba01 {
	public static void main(String[] args) {
		PuntoAcotado[] puntos = new PuntoAcotado[3];
		puntos[0]=new PuntoAcotado();
		puntos[1]=new PuntoGrueso();
		System.out.println(puntos[0]);
		System.out.println(puntos[1]);
		puntos[0].der();
		puntos[1].der();
		System.out.println(puntos[0]);
		System.out.println(puntos[1]);
		
		
	}
}

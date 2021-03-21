package minik.ejercicios;

import minik.java.FuncionesVarias;

public class PruebaEjercicio1 {

	public static void main(String[] args) {
		String[] nombres= {"Ana","Juan","Peter","Agonay"};
		FuncionesVarias.println(nombres);
		Ejercicio1.eliminar(nombres, 2);
		FuncionesVarias.println(nombres);
		
	}

}

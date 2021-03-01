import minik.java.FuncionesNumeros;
import minik.java.FuncionesVarias;

public class PruebaFunc_03 {

	public static void main(String[] args) {
		int[] datos;
		
		datos= FuncionesVarias.tablaEnteros(4);

		FuncionesVarias.println(datos);

		System.out.println(FuncionesNumeros.media(datos));
		

	}

}

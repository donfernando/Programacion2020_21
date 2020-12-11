import java.util.Scanner;

public class PruebaFunciones {
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);

		// ****************************************
		// ** Probando la funcion esTriangular(...)
		int numero;
		System.out.print("Número.- ");
		numero = in.nextInt();
		if(FuncionesNumeros.esTriangular(numero))
			System.out.printf("El número %d es triangular\n", numero);
		else
			System.out.printf("El número %d no es triangular\n", numero);

		
		// **************************************
		// ** Probando la funcion numRomanos(...)
		System.out.printf("...y en números romanos, se escribe así: %s\n", FuncionesNumeros.numRomanos(numero));
		
		
		// *********************************
		// ** Probando la funcion media(...)
		float[] t = { 2, 2, 2 };
		System.out.println(FuncionesNumeros.media( t ) );
		System.out.println(FuncionesNumeros.media( new float[] { 2.5f, 2, 2 } ) );
		System.out.println(FuncionesNumeros.media( new int[] { 2, 12, 232 } ) );
		
		
		// *************************************
		// ** Probando la funcion separador(...)
		System.out.println("Prueba 1");
		FuncionesVarias.separador(73, '*');
		System.out.println("Prueba 2");
		FuncionesVarias.separador(3, '-');
		System.out.println("Prueba 3");
		FuncionesVarias.separador(732, 'o');

	}
}


public class FuncionesNumeros {
	
	public static String numRomanos(int num) {
		int dec,unid;
		String[] unidades = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String[] decenas;
		decenas  = new String[] {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};

		dec = num / 10;
		unid = num % 10;
		return decenas[dec]+unidades[unid];
	}
	
	public static float media(int[] tabla) {
		float acumulador=0,media;
		int contador;
		for (contador = 0; contador < tabla.length; contador++) {
			acumulador=acumulador+tabla[contador];
		}
		media=acumulador/contador;
		return media;
	}
	
	public static float media(float[] tabla) {
		float acumulador=0,media;
		int contador;
		for (contador = 0; contador < tabla.length; contador++) {
			acumulador=acumulador+tabla[contador];
		}
		media=acumulador/contador;
		return media;
	}
	public static boolean esTriangular(int num) {
		boolean resultado;
		int i,total;
		i=1;

		total=0;
		while(total<num) {
			total=total+i;
			i++;
		}
		resultado = total==num;
		return resultado;
	}

}
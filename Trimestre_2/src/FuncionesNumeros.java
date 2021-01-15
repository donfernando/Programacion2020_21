
public class FuncionesNumeros {

	public static String numRomanos(int num) {
		int dec, unid;
		String[] unidades = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		String[] decenas;
		decenas = new String[] { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };

		dec = num / 10;
		unid = num % 10;
		return decenas[dec] + unidades[unid];
	}

	public static float media(int[] tabla) {
		float acumulador = 0, media;
		int contador;
		for (contador = 0; contador < tabla.length; contador++) {
			acumulador = acumulador + tabla[contador];
		}
		media = acumulador / contador;
		return media;
	}

	public static float media(float[] tabla) {
		float acumulador = 0, media;
		int contador;
		for (contador = 0; contador < tabla.length; contador++) {
			acumulador = acumulador + tabla[contador];
		}
		media = acumulador / contador;
		return media;
	}

	public static boolean esTriangular(int num) {
		boolean resultado;
		int i, total;
		i = 1;

		total = 0;
		while (total < num) {
			total = total + i;
			i++;
		}
		resultado = total == num;
		return resultado;
	}

	public static boolean esTrianguloValido(float l1, float l2, float l3) {
		boolean valido;
		if (l1 > l2 && l1 > l3) {
			valido = l1 < l2 + l3;
		} else {
			if (l2 > l3) {
				valido = l2 < l1 + l3;
			} else {
				valido = l3 < l1 + l2;
			}
		}
		return valido;
	}

	public static int numeroAleatorio(int d, int h) {

		double x = Math.random();
		int valoresRango = ((h - d) + 1);
		int resultado2 = (int) (x * valoresRango) + d;
		return resultado2;

	}

	public static float totalSobreTope(float[] numeros, float tope) {
		float total = 0;
		int i;

		for (i = 0; i < numeros.length; i++) {
			if (numeros[i] > tope)
				total = total + numeros[i];
		}
		return total;
	}

	public static float[] incrementos(float[] nums) {
		float[] incrementos = new float[nums.length - 1];

		for (int i = 0; i < nums.length - 1; i++) {
			incrementos[i] = nums[i + 1] - nums[i];
		}
		return incrementos;
	}

}
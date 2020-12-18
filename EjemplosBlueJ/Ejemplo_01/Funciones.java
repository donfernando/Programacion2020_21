
public class Funciones
{
	public static char letraDNI(long dni) {
		int posiLetraDNI;
		//char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		char[] letras = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
		posiLetraDNI = (int)(dni % 23);

		return letras[posiLetraDNI];
	}

	public static char letraDNI(String dni) {
		long lDni;
		lDni = Long.parseLong(dni);
		return letraDNI(lDni);
		}

	public static boolean validarDNI(String dni) {
		//dni=dni.trim();
		char letra = Character.toUpperCase(dni.charAt(dni.length()-1));
		char letraCorrecta;
		String dniSinLetra = dni.substring(0, dni.length()-1);
		letraCorrecta = letraDNI(dniSinLetra);

		return letra == letraCorrecta;
	}
	
 
}

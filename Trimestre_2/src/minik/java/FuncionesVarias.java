package minik.java;

public class FuncionesVarias {
	

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
	
	
	
	public static void separador(int numero, char caracter) {
		int i;
		for (i = 1; i <= numero; i++) {
			System.out.print(caracter);
		}
		System.out.println();
	}
	
	public static int[] tablaEnteros(int tamaño) {
		
		int[] tabla = new int[tamaño];
		for (int i = 0; i < tamaño; i++) {
			tabla[i] = FuncionesNumeros.numeroAleatorio(-100, 100);
		}
		return tabla;
	}


	public static void println(int[] t) {
		int i;
		System.out.print("{");
		if(t.length!=0) {
			for (i = 0; i < t.length-1; i++) {
				System.out.print(t[i]+" , ");
			}
			System.out.print(t[i]);
		}
		System.out.println("}");
	}
	public static void println(float[] t) {
		int i;
		System.out.print("{");
		if(t.length!=0) {
			for (i = 0; i < t.length-1; i++) {
				System.out.printf("%.2f , ",t[i]);
			}
			System.out.printf("%.2f",t[i]);
		}
		System.out.println("}");
	}
	
	public static void println(DocumentoDNI doc) {
		System.out.println("-----------------------");
		System.out.println("Nombre: "+doc.nombre);
		//System.out.println("DNI: "+doc.dni+doc.ldni);
		System.out.println("DNI: "+doc.getDNI());
		System.out.println("Edad: "+doc.edad);
	}
	public static void println(DocumentoDNI[] t) {
		int i;
		System.out.println("// Inicio lista de documentos");
		for (i = 0; i < t.length; i++) {
			println(t[i]);
		}
		System.out.println("// Fin documentos");
	}
	
	
	
	
	
	public static double[] merge(double[]a, double[]b){
		
		int posA = 0, posB = 0, posC = 0;
		double[]c = new double [a.length+b.length];
		
		while (posA<a.length && posB <b.length) {
			
			if (a[posA]<b[posB]) {
				
				c[posC] = a[posA];
						
				posA++;
			}else {
				c[posC] = b[posB];
				
				posB++;
			}
			posC++;
		}
		while (posA<a.length) {
			c[posC] = a[posA];
			
			posA++;
			posC++;			
		}
		while (posB<b.length) {
			c[posC] = b[posB];
			
			posB++;
			posC++;		
		}
		
		return c;
				
	}
	public static double[] concat(double[]a, double[]b){
		
		double[]c = new double [a.length+b.length];
		int i=0, k = 0;
		
		for ( ; i < a.length; i++) {		
			c[i] = a[i];
		}
		for (; k < b.length; k++, i++) {		
			c[i] = b[k];
		}
		
		return c;
	}
	
	public static DocumentoDNI[] merge(DocumentoDNI[]a, DocumentoDNI[]b){
		
		int posA = 0, posB = 0, posC = 0;
		DocumentoDNI[]c = new DocumentoDNI[a.length+b.length];
		
		while (posA<a.length && posB <b.length) {
			if (a[posA].edad<b[posB].edad) {
				c[posC] = a[posA];
				posA++;
			}else {
				c[posC] = b[posB];
				posB++;
			}
			posC++;
		}
		while (posA<a.length) {
			c[posC] = a[posA];
			posA++;
			posC++;			
		}
		while (posB<b.length) {
			c[posC] = b[posB];
			posB++;
			posC++;		
		}
		return c;
	}
	
	public static DocumentoDNI[] concat(DocumentoDNI[]a, DocumentoDNI[]b){
		
		DocumentoDNI[]c = new DocumentoDNI[a.length+b.length];
		int i=0, k = 0;
		
		for ( ; i < a.length; i++) {		
			c[i] = a[i];
		}
		for (; k < b.length; k++, i++) {		
			c[i] = b[k];
		}
		
		return c;
	}
	
	
}

package minik.ejercicios;

public class Ejercicio1 {
	static String eliminar(String[] datos, int pos) {
		String aux;
		int i=0;	
		aux=datos[pos];
		for (i = pos; i > 0; i--) 
			datos[i]=datos[i-1];
		datos[0]=datos[datos.length-1];	
		datos[datos.length-1]="";	
		return aux;
	}
	
}

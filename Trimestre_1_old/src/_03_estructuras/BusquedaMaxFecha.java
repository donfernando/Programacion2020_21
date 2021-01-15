package _03_estructuras;
import java.util.Scanner;
import java.util.Date;

public class BusquedaMaxFecha {

	public static void main(String[] args) {
		//Teniendo una tabla date con las fechas de Nacimiento y una secuencia de nombres
		//Sacar el mayor
		
		Scanner in = new Scanner(System.in);
		Date[] fechas= {new Date(60, 0, 12),
						new Date(101, 2, 15), 
						new Date(67, 7, 12), 
						new Date(72, 6, 10)};
		String[] nombres= {"Ana"," Fran", "Alba", "Julio"};
		int pos,maximo=0;
		
		for(pos=1;pos<fechas.length;pos++) {
			if(fechas[pos].compareTo(fechas[maximo])>0) {
				maximo=pos;
			}
		}
		System.out.println(nombres[maximo]+ " es el más joven y nació el " + fechas[maximo]);
	}
}

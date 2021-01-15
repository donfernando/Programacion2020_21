import java.util.Date;
import java.util.Scanner;

public class Pruebas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//System.out.println("Hola".length());
		//StringBuffer sb = new StringBuffer();
		
		//System.out.println(new Date());
		
		int año,mes,dia;
		System.out.print("Día (1..): ");
		dia = in.nextInt();
		System.out.print("Mes (1-12): ");
		mes = in.nextInt();
		System.out.print("Año: ");
		año = in.nextInt();
		Date d = new Date(año-1900,mes-1,dia);
		System.out.println(d);
	}
}

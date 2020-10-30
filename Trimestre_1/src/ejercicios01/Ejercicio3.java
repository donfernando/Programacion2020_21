package ejercicios01;
import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int horas, minutos, segundos;
		int horasTotales, minutosTotales, segundosTotales;
		
		System.out.println("Escribe cuantas horas: ");
		horas=teclado.nextInt();
		System.out.println("Escribe cuantos minutos: ");
		minutos=teclado.nextInt();
		System.out.println("Escribe cuantos segundos: ");
		segundos=teclado.nextInt();

		segundosTotales=segundos%60;
		minutos += (segundos/60);
		minutosTotales=minutos%60;
		horas += minutos/60;
		horasTotales=horas%24;
		System.out.println("La hora es: "+horasTotales+ ":"+ minutosTotales+":"+segundosTotales+" segundos");
		teclado.close();
	}

}

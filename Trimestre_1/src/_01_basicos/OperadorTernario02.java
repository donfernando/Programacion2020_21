package _01_basicos;
import java.util.Scanner;
public class OperadorTernario02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int edad;
		int edad2;
		String nombre;
		String nombre2;
		
		System.out.print("nombre = ");
		nombre= in.nextLine();
		
		System.out.print("edad = ");
		edad= in.nextInt();

		in.nextLine();
		System.out.print("Otro nombre = ");
		nombre2= in.nextLine();
		
		System.out.print("edad2 = ");
		edad2= in.nextInt();
		
		// Primer ejercicio
		System.out.println("La persona mayor es " + (edad>=edad2?nombre:nombre2));
		
		// Segundo ejercicio
		System.out.println(nombre+" es " + (edad > edad2?"mayor":(edad<edad2?"menor":"de la misma edad")) + " que "+nombre2);
		
		
	}

}
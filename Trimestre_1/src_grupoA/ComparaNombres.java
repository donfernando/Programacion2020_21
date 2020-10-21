import java.util.*;

public class ComparaNombres {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int longCd1, longCd2;
		String cadena1, cadena2;

		System.out.println("*El primer nombre debe ser mayor que el segundo*");
		System.out.print("Introduzca el primer nombre: ");
		cadena1 = in.nextLine();
		System.out.printf("Introduzca el segundo nombre: ");
		cadena2 = in.nextLine();
		longCd1 = cadena1.length();
		longCd2 = cadena2.length();
		System.out.printf("El nombre \"%s\" tiene %d carácteres más que \"%s\".",
				                cadena1,(longCd1 - longCd2),cadena2);
		in.close();
	}
}

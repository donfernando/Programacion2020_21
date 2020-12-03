import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero;
		int i,aux;
		String negacion = "";

		System.out.print("Número.- ");
		numero = in.nextInt();

		i=1;
		aux=numero;
		while(aux>0) {
			aux=aux-i;
			i++;
		}
		if(aux!=0)
			negacion=" no";
		System.out.printf("El número %d%s es triangular\n", numero, negacion);
	}
}
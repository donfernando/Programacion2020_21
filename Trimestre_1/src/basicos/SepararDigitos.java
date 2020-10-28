package basicos;
import java.util.Scanner;

public class SepararDigitos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		int dec,unid;
		
		System.out.print("Número: ");
		num = in.nextInt();
		dec = num / 10;
		unid = num % 10;
		System.out.println("Unidades: "+unid);
		System.out.println("Decenas: "+dec);
	}

}

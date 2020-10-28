import java.util.Scanner;

public class NumeroRomanoConTablas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		int dec,unid;
		String[] unidades = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String[] decenas;
				
		decenas  = new String[] {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};

		System.out.print("Número (1-99): ");
		num = in.nextInt();
		dec = num / 10;
		unid = num % 10;
		System.out.print(decenas[dec]);
		System.out.println(unidades[unid]);
	}
}




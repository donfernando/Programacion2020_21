import java.util.Scanner;

public class NumeroRomano {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		int dec,unid;

		
		System.out.print("Número (1-99: ");
		num = in.nextInt();
		dec = num / 10;
		unid = num % 10;

		
		switch (dec) {
		case 3:
			System.out.print('X');
		case 2:
			System.out.print('X');
		case 1:
			System.out.print('X');
			break;
		case 4:
			System.out.print('X');
		case 5:	
			System.out.print('L');
			break;
		case 6:	
			System.out.print('L');
			System.out.print('X');
			break;
		case 7:	
			System.out.print('L');
			System.out.print('X');
			System.out.print('X');
			break;
		case 8:	
			System.out.print('L');
			System.out.print('X');
			System.out.print('X');
			System.out.print('X');
			break;
		case 9:
			System.out.print('X');
			System.out.print('C');		
		}
		
		switch (unid) {
		case 3:
			System.out.print('I');
		case 2:
			System.out.print('I');
		case 1:
			System.out.print('I');
			break;
		case 4:
			System.out.print('I');
		case 5:	
			System.out.print('V');
			break;
		case 6:	
			System.out.print('V');
			System.out.print('I');
			break;
		case 7:	
			System.out.print('V');
			System.out.print('I');
			System.out.print('I');
			break;
		case 8:	
			System.out.print('V');
			System.out.print('I');
			System.out.print('I');
			System.out.print('I');
			break;
		case 9:
			System.out.print('I');
			System.out.print('X');		
		}
		
		
	}

}

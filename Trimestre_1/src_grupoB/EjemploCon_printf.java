
import java.util.Scanner;

public class EjemploCon_printf {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int x, y;
        
        System.out.print("Valor para y = ");
        y = in.nextInt();
        System.out.println("y = "+ y);
        
        x = 11 + 8 * 3 - (y = 18 - y) + y ; 
        
        System.out.println("\n\nResultado \nx = "+ x);
        System.out.println("y = "+ y);
        
        System.out.printf("\n\nResultado %s\nx = %7.2f \ny = %4d","formateado" ,(float)x , y);
    }
}

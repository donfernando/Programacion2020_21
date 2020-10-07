
import java.util.Scanner;

public class Ejemplo_printf {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int x, y;
        
        System.out.print("Valor para y = ");
        y = in.nextInt();
        System.out.println("y = "+ y);
        
        x = 11 + 8 * 3 - (y = 18 - y) + y ; 
        
        System.out.println("\n\nResultado \nx = "+ x);
        System.out.println("y = "+ y);
        
        System.out.printf("\n\nResultado formateado\nx = %3d \ny = %3d", x , y);
    }
}

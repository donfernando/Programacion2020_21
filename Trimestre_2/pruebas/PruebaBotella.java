import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaBotella {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Qué capacidad de botella desea...");
		
		try {
			Botella b = new Botella(in.nextFloat());
			System.out.println(b);
			b.cerrar();
			System.out.println(b.meter(0.3f));
			System.out.println(b);
			b.abrir();
			System.out.println(b.meter(1));
			System.out.println(b);
		} catch (InputMismatchException e) {
			System.out.println("No se ha podido instanciar la botella...");
		}

		System.out.println("FIN");
	}

}

package ejecutables;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import minik.java.Botella;

public class PruebaBotella02 {

	public static void main(String[] args) {
		ArrayList<Botella> l = new ArrayList<>();
		Botella a = new Botella(1);
		Botella b = new Botella(1);
		Botella c = new Botella(0.5f);
		b.abrir();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		
		l.add(a);
		System.out.println(l);
		if(l.contains(b))
			System.out.println("OK");
		else
			System.out.println("NO");
	}

}

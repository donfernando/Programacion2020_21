package ejecutables;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import minik.herencia.Botella;

public class Prueba_minik_herencia_Botella01 {

	public static void main(String[] args) {
		ArrayList<Botella> l = new ArrayList<>();
		Botella a = new Botella(3);
		Botella b = new Botella(3);
		Botella c = new Botella(0.5f,.0f);
		//b.abrir();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		
		l.add(a);
		System.out.println(l);
		if(l.contains(c))
			System.out.println("OK");
		else
			System.out.println("NO");
	}

}

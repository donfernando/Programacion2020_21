package ejecutables;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import minik.herencia.Botella1L;

public class Prueba_minik_herencia_Botella1L_02 {

	public static void main(String[] args) {
		ArrayList<Botella1L> l = new ArrayList<>();
		Botella1L a = new Botella1L(3);
		Botella1L b = new Botella1L(3);
		Botella1L c = new Botella1L(0.5f,.0f);
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

package ejecutables.herencia;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import minik.herencia.Botella;
import minik.herencia.IniBotellaException;

public class PruebaBotella01 {

	public static void main(String[] args) {
		try {
			ArrayList<Botella> l= new ArrayList<>();
			Botella a = new Botella(3);
			Botella b = new Botella(3);
			Botella c= new Botella(0.5f,.0f);
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
		} catch (IniBotellaException e) {
			System.err.println("Algo fue mal en la Botella");
		}
	}
}

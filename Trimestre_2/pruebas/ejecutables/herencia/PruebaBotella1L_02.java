package ejecutables.herencia;
import java.util.ArrayList;


import minik.herencia.Botella1L;

public class PruebaBotella1L_02 {

	public static void main(String[] args) {
		ArrayList<Botella1L> l = new ArrayList<>();
		Botella1L a = new Botella1L(0.3f);
		Botella1L b = new Botella1L(0.3f);
		Botella1L c = new Botella1L(0.5f);
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

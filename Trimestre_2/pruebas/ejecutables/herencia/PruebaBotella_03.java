package ejecutables.herencia;

import minik.herencia.*;

public class PruebaBotella_03 {

	public static void main(String[] args) {
		
		System.out.println("Reciclable");
		Botella a = new BotellaReciclacle(2,0.3f);
		System.out.println(a);
		a.abrir();
		a.cerrar();
		System.out.println(a);	
		if(a instanceof BotellaReciclacle) {
			BotellaReciclacle aux=(BotellaReciclacle)a;
			System.out.println("Botella usada: "+aux.usada());
		}
		
		
		
		System.out.println();
		System.out.println("Normal");
		Botella b = new Botella(2,0.3f);
		System.out.println(b);
		b.abrir();
		b.cerrar();
		System.out.println(b);
		
		System.out.println();
		System.out.println("De chapita");
		Botella c = new BotellaDeChapita(2,0.3f);
		System.out.println(c);
		c.abrir();
		c.cerrar();
		System.out.println(c);	
		
	}

}

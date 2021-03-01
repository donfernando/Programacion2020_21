//import minik.java.Dado;

public class PruebaDado {

	public static void main(String[] args) {
		minik.java.Dado a,b;
		int tirada;
		a = new minik.java.Dado();
		b = new minik.java.Dado(2);
		
		tirada=a.lanzar();
		System.out.println(tirada);
		System.out.println(a.lanzar());
		System.out.println(a.lanzar());
		
		System.out.println();		
		System.out.println(b.lanzar());
		System.out.println(b.lanzar());
		System.out.println(b.lanzar());
		
		// a = new minik.java.Dado(1);
		try {
			a = new minik.java.Dado(10);
			System.out.println("----->"+a.lanzar());
		} catch(RuntimeException e) {
			System.out.println("**Error");
		}
		System.out.println("FIN");
	}

}

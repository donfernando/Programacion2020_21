
public class PruebaDado {

	public static void main(String[] args) {
		Dado a,b;
		int tirada;
		a = new Dado();
		b = new Dado(2);
		
		tirada=a.lanzar();
		System.out.println(tirada);
		System.out.println(a.lanzar());
		System.out.println(a.lanzar());
		
		System.out.println();		
		System.out.println(b.lanzar());
		System.out.println(b.lanzar());
		System.out.println(b.lanzar());
		
		// a = new Dado(1);
		try {
			a = new Dado(10);
			System.out.println("----->"+a.lanzar());
		} catch(RuntimeException e) {
			System.out.println("**Error");
		}
		System.out.println("FIN");
	}

}

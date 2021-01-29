
public class PruebaBotella {

	public static void main(String[] args) {
		Botella b = new Botella(.6f);
		
		System.out.println(b);
		b.cerrar();
		System.out.println(b.meter(0.3f));
		System.out.println(b);
		b.abrir();
		System.out.println(b.meter(1));
		System.out.println(b);
		
	}

}

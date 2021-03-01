import minik.java.Coordenada;

public class PruebaCoordenada {

	public static void main(String[] args) {
		
		Coordenada p = new Coordenada();
		System.out.println(p);
		System.out.println();
		
		Coordenada[] datos= {new Coordenada(5,8),new Coordenada(15,15),new Coordenada()};
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i]);
		}
		System.out.println("La más cercana al origen es: "+Coordenada.masCerca(datos));
	}

}

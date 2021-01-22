
public class PruebaCoordenada {

	public static void main(String[] args) {
		Coordenada[] datos= {new Coordenada(),new Coordenada(),new Coordenada()};
		datos[0].x=5;
		datos[0].y=8;
		datos[1].x=15;
		datos[1].y=15;
		datos[2].x=1;
		datos[2].y=5;
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i]);
		}
		System.out.println("La más cercana al origen es: "+Coordenada.masCerca(datos));
	}

}

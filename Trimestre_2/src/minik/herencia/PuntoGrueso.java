package minik.herencia;

public class PuntoGrueso extends PuntoAcotado {

	public PuntoGrueso() {
		//Aquí los atributos que heredo de la clase base, ya están inicializados
	}
	static int diametro = 5;

	public void izq() {
		
		/*for (int i = 0; i < diametro; i++) {
				super.izq();
			}
		*/
		if (esvalido(x - diametro, y)){
			x -= diametro;
		}
	}

	public void der() {
		if (esvalido(x + diametro, y))
			x += diametro;
	}

	public void arr() {
		if (esvalido(x, y - diametro))
			y -= diametro;
	}

	public void abj() {
		if (esvalido(x, y + diametro))
			y += diametro;
	}

	public static int getDiametro() {
		return diametro;
	}

	public static void setDiametro(int d) {
		if (1 <= d && d <= 30)
			diametro = d;
	}
};
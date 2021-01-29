
public class Dado {

	private int caras;
	
	public Dado(int lados) {
		if (lados<2)
			throw new RuntimeException("Es necesario un mínimo de 2 lados");
		caras=lados;
	}
	
	public Dado() {
		caras=6;
		//this(6);
	}
	
	public int lanzar() {
		return 1+((int) (Math.random()*caras));
	}
}

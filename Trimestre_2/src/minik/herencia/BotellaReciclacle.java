package minik.herencia;

public class BotellaReciclacle extends Botella {

	private boolean usada; //false
	
	public BotellaReciclacle() {
	}

	public BotellaReciclacle(float liq) {
		super(1,liq);
	}

	public BotellaReciclacle(int capacidad, float liq) {
		super(capacidad,liq);
	}

	@Override
	public void abrir() {
		super.abrir();
		usada = true;
	}
	
	@Override
	public String toString() {
		String s;
		if(usada)
			s="*";
		else
			s="";
		return s+super.toString();
	}
	
	public boolean usada() {
		return usada;
	}
	
	
}

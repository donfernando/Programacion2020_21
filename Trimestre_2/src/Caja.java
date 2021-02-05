
public class Caja {
	private Botella[] botellas;
	
	public Caja(int tam) {
		botellas=new Botella[tam];
		for (int i = 0; i < botellas.length; i++) {
			botellas[i]=new Botella(1.0f);
		}	
	}
	
	public Botella getBotella(int pos) {
		Botella b=botellas[pos];
		botellas[pos]=null;
		return b;
	}
	public boolean setBotella(Botella botella, int pos) {
		boolean modificada;
		if(botellas[pos]==null) {
			this.botellas[pos] = botella;
			modificada=true;
		}
		else
			modificada=false;
		return modificada;
	}

	public String toString() {
		int i;
		String s="Caja Botellas\n";
		for (i = 0; i < botellas.length-1; i++) {
			s=s+botellas[i]+'\n';
		}
		s=s+botellas[i];
		return s;
	}
}

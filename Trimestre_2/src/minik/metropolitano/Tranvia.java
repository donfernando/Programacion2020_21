package minik.metropolitano;

public class Tranvia {
	private static final int NUM_VAGONES_DEF=4;
	private static final int NUM_ASIENTOS_DEF=6;
	
	private VagonPasajeros[] vagones;
	
	
	public Tranvia() {
		this(NUM_VAGONES_DEF);
	}
	
	public Tranvia(int numVagones) {
		if(numVagones<1)
			throw new RuntimeException("El tranvía debe tener al menos un vagón");
		vagones = new VagonPasajeros[numVagones];
		for (int i = 0; i < vagones.length; i++) {
			vagones[i]=new VagonPasajeros(NUM_ASIENTOS_DEF);
		}
	}
	
	public int subir(Pasajero p,int vagon) {
		if(vagon<1 || vagon>vagones.length)
			throw new RuntimeException("Número de vagón invalido: "+vagon);
		if (p == null)
			throw new RuntimeException("No se acepta pasajero null");
		boolean subido=false;
		int pos=vagon-1;
		//if(vagones[pos].asientosOcupados != vagones[pos].asientos.length)

		do {
			try {
				vagones[pos].subir(p);
				subido=true;
			} catch (RuntimeException e) {
				if (pos < vagones.length - 1)
					pos++;
				else
					pos = 0;
			} 
		} while (!subido && pos!=vagon-1);
		if(!subido)
			throw new RuntimeException("No se puede subir. Todos los vagones están completos");
		return pos+1;	
	}
	public Pasajero bajar(String nombre, int vagon) {
        return vagones[vagon - 1].bajar(nombre);
    }
}







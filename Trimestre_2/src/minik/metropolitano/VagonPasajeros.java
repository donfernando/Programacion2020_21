package minik.metropolitano;

import java.util.Arrays;

public class VagonPasajeros {

    Pasajero[] asientos;
    int asientosOcupados;

    VagonPasajeros(int capacidad) {
        if (capacidad < 1)
            throw new RuntimeException();
        asientos = new Pasajero[capacidad];
    }

    public void subir(Pasajero pasajero) {
        if (pasajero == null)
            throw new RuntimeException("No se acepta pasajero null");
        if(pasajero.estaDentro)
            throw new RuntimeException("No se acepta pasajero que ya está subido al tranvía");       	
        if (asientosOcupados == asientos.length)
            throw new ArrayStoreException("Vagón completo");
        asientos[asientosOcupados] = pasajero;
        asientosOcupados++;
        pasajero.estaDentro=true;
    }

    public Pasajero bajar(String nombre) {
        if(nombre==null || nombre.length()==0)
            throw new RuntimeException("El nombre facilitado del pasajero no es válido");
        if (asientosOcupados==0)
            throw new RuntimeException("Nadie se pude bajar por estar el vagón vacío");
        int i = 0;
        Pasajero p = null;
        while (i < asientos.length - 1 && !(asientos[i].getNombre().equals(nombre)))
            i++;
        if (asientos[i].getNombre().equals(nombre)) {
            p = asientos[i];
            asientos[i] = asientos[asientosOcupados - 1];
            asientos[asientosOcupados - 1] = null;
            asientosOcupados--;
            p.estaDentro=false;
        }        
        return p;
    }

	@Override
	public String toString() {
		String s="[";
		int i;
		for (i = 0; i < asientosOcupados-1; i++) {
			s += asientos[i].toString()+',';		
		}
		if(asientosOcupados!=0)
			s += asientos[i].toString();
		s += ']';
		return s;
	}
    
    
    
    
    
}
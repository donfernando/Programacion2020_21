package gabriel.metropolitano;

public class Pasajero {
	private String nombrePasajero;
	public Pasajero (String nombre) {
		if(nombre==null || nombre.length()==0)
			throw new RuntimeException("El pasajero debe tener un nombre válido");
		nombrePasajero=nombre;
	}
	
	public String getNombre() {
		return nombrePasajero;
	}
	
	@Override
	public String toString() {
		return "Pasajero: "+nombrePasajero;	
	}
}
 
package gabriel.metropolitano;

import java.util.ArrayList;

public class Pasajero {
    private String nombrePasajero;
    boolean subido;
    private static ArrayList<String> nombresYaUsados = new ArrayList<>();
    public Pasajero (String nombre) {
        if(nombre==null || nombre.length()==0)
            throw new RuntimeException("El pasajero debe tener un nombre válido");
        if(nombresYaUsados.contains(nombre))
            throw new RuntimeException("Ya existe una persona con ese nombre: "+nombre);
        nombresYaUsados.add(nombre);
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
 
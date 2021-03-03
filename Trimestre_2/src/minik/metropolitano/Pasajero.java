package minik.metropolitano;

import java.util.ArrayList;

public class Pasajero {
    private String nombre;
    private static ArrayList<String> nombresYaUsados;
    boolean estaDentro;
    
    static {
    	nombresYaUsados=new ArrayList<String>();
    }
    
    public Pasajero(String nombre) { 	
        //if(nombre!=null & nombre.length()!=0)
        if(nombre==null || nombre.length()==0)
            throw new RuntimeException();
        if(nombresYaUsados.contains(nombre))
            throw new RuntimeException("Ya existe una persona con ese nombre: "+nombre);
        nombresYaUsados.add(nombre);
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    public String toString() {
    	return "Pasajero: "+nombre;
    }
    
}

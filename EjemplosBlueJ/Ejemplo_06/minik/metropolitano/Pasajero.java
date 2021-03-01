 package minik.metropolitano;

public class Pasajero {
    private String nombre;
    public Pasajero(String nombre) {
        //if(nombre!=null & nombre.length()!=0)
        if(nombre==null || nombre.length()==0)
            throw new RuntimeException("Debes dar un nombre al pasajero.");
        this.nombre=nombre;
    }
    
    
}
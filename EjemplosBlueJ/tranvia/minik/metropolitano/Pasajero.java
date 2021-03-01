package minik.metropolitano;

public class Pasajero {
    private String nombre;
    public Pasajero(String nombre) {
        //if(nombre!=null & nombre.length()!=0)
        if(nombre==null || nombre.length()==0)
            throw new RuntimeException();
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    
}

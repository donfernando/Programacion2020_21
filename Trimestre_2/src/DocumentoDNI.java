
public class DocumentoDNI {
    public String nombre;
    public long dni;
    public char ldni;
    public int edad;
    
    public String getDNI() {
    	return ""+dni+'-'+Character.toUpperCase(ldni);
    }
}

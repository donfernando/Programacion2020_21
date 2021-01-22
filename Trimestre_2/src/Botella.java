
public class Botella {
	public float contenido;
	public boolean cerrada;
	
	public void cerrar() {
		cerrada=true;
	}
	public void abrir() {
		cerrada=false;
	}
	public boolean estaCerrada() {
		return cerrada;
	}
	public boolean estaLlena() {
		return contenido==1.0;
	}
	
}

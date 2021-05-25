package ficheros.ejerDni;

import java.io.Serializable;

public class Carnet implements Serializable {

	private static final long serialVersionUID = 2L;
	
	private String nombre;
	private long numero;
	private char letra;
	private float altura;

	public Carnet(String nombre,long numero,char letra,float altura) {
		this.nombre=nombre;
		this.numero=numero;
		this.letra=letra;
		this.altura=altura;
	}

	@Override
	public String toString() {
		return String.format("Dni[%s / %d-%c / %.2f]",nombre,numero,letra,altura);		
	}
	public String getNombre() {
		return nombre;
	}
	public long getNumero() {
		return numero;
	}
	public char getLetra() {
		return letra;
	}
	public float getAltura() {
		return altura;
	}
}

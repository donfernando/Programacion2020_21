package pizarra.figuras;

import java.awt.Point;

import interfaces.Apilable;
import interfaces.YaApiladoException;

import java.awt.Graphics;

public abstract class Figura implements Comparable<Figura>,Apilable {
	
	public  Point posicion;
	public Figura(int a, int b) {
		posicion= new Point(a,b);}
	public abstract float area();
	abstract public float perimetro();
	abstract public int alto();
	abstract public int ancho();
	abstract public void dibujar(Graphics g);
	
	
	@Override
	public int compareTo(Figura otro) {
		if(area()<otro.area())
			return -1;
		else if(area()>otro.area())
			return 1;
		else
			return 0;
	}
	
	
	@Override
	public String toString() {
		//return String.format("%8.2f  ----   %s",area(),super.toString());
		return String.format("%s (area: %.2f)",getClass().getSimpleName(),area());
	}
	
	
	
	
	private boolean apilado; // = false;

	public void apilar() throws YaApiladoException {
		if(apilado)
			throw new YaApiladoException();
		apilado=true;
	}
	
	public void desapilar() {
		apilado=false;
	}
	
};


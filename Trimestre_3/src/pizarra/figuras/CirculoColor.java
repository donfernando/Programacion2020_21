package pizarra.figuras;

import java.awt.Color;
import java.awt.Graphics;


public class CirculoColor extends Circulo {
	public Color color;
	public CirculoColor(int a, int b, int d, Color v) {
	  super(a,b,d); 
	  color = v;
	  }	  
	

	public void dibujar(Graphics g) {
		Color cActual=g.getColor();
		g.setColor(color);
		g.fillOval(posicion.x,posicion.y,dMenor,dMayor);
		g.drawOval(posicion.x,posicion.y,dMenor,dMayor);
		g.setColor(cActual);
	}
}
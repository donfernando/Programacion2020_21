package pizarra.figuras.nuevas;

import java.awt.Color;
import java.awt.Graphics;
import pizarra.figuras.Figura;



public class Triangulo extends Figura {

	private float base, altura;

	public Triangulo(int x, int y, int base, int altura) {
		super(x, y);
		this.base = base;
		this.altura = altura;
	}

	public float perimetro() {
		float perimetro = (float) (base + 2 * Math.sqrt((altura * altura) + (base * base) / 4));
		return perimetro;
	}

	public float area() {
		float area = base * altura / 2;
		return area;
	}

	public int ancho() {
		return (int) base;
	}

	public int alto() {
		return (int) altura;
	}

	public void dibujar(Graphics g) {
		Color cActual = g.getColor();
		int[] xPuntos = {posicion.x + (int) base/2,
				   posicion.x+(int)base,
				   posicion.x};
		int[] yPuntos = {posicion.y,
				   posicion.y + (int) altura,
				   posicion.y+(int)altura}; 
		  g.fillPolygon(xPuntos, yPuntos, 3);
		  g.setColor(Color.white);
		  g.drawPolygon(xPuntos, yPuntos, 3);
		  g.setColor(cActual);
		}
}
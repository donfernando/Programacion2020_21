package pizarra.figuras;

import java.awt.Color;
import 
java.awt.Graphics;

public class TrianguloEquilatero extends Figura{
	private   int altura;
	int lado;

	public TrianguloEquilatero(int a, int b, int y) {
		super(a, b);
		lado = y;
		altura=(int)Math.sqrt(lado*lado+(lado/2.0)*(lado/2.0));
	}
	
	

	public void dibujar(Graphics g) {
		Color cActual = g.getColor();
		
		int[] xPuntos = {posicion.x,       posicion.x+lado,   posicion.x+lado/2};
		int[] yPuntos = {posicion.y+altura,posicion.y+altura, posicion.y};
		
		 g.fillPolygon(xPuntos, yPuntos, 3);
		 g.setColor(Color.white);
		 g.drawPolygon(xPuntos, yPuntos, 3);
		 g.setColor(cActual);
	}

	@Override
	public float area() {
		float area;
		area = (float) ((Math.pow(altura, 2)* Math.sqrt(3))/3);
		return area;
	}

	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int alto() {
		// TODO Auto-generated method stub
		return altura;
	}

	@Override
	public int ancho() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
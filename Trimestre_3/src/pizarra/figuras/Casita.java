package pizarra.figuras;

import 
java.awt.Graphics
;

public class Casita extends Figura {
	
	pizarra.figuras.nuevas.Triangulo tejado;
	Cuadrado fachada;

	public Casita(int a, int b, int ancho) {
		super(a, b);

		tejado = new pizarra.figuras.nuevas.Triangulo(a, b, ancho,ancho+10);
		fachada = new Cuadrado(a, b+tejado.alto(), ancho);
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return tejado.area()+fachada.area();
	}

	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return tejado.perimetro()+fachada.perimetro()/2;
	}

	@Override
	public int alto() {
		// TODO Auto-generated method stub
		return fachada.alto()+tejado.alto();
	}

	@Override
	public int ancho() {
		// TODO Auto-generated method stub
		return fachada.ancho();
	}

	@Override
	public void dibujar(Graphics g) {
		tejado.posicion.x=posicion.x;
		tejado.posicion.y=posicion.y;
		fachada.posicion.x=posicion.x;
		fachada.posicion.y=posicion.y+tejado.alto();

		fachada.dibujar(g);
		tejado.dibujar(g);
	}

}
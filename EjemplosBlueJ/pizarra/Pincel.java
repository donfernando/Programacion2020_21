 

// Pincel.java

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;
import pizarra.figuras.*;

public class Pincel { 
  private static final int INCREMENTO=5;
  public static final int CIRCULO=1;
  public static final int ELIPSE=2;
  public static final int CUADRADO=3;
  public static final int RECTANGULO=4;
  public static final int TRIANGULO=5;
  public static int TOP_ARR;
  public static int TOP_ABJ;
  public static int TOP_IZQ;
  public static int TOP_DER;
    
  protected Figura punta;
  public boolean pincelActivo;

  public Pincel(int forma,int px,int py) {
    this(forma, px, py, false);
  }

  public Pincel(int forma,int px,int py, boolean activo) {
    pincelActivo=activo;
    switch(forma) {
    case CIRCULO: punta=new Circulo(px,py,20);
        break;
    case ELIPSE: punta=new Elipse(px,py,20,40);
        break;
    case CUADRADO: punta=new Cuadrado(px,py,20);
        break;
    case RECTANGULO: punta=  new Casita(px,py,20) ; //new Rectangulo(px,py,50,30);
        break;
    case TRIANGULO: punta= new pizarra.figuras.nuevas.Triangulo(px,py,20,60);  //new Triangulo(px,py,20,55,42);
    }
  }

  public void dibujar(Graphics g) {
    if(pincelActivo) 
        punta.dibujar(g); // no se sabe que m�todo concreto se ejecutar�.
    dibujarPaneles(g,10,40);
  }

  private void dibujarPaneles(Graphics g, int xCoord, int yCoord) {
    int xPunta, yPunta;
    Color cActual;

    xPunta=punta.posicion.x;
    yPunta=punta.posicion.y;
    cActual=g.getColor();
    g.setColor(Color.white);
    // Cajas de informacion
    g.fillRect(xCoord,yCoord   ,100,15);
    g.fillRect(xCoord,yCoord+20,300,15);
    g.fillRect(xCoord,yCoord+40,300,15);
    g.fillRect(xCoord,yCoord+60,120,15);
    // Canal de cursores
    g.fillRect(1,1,5,Pincel.TOP_ABJ);
    g.fillRect(1, Pincel.TOP_ABJ-1, Pincel.TOP_DER, 3);
    g.setColor(cActual);
    // Cursores
    g.fillRect(1,yPunta,5,punta.alto());
    g.fillRect(xPunta, Pincel.TOP_ABJ-1, punta.ancho(), 3);
    // Informacion del pincel
    g.drawString("(" + xPunta + "," + yPunta +")",
            xCoord+1,yCoord+11);
    g.drawString("Area de la figura (punta de pincel): "+punta.area(),
            xCoord+1,yCoord+31);
    g.drawString("Perimetro de la figura (punta de pincel): "+punta.perimetro(),
            xCoord+1,yCoord+51);
    if(pincelActivo)
    g.drawString("Pincel Apoyado", xCoord+1,yCoord+71);
    else
    g.drawString("Pincel Levantado", xCoord+1,yCoord+71);
  }

  public void arr() {
    if(punta.posicion.y > TOP_ARR)
    punta.posicion.y -= INCREMENTO;
    else
    punta.posicion.y = TOP_ABJ;
  }

  public void abj() {
    if(punta.posicion.y < TOP_ABJ)
    punta.posicion.y += INCREMENTO;
    else
    punta.posicion.y = TOP_ARR;
  }

  public void izq() {
    if(punta.posicion.x > TOP_IZQ)
    punta.posicion.x -= INCREMENTO;
    else
    punta.posicion.x = TOP_DER;
  }

  public void der() {
    if(punta.posicion.x < TOP_DER)
    punta.posicion.x += INCREMENTO;
    else
    punta.posicion.x = TOP_IZQ;
  }
  public Point leePosicion() {
    return new Point(punta.posicion);
  }
}
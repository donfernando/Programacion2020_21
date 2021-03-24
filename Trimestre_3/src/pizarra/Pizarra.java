package pizarra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pizarra extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] arg) {
		new Pizarra();
	}

	private final int ESP = 32;
	private final int ESC = 27;
	private final int ARR = 38;
	private final int ABJ = 40;
	private final int IZQ = 37;
	private final int DER = 39;

	Pincel p;

	Pizarra() {
		System.out.println("");
		System.out.println("____________________________________________________________________");
		System.out.println("Dibuja con las flechas del teclado arrastrando figuras geom�tricas");
		System.out.println();
		System.out.println("Para cambiar de figura puedes pulsar en cualquier momento");
		System.out.println();
		System.out.println("___________________________");
		System.out.println("	1 .....Circulo");
		System.out.println("	2 .....Elipse");
		System.out.println("	3 .....Cuadrado");
		System.out.println("	4 .....Rectangulo");
		System.out.println("	5 .....Triangulo");
		System.out.println("___________________________");
		System.out.println("la barra espaciadora levanta o apoya el pincel grafico en la pizarra");
		System.out.println("____________________________________________________________________");

		Pincel.TOP_ARR = 10;
		Pincel.TOP_IZQ = 5;
		Pincel.TOP_ABJ = 345;
		Pincel.TOP_DER = 445;
		p = new Pincel(Pincel.CIRCULO, 50, 150, true);

		// valores de inicializacion de la ventana del programa.
		// *****************************************************
		setSize(Pincel.TOP_DER + 5, Pincel.TOP_ABJ + 5);
		setResizable(false);
		setLocation(1, 1);

		// hace visible la ventana.
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		}); // add window listener
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case IZQ:
					p.izq();
					break;
				case DER:
					p.der();
					break;
				case ARR:
					p.arr();
					break;
				case ABJ:
					p.abj();
					break;
				case ESP:
					p.pincelActivo = !p.pincelActivo;
					break;
				case ESC:
					System.exit(0);
					break;
				case Pincel.CIRCULO + 48:
					p = new Pincel(Pincel.CIRCULO, p.leePosicion().x, p.leePosicion().y);
					break;
				case Pincel.ELIPSE + 48:
					p = new Pincel(Pincel.ELIPSE, p.leePosicion().x, p.leePosicion().y);
					break;
				case Pincel.CUADRADO + 48:
					p = new Pincel(Pincel.CUADRADO, p.leePosicion().x, p.leePosicion().y);
					break;
				case Pincel.RECTANGULO + 48:
					p = new Pincel(Pincel.RECTANGULO, p.leePosicion().x, p.leePosicion().y);
					break;
				case Pincel.TRIANGULO + 48:
					p = new Pincel(Pincel.TRIANGULO, p.leePosicion().x, p.leePosicion().y);
				}
				;
				p.dibujar(getGraphics());
			}
		}); // add key listener
	}

	public void paint(Graphics g) {
		super.paint(g);
		p.dibujar(g);
	}
};

package minik.herencia;

public class PuntoAcotado {
	int x = 1, y = 1;
	private int xLim, yLim;

	public PuntoAcotado() {
		xLim = 10;
		yLim = 10;
	}

	public PuntoAcotado(int xL, int yL) {
		xLim = xL;
		yLim = yL;
	}

	boolean esvalido(int px, int py) {
		return (px >= 1 && px <= xLim && py >= 1 && py <= yLim);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void izq() {
		if (esvalido(x - 1, y))
			x--;
	}

	public void der() {
		if (esvalido(x + 1, y))
			x++;
	}

	public void arr() {
		if (esvalido(x, y - 1))
			y--;
	}

	public void abj() {
		if (esvalido(x, y + 1))
			y++;
	}
	
	@Override
	public String toString() {
		return "("+x+','+y+')';
	}
};

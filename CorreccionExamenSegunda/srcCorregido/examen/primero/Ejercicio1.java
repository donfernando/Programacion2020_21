package examen.primero;

import java.awt.Point;

public class Ejercicio1 {
	static Point buscar(String[][] datos, String frase, Point c1, Point c2) {
		int fila, col;
		Point pos=null;
		fila=c1.y;
		col= c1.x;
		while((!(fila==c2.y & col==c2.x)) &&
			!datos[fila][col].equals(frase)) {
				if(col!=c2.x)
					col++;
				else {
					col= c1.x;
					fila++;
				}
		}
		if(datos[fila][col].equals(frase))
			pos=new Point(col,fila);
		return pos;		
	}
}

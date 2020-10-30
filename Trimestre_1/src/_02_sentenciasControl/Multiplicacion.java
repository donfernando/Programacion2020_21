package _02_sentenciasControl;
/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "MULTIPLICACI�N.java."


import java.util.Scanner;
public class Multiplicacion {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int d;
		int num;
		System.out.print("Escribe un número = ");
		num = in.nextInt();
		
		System.out.println("Tabla del "+num);
		for (d=1;d<=10;d++) {
			//System.out.println(d+" x "+num+" = "+(d*num));
			System.out.printf("%2d x %d = %2d\n",d,num,d*num);
		}
	}
}
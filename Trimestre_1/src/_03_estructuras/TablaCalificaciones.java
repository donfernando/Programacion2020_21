package _03_estructuras;

import java.util.Scanner;

public class TablaCalificaciones {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int ANCHO_COL1=12;
		final int ANCHO_COL2=8;
		String[] trimestres = { "Primero", "Segundo", "Tercero" };
		String[] nombremodulo = { "Sistemas", "Programación", "Ent. Trabajo", "FOL" };
		float[][] calificaciones = { { 0, 1,  2 },
								     { 2,10,  3 },
								     { 6, 7,  3 },
				  				     { 8, 2, 10 } };
		int iModulo;
		int iTrimestre;

		System.out.printf("%"+ANCHO_COL1+"s   ","");
		for (iTrimestre = 0; iTrimestre < trimestres.length; iTrimestre++) {
			System.out.printf("%"+ANCHO_COL2+"s ",trimestres[iTrimestre]);			
		}
		System.out.println();
		for (iModulo = 0; iModulo < calificaciones.length; iModulo++) {
			System.out.printf("%-"+ANCHO_COL1+"s ",nombremodulo[iModulo]);
			for (iTrimestre = 0; iTrimestre < calificaciones[0].length; iTrimestre++) {
				System.out.printf("%"+ANCHO_COL2+".1f ",calificaciones[iModulo][iTrimestre]);
			}
			System.out.println();
		}
	}
}
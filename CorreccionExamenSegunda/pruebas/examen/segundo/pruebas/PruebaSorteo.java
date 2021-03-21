package examen.segundo.pruebas;

import java.util.Scanner;

import examen.segundo.Sorteo;

public class PruebaSorteo
{
	public static void main (String[]arg)
	{
		Scanner in = new Scanner(System.in);
		final int OPORTUNIDADES=5;
		Sorteo a=new Sorteo(10);
		System.out.println("INTRODUZCA NÚMEROS DESDE EL 1 HASTA EL 10");
		System.out.println("=========================================");
		int intentos=0;
		int codigo=0;

		do {
			try
			{
				codigo=a.intentar(in.nextInt());
			}catch(NumberFormatException e){
			}
			intentos++;
		} while(codigo==0 && intentos<OPORTUNIDADES);

		System.out.print("La solución");
		if(codigo!=0) {
			System.out.println(" era "+a);
		}
		else {
			System.out.println(" no se sabrá ya nunca.");			
		}
		System.out.println("...tras "+intentos+ " intentos.");
	}
}

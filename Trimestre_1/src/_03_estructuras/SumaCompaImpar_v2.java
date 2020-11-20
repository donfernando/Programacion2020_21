package _03_estructuras;

public class SumaCompaImpar_v2 {
	public static void main(String[] args) {
		int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int iz;
		int acumulador = 0;
	
		for (iz=0 ; iz <= numeros.length-1; iz++) {
			System.out.print("[" + numeros[iz] + "] ");
			if (numeros[numeros.length-1-iz] % 2 != 0) {
				acumulador += numeros[iz];
			}
		}
		System.out.println();
		System.out.println("La suma total es " + acumulador);
	}
}
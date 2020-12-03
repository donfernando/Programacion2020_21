package ejercicios03;
import java.util.Scanner;

/*
 * DESCRICIÓN DEL ALGORITMO
 * 
 * El problema se resuelve aplicando los patrones algoritmicos estudiados en clase:
 * 0.- (opcional)
 * Recorer por filas la tabla de votos para motrar su contenido, junto a las cabeceras
 * de las tablas de 'candidatos' y de 'islas'.
 * 
 * 1.a.- Búsqueda lineal en secuencia de datos no ordenados. 
 * Para buscar si la isla solicitada por el usuario está y en qué posición de la tabla 'islas'.
 * Si está, recorer solo la columna de la posición correspondiente a la isla solicitada,
 * aplicando Búsqueda de un Máximo para encontrar la fila del candidato más votado.
 * Mostrar el nombre del candidato de la fila seleccionada como el más votado.
 * 
 * 1.b.- De nuevo se trata de buscar un máximo, pero antes de seleccionar el máximo valor
 * necesitamos calcular el total de los votos obtenidos por cada candidato. Por ello,
 * recorremos la tabla por filas...
 *    - al empezar cada fila, inicializamos el acumulador 'totVotos'
 *    - para cada columna (cada isla) acumulamos los votos de ese candidato.
 *    - al final de cada fila, su tiene más votos que el más votado hasta ese momento,
 *        lo seleccionamos temporalmente como el más votado por el momento.
 *    - (maxVotos se inicializa a un número (-1) para que nos garantice que
 *       el primer candidato (el tota de la primera fila) supere ese número de votos,
 *       por muy pocos que tenga)
 *    - tras recorrer todas las filas (los candidatos):
 *         * 'maxVotos' tendrá el máximo de votos obtenido por un candidato.
 *         * 'candGanador' tendrá la fila del candidato que más votos totales obtuvo.
 *    - mostrar resultado.
 */


public class EleccionesMunicipales {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int ANCHO_COL_1 = 15;
		final int ANCHO_COL_2 = 10;
		String nomIsla;
		String[] candidatos = {"Candidato A","Candidato B","Candidato C"};
		String[] islas = {"Tenerife","El Hierro","La Gomera","La Palma",
							"Gran Canaria","Lanzarote","Fuerteventura"};
		int[][] votos = { {233,54,45,14,435,87,67},
						{  445,45,87,23,276,81,89},
						{  185,34,34,78,305,66,38} };
		
		int isl;
		int cand;
		int candGanador;
		int totVotos, maxVotos;
		
		System.out.printf("%"+ANCHO_COL_1+"s   ","");
		for (isl = 0; isl < islas.length; isl++) {
			System.out.printf("%"+ANCHO_COL_2+"s ",islas[isl]);			
		}
		System.out.println();
		for (cand = 0; cand < votos.length; cand++) {
			System.out.printf("%-"+ANCHO_COL_1+"s ",candidatos[cand]);
			for (isl = 0; isl < votos[0].length; isl++) {
				System.out.printf("%"+ANCHO_COL_2+"s ",votos[cand][isl]);
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("Inserte una isla: ");
		nomIsla=in.nextLine();
		isl=0;
		while(isl<islas.length-1 && !nomIsla.equals(islas[isl]))
			isl++;
		if(!nomIsla.equals(islas[isl]))
			System.out.println("No conozco esta isla...");
		else {
			// busco el max en la columna 'isl'
			candGanador=0;
			for (cand = 1; cand < votos.length; cand++) {
				if(votos[cand][isl] > votos[candGanador][isl])
					candGanador=cand;
			}
			System.out.printf("El candidato ganador en %s es %s\n",islas[isl],candidatos[candGanador]);
		}
		
		// (Apartado b.) Quién es el más votado.
		System.out.println("\nGANADOR DE LAS VOTACIONES.");
		maxVotos=-1;
		candGanador=-1;
		for (cand = 0; cand < votos.length; cand++) {
			// al pricipio de cada fila.
			totVotos=0;
			for (isl = 0; isl < votos[0].length; isl++) {
				// para cada valor
				totVotos += votos[cand][isl];
			}
			// al finla de cada fila.
			if(totVotos>maxVotos) {
				maxVotos=totVotos;
				candGanador=cand;
			}
		}
		System.out.printf("El candidato ganador es %s con %d votos entre todas las islas.",
				candidatos[candGanador],maxVotos);
		
		
	}
}

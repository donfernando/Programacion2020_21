package ejercicios03;
import java.util.Scanner;

public class EleccionesMunicipales {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int ANCHO_COL_1 = 15;
		final int ANCHO_COL_2 = 10;
		String nomIsla;
		int i, iPosicion;
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

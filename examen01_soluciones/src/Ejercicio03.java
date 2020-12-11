
public class Ejercicio03 {
	public static void main(String[] args) {
		int i;
		int f,c;
		char[][] letras= {{'a','b','f','k','v'},
						  {',','c','g','u','d'},
						  {'v','o','o','i','e'}};
		int[][] coordenadas = {{2,0},
							   {2,4},
							   {2,2},
							   {1,0},
							   {0,4},
							   {2,4},
							   {2,1}};
		
		for (i = 0; i < coordenadas.length; i++) {
			//System.out.print(letras[coordenadas[i][0]][coordenadas[i][1]]);
			f=coordenadas[i][0];
			c=coordenadas[i][1];
			System.out.print(letras[f][c]);
		}
		System.out.println();
	}
}
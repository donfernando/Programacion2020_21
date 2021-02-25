package ejecutables;
import java.util.ArrayList;

public class LoteriaConArray{
	public static void main(String[] args) {
		final int NUM_BOLAS = 10;
		String[] bombo = new String[NUM_BOLAS];
		int bolasEnBombo;
		int posAzar;
		for (int i = 1; i <= NUM_BOLAS; i++) {
			bombo[i-1]= i + "";
		}
		bolasEnBombo=NUM_BOLAS;
		
		while (bolasEnBombo != 0) {
			posAzar = (int) (Math.random() * bolasEnBombo);
			System.out.println(bombo[posAzar]);
			
			bombo[posAzar]=bombo[bolasEnBombo-1];

			
			
			
			
			//bombo[bolasEnBombo-1]=null;
			bolasEnBombo--;
		}
	}
}

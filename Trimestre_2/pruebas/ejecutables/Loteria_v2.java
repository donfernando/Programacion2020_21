package ejecutables;
import java.util.ArrayList;

public class Loteria_v2 {
	public static void main(String[] args) {
		final int NUM_BOLAS = 10;
		
		//Integer x = Integer.valueOf(10);
		//ArrayList bombo = new ArrayList(NUM_BOLAS);

		// Template (o plantilla, generico)
		ArrayList<Integer> bombo = new ArrayList<Integer>(NUM_BOLAS);
		int posAzar;
		for (int i = 1; i <= NUM_BOLAS; i++) {
			//bombo.add(Integer.valueOf(i));
			bombo.add(i);
		}
		while (bombo.size() != 0) {
			posAzar = (int) (Math.random() * bombo.size());
			System.out.println(bombo.remove(posAzar));
		}
	}
}

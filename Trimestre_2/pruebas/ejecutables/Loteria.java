package ejecutables;
import java.util.ArrayList;

public class Loteria {
	public static void main(String[] args) {
		final int NUM_BOLAS =6;
		//TablaDeStrings bombo = new TablaDeStrings(NUM_BOLAS);
		ArrayList<String> bombo = new ArrayList<String>(NUM_BOLAS);
		int posAzar;
		for (int i = 1; i <= NUM_BOLAS; i++) {
			bombo.add(i + "");
		}
		while (bombo.size() != 0) {
			posAzar = (int) (Math.random() * bombo.size());
			System.out.println(bombo.remove(posAzar));
		}
	}
}
package _02_sentenciasControl;

public class TablaOctal2 {
	public static void main(String[] args) {
		int decimal = 0;
		final int TOPE = 100;
		int dig2, dig1, dig0;
		for (dig2 = 0; dig2 <= 7 && decimal<=TOPE; dig2++) {
			for (dig1 = 0; dig1 <= 7 && decimal<=TOPE; dig1++) {
				for (dig0 = 0; dig0 <= 7 && decimal<=TOPE; dig0++) {
					// System.out.println(""+dig1+dig0+"------>"+decimal);
					System.out.printf("%d%d%d------->%d\n", dig2, dig1, dig0, decimal);
					decimal++;
				}
			}
		}
	}
}
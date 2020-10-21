package sentenciasControl;

public class TablaOctal2_NoEstructurado {
	public static void main(String[] args) {
		int decimal = 0;
		int hasta = 100;
		int dig2, dig1, dig0;
		fin:
		for (dig2 = 0; dig2 <= 7; dig2++) {
			for (dig1 = 0; dig1 <= 7; dig1++) {
				for (dig0 = 0; dig0 <= 7; dig0++) {
					// System.out.println(""+dig1+dig0+"------>"+decimal);
					System.out.printf("%d%d%d------->%d\n", dig2, dig1, dig0, decimal);
					decimal++;
					if(decimal>hasta)
						break fin;
				}
			}
		}
		
	}
}
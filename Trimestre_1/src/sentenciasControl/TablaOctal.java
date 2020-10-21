package sentenciasControl;

public class TablaOctal {
	public static void main(String[] args) {
		int decimal=0;
		int dig1,dig0;
		for (dig1 = 0; dig1 <= 7; dig1++) {
			for (dig0 = 0; dig0 <= 7; dig0++) {
				System.out.println(""+dig1+dig0+"------>"+decimal);
				//System.out.printf("%d%d------->%d\n",dig1,dig0,decimal);
				decimal++;
			}
		}
	}
}
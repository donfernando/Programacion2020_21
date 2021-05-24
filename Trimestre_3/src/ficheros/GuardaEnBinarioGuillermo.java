package ficheros;



import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class GuardaEnBinarioGuillermo {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("GuardaEnBinario.txt");
		BufferedReader b = new BufferedReader(fr);
		
		FileOutputStream fot =new FileOutputStream("GuardaEnBinario.dat");
		
		
		float F;
		double D;
		char C;
		boolean B;
		String S;
		int I;
		long L;
		
		//Para el Char
		String texto="";
		while(texto!=null) {
			c=fr.read();
			C = (char)c;
			texto+=C;
		}
		fr.close();
		
		switch(code) {
		
			case F:
				float numeroFloat = Float.parseFloat(b.readLine());
			break;
			
			case D:
				double numeroDoble = Double.parseDouble(b.readLine());
			break;
			
			case C:
				char letra = letra.CharArt(b.readLine());
			break;
			
			case B:
				boolean numeroBuleano = Boolean.parseBoolean(b.readLine());
			break;
			
			case S:
				String cadena = b.readLine();
			break;
			
			case I:
				int numero = Integer.parseInt(b.readLine());
			break;
			
			case L:
				long numeroLong = Long.parseLong(b.readLine());
			break;
		}
		
	}

}
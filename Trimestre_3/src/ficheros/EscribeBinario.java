package ficheros;

import java.io.FileOutputStream;
import java.io.IOException;

public class EscribeBinario {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fo=new FileOutputStream("salida.dat"); 
		fo.write(12);
		fo.write(255);
		fo.write(256);
		fo.write(300);
		
		fo.write(0xFF);
		fo.write(0xF0);
		fo.close();
		
	}
}

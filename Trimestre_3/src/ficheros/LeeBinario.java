package ficheros;

import java.io.FileInputStream;
import java.io.IOException;

public class LeeBinario {
	public static void main(String[] args) throws IOException {
		int code;
		FileInputStream fi=new FileInputStream("salida.dat");
		
		code = fi.read();
		while(code!=-1) {
			System.out.printf("%h - %d\n",code,code);
			code = fi.read();
		}
		fi.close();
	}
}

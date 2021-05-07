package ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main6{
	public static void main(String[] args) throws IOException {
		int code;
		FileInputStream fi=new FileInputStream("salida.txt");
		
		code = fi.read();
		while(code!=-1) {
			System.out.printf("%h(%c) - %d\n",code,code,code);
			code = fi.read();
		}
		fi.close();
	}
}

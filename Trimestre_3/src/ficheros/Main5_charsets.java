package ficheros;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Main5_charsets {
	public static void main(String[] args) {
		try {
			int code;
			char ch;
			// Creates a reader using the FileReader
			//FileReader input = new FileReader("input.txt");
			Charset charset;
//			charset=Charset.forName("ISO-8859-15");
//	        FileReader input = new FileReader("salida_ISO-8859-15.txt",charset);
			charset=Charset.forName("UTF-16BE");
	        FileReader input = new FileReader("salida_Unicode16BE.txt",charset);

			System.out.println("Data in the file: ");
			System.out.print("<<");
			// Reads characters
			code=input.read();
			while(code!=-1) {
				ch = (char)code;
				System.out.print(ch);
				code=input.read();
			}
			System.out.println(">>");
			// Closes the reader
			input.close();
		}
		catch (IOException e) {
			e.getStackTrace();
		}
	}
}
package ficheros;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		try {
			int code;
			char ch;
			// Creates a reader using the FileReader
			FileReader input = new FileReader("input.txt");

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
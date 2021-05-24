package ficheros;

import java.io.*;
import java.nio.charset.Charset;

public class CodificaCharset {
	public static void main(String[] args) throws IOException {
		int code;

		FileInputStream file;
		InputStreamReader lecCaract;
		file = new FileInputStream(args[0]);
		lecCaract = new InputStreamReader(file);

		/*
		FileOutputStream fichRedireccion;
		OutputStreamWriter redireccion;
		fichRedireccion = new FileOutputStream(args[1]);
		redireccion = new OutputStreamWriter(fichRedireccion, args[2]);
		*/
		FileWriter redireccion = new FileWriter(args[1],Charset.forName(args[2]));
		
		
		while ((code = lecCaract.read()) != -1)
			redireccion.write(code);
		
		redireccion.close();
//		fichRedireccion.close();
		lecCaract.close();
		file.close();
	}
}
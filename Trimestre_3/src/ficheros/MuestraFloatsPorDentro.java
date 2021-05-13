package ficheros;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MuestraFloatsPorDentro {
	public static void main(String[] args) throws IOException {
		
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(bao); 
		dos.writeFloat(12.67f);
		dos.close();
		bao.close();		
		byte[] datos;
		datos=bao.toByteArray();
		for (int i = 0; i < datos.length; i++) {
			System.out.printf("%2H ",datos[i]);
		}
		
		
		
	}
}

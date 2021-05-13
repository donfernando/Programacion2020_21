package ficheros;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribeFloats {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fo=new FileOutputStream("numeros.dat",true);
		DataOutputStream dos=new DataOutputStream(fo); 
		dos.writeFloat(12.67f);
		dos.writeFloat(12.67f);
		dos.writeFloat(12.67f);
		dos.writeFloat(12.67f);
	
		dos.close();
		fo.close();		
	}
}

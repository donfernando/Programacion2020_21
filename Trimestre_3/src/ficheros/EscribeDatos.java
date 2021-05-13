package ficheros;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribeDatos {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fo=new FileOutputStream("datos.dat");
		DataOutputStream dos=new DataOutputStream(fo); 
		dos.writeFloat(12.67f);
		dos.writeUTF("Hola");
		dos.writeBoolean(false);
		dos.close();
		fo.close();		
	}
}

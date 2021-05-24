package ficheros;

//importing the File class
import java.io.File;
import java.io.IOException;

class PruebaFile {
	public static void main(String[] args) throws IOException {

		String nFich="tururu";
		if(args.length!=0)
			nFich = args[0]; 

		// create a file object for the current location
		File file = new File(args[0]);
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());

		System.out.println((file.exists()?"SI ":"NO ")+" existe el fichero");		
		System.out.println((file.canRead()?"SI ":"NO ")+" puedo leer del fichero");		
		System.out.println((file.canWrite()?"SI ":"NO ")+" puedo escribir en el fichero");		
		System.out.println((file.canExecute()?"SI ":"NO ")+" puedo ejecutar el fichero");		
		System.out.println((file.isDirectory()?"SI ":"NO ")+" es un directorio");		

		/*		
		try {
			// trying to create a file based on the object
			boolean value = file.createNewFile();
			if (value) {
				System.out.println("The new file is created.");
			} else {
				System.out.println("The file already exists.");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		*/
	}
}
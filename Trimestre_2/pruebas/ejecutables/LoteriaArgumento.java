package ejecutables;

import java.util.ArrayList;
//import minik.programacion.java.TablaDeStrings;

public class LoteriaArgumento {
	public static void main(String[] args) {

		int numBolas;
		if (args.length != 0)
			try {
				numBolas = Integer.parseInt(args[0]);

				minik.java.TablaDeStrings bombo = new minik.java.TablaDeStrings(numBolas);
				//ArrayList<String> bombo = new ArrayList<String>(numBolas);
				int posAzar;
				for (int i = 1; i <= numBolas; i++) {
					bombo.add(i + "");
				}
				while (bombo.size() != 0) {
					posAzar = (int) (Math.random() * bombo.size());
					System.out.println(bombo.remove(posAzar));
				}
			} catch (NumberFormatException e) {
				System.out.println("Error en el argumento facilitado. Debe ser un número...\n");
			}
		else
			System.out.println("Formato del comando es:\n java LoteriaArgumento <numero de bolas>\n");
	}
}
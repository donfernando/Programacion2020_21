
public class OperadorTernario01 {
	public static void main(String[] args) {
		int edad =18;
		boolean tieneCarnet = true;
		boolean acompañado = false;
		boolean esMayorEdad;
		boolean entra;
		/*
		 	2.- Puede entrar si es mayor de edad y tiene carnet del club,
		 	o tambien si tiene carnet del club, mas de 15 años y viene acompañado.
		 
		*/
		esMayorEdad = edad >= 18;
		/*
		System.out.println("¿Puede entrar a la fiesta? "+(tieneCarnet & esMayorEdad));
		System.out.println("¿Se queda fuera de la fiesta? "+!(tieneCarnet & esMayorEdad));
		System.out.println("¿Se queda fuera de la fiesta? "+(!tieneCarnet | !esMayorEdad));
		*/

		entra = tieneCarnet & ( esMayorEdad | edad>15 & acompañado );
		
		System.out.println("¿Puede entrar a la fiesta? " + (entra?"Por supuesto.":"De ninguna manera."));

		System.out.println("¿Se queda fuera de la fiesta? " + (!entra?"Lamentablemente, no puede entrar."
				                                               :"Adelante, no se quede fuera.") );
	}
}







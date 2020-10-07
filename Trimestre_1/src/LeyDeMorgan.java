
public class LeyDeMorgan {
	public static void main(String[] args) {
		int edad=8;
		boolean tieneCarnet=false;
		boolean puedePasar,seQuedaFuera;
		
		/* 
		Mostrar el valor boolean que indique si puede pasar a la fiesta, o no.
		Para pasar debe ser mayor de edad y tener carnet del club.		
		*/

		puedePasar = tieneCarnet && edad >= 18;
		seQuedaFuera = !tieneCarnet || !(edad >= 18); 
		                     // !(tieneCarnet && edad >= 18);
				
		
		System.out.println("Entra = "+ (tieneCarnet && edad >=18));
		
		System.out.println("Entra = "+ puedePasar);
		
		System.out.println("No entra = "+ seQuedaFuera);

//	Ley de Morgan	no (P y Q)  -----   no P o no Q
		
		
	}
}
package interfaces;

public interface Patentable {
	void patentar(String autor);
	// se exige que se facilite el nombre del autor de la patente.
	// no se admite null.
	// no se puede patentar más de una vez de lo contrario dará PatenteException
	
	
	boolean patentado();
	// sí o no
	
	String autor();
	// retorna el autor de la patente.
	// Si no está patentado retorna "NO PATENTADO".
	
}

/*
DAM -A                                 DAM-B
Pablo:               LogoOlímpico                 Roberts
Josue:               CirculoColor                 Sergio Pérez
Juan:                VagonPasajeros               Marvin
                     Tranvia                      Jose Miguel
Romen:               Botella                      Daniel
David:               DocumentoDNI                 Jorge
Diego:               Telefono                     Ruben Pablo
Pablo Suarez:        Dado                         Borja
Enrique:             Caja                         Cristo
AlejandroRodriguez:  Pasajero                     Gabriel
Kevin:               IniBotellaException
                     Triangulo                    Guillermo

*/







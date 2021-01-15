
public class PruebaDocumentoDNI {
	
	public static void main(String[] args) {
		DocumentoDNI[] datos1,datos2,resul;
		
		datos1 = tabla3();
		datos2 = tabla2();
				
		FuncionesVarias.println(datos1);
		FuncionesVarias.println(datos2);
		
		//resul = FuncionesVarias.merge(datos1, datos2);
		resul = FuncionesVarias.concat(datos1, datos2);
		
		FuncionesVarias.println(resul);
		
	}
	
	
	
	public static DocumentoDNI[] tabla3() {
		DocumentoDNI aux;
		DocumentoDNI[] datos;
		
		datos = new DocumentoDNI[3];
		aux=new DocumentoDNI();
		datos[0]=aux;
		aux.nombre="Ana";
		aux.dni=12345L;
		datos[0].ldni='r';
		aux.edad=12;	
		
		aux=new DocumentoDNI();
		aux.nombre="Federico";
		aux.dni=347634L;
		aux.ldni='a';
		aux.edad=15;
		datos[1]=aux;
		
		aux=new DocumentoDNI();
		aux.nombre="Alicia";
		aux.dni=2367523L;
		aux.ldni='y';
		aux.edad=25;
		datos[2]=aux;
		return datos;
	}
	public static DocumentoDNI[] tabla2() {
		DocumentoDNI aux;
		DocumentoDNI[] datos;
		
		datos = new DocumentoDNI[2];
		aux=new DocumentoDNI();
		aux.nombre="Juan";
		aux.dni=234L;
		aux.ldni='e';
		aux.edad=13;	
		datos[0]=aux;
		aux=new DocumentoDNI();
		aux.nombre="Fran";
		aux.dni=8987L;
		aux.ldni='q';
		aux.edad=15;
		datos[1]=aux;
		return datos;
	}
}

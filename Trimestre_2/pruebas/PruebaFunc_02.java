import minik.java.FuncionesVarias;

public class PruebaFunc_02 {
	public static void main(String[] args) {
		float[] datos = {4.5f, 12, -2.45f, 24, .78f , 0 };
		/*
		float r;
		r = Ejercicios_01.totalSobreTope(datos, 10 );		
		System.out.println(r);
		*/
		
		/*
		System.out.println( Ejercicios_01.totalSobreTope(datos, 10 ) );
		System.out.println( Ejercicios_01.totalSobreTope(datos, 0 ) );
		System.out.println( Ejercicios_01.totalSobreTope(datos, 2 ) );
		*/
		
		System.out.println(FuncionesVarias.letraDNI(23452L));
		System.out.println(FuncionesVarias.letraDNI(234823452L));
		System.out.println(FuncionesVarias.letraDNI(230034452L));

		
		System.out.println(FuncionesVarias.letraDNI("23452"));
		System.out.println(FuncionesVarias.letraDNI("234823452"));
		System.out.println(FuncionesVarias.letraDNI("230034452"));
		
		System.out.println(FuncionesVarias.validarDNI("23452S"));
		System.out.println(FuncionesVarias.validarDNI("23452X"));
		// System.out.println(FuncionesVarias.validarDNI("234A52X"));
		
	}
}

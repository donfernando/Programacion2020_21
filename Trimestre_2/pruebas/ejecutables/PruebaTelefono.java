package ejecutables;

import java.util.Scanner;

import minik.ejercicios.telefonoMovil.TelefonoMovil;

class PruebaTelefono {
  public static void main(String[] arg) throws Exception {
	TelefonoMovil tlf=new TelefonoMovil("922123456");	
	Scanner entrada=new Scanner(System.in);
	String pulsacion;
	System.out.println("Tiene derecho a realizar una llamada telefonica...");
	while((pulsacion=entrada.nextLine()).length()!=0) {
		switch(pulsacion.charAt(0)) {
			case '0': tlf.digito0();
					  break;
			case '1': tlf.digito1();
					  break;
			case '2': tlf.digito2();
					  break;
			case '3': tlf.digito3();
					  break;
			case '4': tlf.digito4();
					  break;
			case '5': tlf.digito5();
					  break;
			case '6': tlf.digito6();
					  break;
			case '7': tlf.digito7();
					  break;
			case '8': tlf.digito8();
					  break;
			case '9': tlf.digito9();
					  break;
			case 'b': tlf.anularDigito();
		}
		System.err.println(tlf);
	}
	tlf.llamar();
  }
}

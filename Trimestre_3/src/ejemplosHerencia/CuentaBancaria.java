package ejemplosHerencia;

import java.util.regex.Pattern;

import interfaces.Patentable;

public class CuentaBancaria implements Patentable{
	// serian 20 pero quiero guardarlos con espacios, por lo que serán 23 
	//EEEE OOOO DC NNNNNNNNNN
		//codEntidad=4;
		//codOficina=4;
		//digControl=2;
		//numCuenta=10;

	char[] codCuenta = new char[23];
	static final int POS_BLANCO1=4;
	static final int POS_BLANCO2=9;
	static final int POS_D=10;
	static final int POS_C=11;
	static final int POS_BLANCO3=12;
	
	private String autor;   // =null;
	
	
	@Override
	public String toString() {
		return new String(codCuenta);
	}

	public CuentaBancaria(String datos) {
		int i;

		switch (comprobarCuenta(datos)) {
		case -1:
			throw new RuntimeException("Cuenta Incorrecta");
		case 1:
			throw new RuntimeException("Digito de Control D incorrecto");
		case 2:
			throw new RuntimeException("Digito de Control C incorrecto");
		case 3:
			throw new RuntimeException("Digitos de Control DC incorrectos");
		}
		for (i = 0; i < codCuenta.length; i++) {
			codCuenta[i] = datos.charAt(i);
		}
	}

	private static int comprobarCuenta(String datos) {
		int resultado = 0;
		int d, c, dOrig, cOrig;

		if (!cuentaCorrecta(datos)) {
			resultado = -1;
		} else {
			dOrig = charToInt(datos.charAt(POS_D));
			cOrig = charToInt(datos.charAt(POS_C));
			d = dCorrecto(getEEEE(datos), getOOOO(datos));
			c = cCorrecto(getNNNNNNNNNN(datos));
			if (d != dOrig) {
				if (c != cOrig) {
					resultado = 3;
				} else {
					resultado = 1;
				}
			} else if (c != cOrig) {
				resultado = 2;
			} else {
				resultado = 0;
			}
		}
		return resultado;
	}
		
	private static int dCorrecto(String entidad, String oficina) {
		int sumaPesos = 0;
		int[] pesosEntidad = { 4, 8, 5, 10 };
		int[] pesosOficina = { 9, 7, 3, 6 };
		int i;
		for (i = 0; i < 4; i++) {
			sumaPesos += pesosEntidad[i] * charToInt(entidad.charAt(i));
		}
		for (i = 0; i < 4; i++) {
			sumaPesos += pesosOficina[i] * charToInt(oficina.charAt(i));
		}
		sumaPesos = sumaPesos % 11;
		if (sumaPesos > 1) {
			sumaPesos = 11 - sumaPesos;
		}
		return sumaPesos;
	}

	private static int cCorrecto(String cuenta) {
		int sumaPesos = 0;
		int[] pesos = { 1, 2, 4, 8, 5, 10, 9, 7, 3, 6 };
		int i;

		for (i = 0; i < 10; i++) {
			sumaPesos += pesos[i] * (int) (cuenta.charAt(i) - '0');
		}

		sumaPesos = sumaPesos % 11;
		if (sumaPesos > 1) {
			sumaPesos = 11 - sumaPesos;
		}
		return sumaPesos;
	}

/*
 ****  Usando patrones. */
  	private static boolean cuentaCorrecta(String cuenta) {
		return cuenta!=null && Pattern.matches("\\d{4} \\d{4} \\d{2} \\d{10}", cuenta);
	}

	
/*	
 *  Comprobación manual
	private static boolean cuentaCorrecta(String cuenta) {
		String fragmento;
		int i;
		// Número de dígitos correcto y Blancos en su sitio
		if(cuenta.length()!=23 ||
			cuenta.charAt(POS_BLANCO1)!=' ' || cuenta.charAt(POS_BLANCO2)!=' ' || cuenta.charAt(POS_BLANCO3)!=' ')
			return false;
		// validación de Entidad
		fragmento=getEEEE(cuenta);
		i=0;
		while(i<fragmento.length()-1 && Character.isDigit(fragmento.charAt(i)))
			i++;
		if(!Character.isDigit(fragmento.charAt(i)))
				return false;
		// validación de Oficina
		fragmento=getOOOO(cuenta);
		i=0;
		while(i<fragmento.length()-1 && Character.isDigit(fragmento.charAt(i)))
			i++;
		if(!Character.isDigit(fragmento.charAt(i)))
				return false;
		// validación de Cuenta
		fragmento=getNNNNNNNNNN(cuenta);
		i=0;
		while(i<fragmento.length()-1 && Character.isDigit(fragmento.charAt(i)))
			i++;
		if(!Character.isDigit(fragmento.charAt(i)))
				return false;

		//Todo OK
		return true;
	}
*/	
	
	private static int charToInt(char c) {
		return c-'0';
	}
	private static String getEEEE(String cuenta) {
		return cuenta.substring(0, POS_BLANCO1);
	}
	private static String getOOOO(String cuenta) {
		return cuenta.substring(POS_BLANCO1+1,POS_BLANCO2);
	}
	private static String getNNNNNNNNNN(String cuenta) {
		return cuenta.substring(POS_BLANCO3+1);
	}

	@Override
	public void patentar(String autor) {
		if(autor==null)
			throw new PatenteException("No se puede patentar sin el  nombre del autor");
		if(this.autor!=null)
			throw new PatenteException("No se puede volver a patentar. Ya fue Patentado por "+this.autor);
		this.autor=autor;
	}

	@Override
	public boolean patentado() {
		return autor!=null;
	}

	@Override
	public String autor() {
		if(autor==null)
			return "NO PATENTADO";
		return autor;
	}
}

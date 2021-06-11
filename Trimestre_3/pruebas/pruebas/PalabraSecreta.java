package pruebas;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class PalabraSecreta {
	protected String pSecreta;
	protected char[] palabra;
	protected int intentosErroneos;
	public static final int INTENTOS = 10;
	protected boolean adivinada;
	protected static final char CARACTER_OCULTO='*';

	public PalabraSecreta(File f) {
		int numLineas, numLineaAzar;
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			numLineas = Integer.parseInt(br.readLine());
			numLineaAzar = (int) (Math.random() * numLineas);
			while (numLineaAzar != 0) {
				br.readLine();
				numLineaAzar--;
			}
			pSecreta = br.readLine();
		} catch (IOException e) {
		}
		palabra = new char[pSecreta.length()];
		palabra[0] = pSecreta.charAt(0);
		for (int i = 1; i < pSecreta.length(); i++) {
			if (Character.toUpperCase(pSecreta.charAt(i))
					== Character.toUpperCase(pSecreta.charAt(0)) ||
				Character.isWhitespace(pSecreta.charAt(i)))
				palabra[i] = pSecreta.charAt(i);
			else
				palabra[i] = CARACTER_OCULTO;
		}
	}

	@Override
	public String toString() {
		String result;
		if(intentosErroneos!=INTENTOS && !adivinada)
			result = new String(palabra);
		else
			if(adivinada)
				result = pSecreta + "(Felicidades)";
			else
				result = pSecreta + "(Repita y suerte)";
		return result;
	}
	
	
	public boolean intento(char ch) {
		boolean encontrado=false;
		boolean adivinada=true;
		ch=Character.toUpperCase(ch);
		for (int i = 1; i < palabra.length; i++) {
			if(ch == Character.toUpperCase(pSecreta.charAt(i))) {
				encontrado=true;
				palabra[i]=pSecreta.charAt(i);
			}
			if(palabra[i]==CARACTER_OCULTO)
				adivinada=false;		
		}
		if(!encontrado)
			intentosErroneos++;
		this.adivinada=adivinada;
		return encontrado;
	}
	
	public boolean terminado() {
		return intentosErroneos==INTENTOS || adivinada;
	}
}









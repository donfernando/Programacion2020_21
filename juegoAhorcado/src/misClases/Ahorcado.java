package misClases;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Ahorcado implements Tablero, Jugar {
	public static final int JUGANDO = 0;
	public static final int TERMINADO = 1;
	public static final int RENDIDO = 0;
	public static final int GANADO = 1;

	protected static final char CARACTER_COMODIN = '.';

	protected String secreto;
	protected char[] secretoMostrado;
	protected int errores = 0;
	protected int aciertos = 0;
	protected int estado;
	protected int resultado;

	public Ahorcado(String palSecreta) {
		if (!Pattern.matches("^[a-zA-ZñÑ]+$", palSecreta))
			throw new RuntimeException();
		secreto = palSecreta;
		secretoMostrado = new char[secreto.length()];
		Arrays.fill(secretoMostrado, CARACTER_COMODIN);
	}

	@Override
	public boolean intentar(char ch) {
		boolean hayado = false;
		if (estado == JUGANDO) {
			ch = Character.toUpperCase(ch);
			for (int i = 0; i < secreto.length(); i++) {
				if (ch == Character.toUpperCase(secreto.charAt(i))) {
					hayado = true;
					if (secretoMostrado[i] == CARACTER_COMODIN) {
						aciertos++;
						secretoMostrado[i] = secreto.charAt(i);
					}
				}
			}
			if (!hayado)
				errores++;
			else if (aciertos == secreto.length()) {
				estado = TERMINADO;
				resultado = GANADO;
			}
		} else if (resultado == RENDIDO)
			throw new TramposoException();
		return hayado;

	}

	@Override
	public void rendirse() {
		resultado = RENDIDO;
		estado = TERMINADO;
	}

	@Override
	public void dibujar() {
		switch (estado) {
		case JUGANDO:
			System.out.println(new String(secretoMostrado) + "  (errores: " + errores + ")");
			break;
		case TERMINADO:
			System.out.print("[" + (resultado == GANADO ? "Ganó" : "Se rindió") + "] ");
			System.out.println(secreto + "  (errores: " + errores + ")");
			break;
		}
	}
}
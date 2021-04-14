package interfaces;

public class YaApiladoException extends Exception {
	public YaApiladoException() {
		super("Excepcion por intentar apilar de nuevo un elemento ya apilado.");
	}
	public YaApiladoException(String m) {
		super(m);
	}

}

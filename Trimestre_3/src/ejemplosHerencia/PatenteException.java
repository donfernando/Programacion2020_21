package ejemplosHerencia;

public class PatenteException extends RuntimeException {

	public PatenteException() {
	}
	public PatenteException(String mensaje) {
		super(mensaje);
	}

}

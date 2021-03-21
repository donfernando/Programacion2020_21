package examen.segundo;

public class Sorteo
{
	private int secreto;
	private boolean acertado;

	 // (1..lim)
	public Sorteo(int lim) {
		this(1,lim);
	}
	// (limInf..limSup)
	public Sorteo(int limInf,int limSup) {
		if(limSup<limInf)
			throw new RuntimeException("Error: Valor no válido");
		secreto=(int)(Math.random()*(limSup-limInf+1)+limInf);
	}
	public int intentar(int num){
		if(num==secreto) {
			acertado=true;
			return 1; //acertado
		}
		return 0; //no acertado
	}

	@Override
	public String toString() {
		String s=null;
		if(acertado)
			s=secreto+"";
		return s;
	}
}
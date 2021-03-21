package examen.tercero;

import examen.segundo.Sorteo;

public class SorteoLimitado extends Sorteo{
	private int intentos;
	// (1..10)
	public SorteoLimitado() {  
		this(10);
	}
	public SorteoLimitado(int lim) {  
		this(1,lim);
	}
	// (limInf..limSup)
	public SorteoLimitado(int limInf,int limSup){
		super(limInf, limSup);
	}
	public int intentar(int num){
		intentos++;
		if(super.intentar(num)!=0)
			return intentos;
		return 0;
	}
}

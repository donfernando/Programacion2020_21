package minik.ejercicios.telefonoMovil;
import java.util.Vector;

public class TelefonoMovil {
	private static Vector<String> numerosUsados=new Vector<>();
	private String miNumero;
	private char[] digitos=new char[20];
	private int posUltDigito=-1;
	public TelefonoMovil(String numero) throws Exception {
		char dig=numero.charAt(0);
		Long.parseLong(numero);
		if(dig!='0' && dig!='1' && dig!='6' && dig!='9')
			throw new Exception("Número inválido");
		if(numerosUsados.contains(numero))
			throw new Exception("Número ya usado");
		numerosUsados.add(numero);
		miNumero=numero;
	}

	public void llamar() {
		if(posUltDigito>=8)
			System.out.println(" ...Llamada al "+new String(digitos));
		else
			System.out.println(" ...Número erroneo");
		posUltDigito=-1;
	}
	public void cancelar() {
		if(posUltDigito>=8)
			System.out.println(" ...Llamada anulada");
		posUltDigito=-1;
	}
	public void anularDigito() {
		if(posUltDigito>=0) {
			System.out.print("\b \b");
			posUltDigito--;
		}			
	}

	private void ponDigito(char dig) {
		if(posUltDigito<digitos.length-1) {
			posUltDigito++;
			digitos[posUltDigito]=dig;
			System.out.print(dig);
		}
	}
	public void digito0() {
		ponDigito('0');
	}
	public void digito1() {
		ponDigito('1');
	}
	public void digito6() {
		ponDigito('6');
	}
	public void digito9() {
		ponDigito('9');
	}
	// nunca de comienzo
	public void digito2() {
		if(posUltDigito>=0)
			ponDigito('2');
	}

	public void digito3() {
		if(posUltDigito>=0)
			ponDigito('3');
	}
	public void digito4() {
		if(posUltDigito>=0)
			ponDigito('4');
	}
	public void digito5() {
		if(posUltDigito>=0)
			ponDigito('5');
	}
	public void digito7() {
		if(posUltDigito>=0)
			ponDigito('7');
	}
	public void digito8() {
		if(posUltDigito>=0)
			ponDigito('8');
	}
	
	
	
	// TODO Esto debería eliminarlo porque no fue solicitado en la especificación
	@Override
	public String toString() {
		String s="#";
		for (int i = 0; i <= posUltDigito; i++) {
			s += digitos[i];
		}
		s += '#';
		return s;
	}
}	

public class Caja {
	public Botella[] botellas;
	
	public String toString() {
		int i;
		String s="Caja Botellas\n";
		for (i = 0; i < botellas.length-1; i++) {
			s=s+botellas[i]+'\n';
		}
		s=s+botellas[i];
		
		
		return s;
	}
}

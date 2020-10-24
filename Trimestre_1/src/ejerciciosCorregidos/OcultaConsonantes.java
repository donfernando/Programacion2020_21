package ejerciciosCorregidos;
import java.util.Scanner;
public class OcultaConsonantes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String frase;
		int pos;
		char ch, ch_l;
		
		System.out.println("Introduzca frase...");
		frase=in.nextLine();
		
		for (pos = 0; pos < frase.length(); pos++) {
			ch=frase.charAt(pos);
			ch_l=Character.toLowerCase(ch);
			if(Character.isLetter(ch_l) &
				ch_l!='a'& ch_l!='e'& ch_l!='i'& ch_l!='o'& ch_l!='u')
				System.out.print('*');
			else
				System.out.print(ch);
		}
		System.out.println();
	}
}

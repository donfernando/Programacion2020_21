
public class PruebaFunc_04 {
	public static void main(String[] args) {
		float[] nums= {5f,6f,-7.6f,9.67f};
		float[] resul;

		FuncionesVarias.println(FuncionesNumeros.incrementos(nums));

		resul=FuncionesNumeros.incrementos(nums);
		FuncionesVarias.println(nums);
		FuncionesVarias.println(resul);
		
		
		resul=FuncionesNumeros.incrementos(new float[]{5f,6f,7f,9f});
		FuncionesVarias.println(resul);
		
		
		//for (int i = 0; i < resul.length; i++) {
		//	System.out.println(resul[i]);
		//}		
	}
}

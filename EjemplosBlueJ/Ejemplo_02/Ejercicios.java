public class Ejercicios {

	public static void main(String[] args) {
		float[] nums= {5f,6f,7f,9f};
		float[] resul;
		resul=incrementos(nums);
		
		for (int i = 0; i < resul.length; i++) {
			System.out.println(resul[i]);
		}		
	}
	
	public static float[] incrementos(float[]nums){
		
		float[] incrementos = new float [nums.length-1];
		
		for (int i = 0; i < nums.length-1; i++) {
			incrementos[i] = nums[i+1] - nums[i];
		}
		
		
		return incrementos;
		
	}
	public static DocumentoDNI[] merge(DocumentoDNI[]a, DocumentoDNI[]b){
		
		int posA = 0, posB = 0, posC = 0;
		DocumentoDNI[]c = new DocumentoDNI[a.length+b.length];
		
		while (posA<a.length && posB <b.length) {
			if (a[posA].edad<b[posB].edad) {
				c[posC] = a[posA];
				posA++;
			}else {
				c[posC] = b[posB];
				posB++;
			}
			posC++;
		}
		while (posA<a.length) {
			c[posC] = a[posA];
			posA++;
			posC++;			
		}
		while (posB<b.length) {
			c[posC] = b[posB];
			posB++;
			posC++;		
		}
		return c;
	}

}
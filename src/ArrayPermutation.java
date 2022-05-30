import java.util.Arrays;

public class ArrayPermutation {

	public static void main(String[] args) {
		int[] numeros= new int[] {1,3,2,1,5};
		numeros=getConcatenation(numeros);
		System.out.println(Arrays.toString(numeros));

	}
	
	public static int[] getConcatenation(int[] nums) {
	     int[] resultado= new int[nums.length*2];
	     int cont=0;
	     for(int i=0;i<nums.length;i++) {
	    	 resultado[i]=nums[i];
	     }
	     for(int i=resultado.length/2;i<resultado.length;i++) {
	    	 resultado[i]=nums[cont];
	    	 cont++;
	     }
		return resultado;
	}

}

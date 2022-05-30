import java.util.Arrays;

public class Sum1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros= new int[] {1,2,3,4};
		System.out.println(Arrays.toString(runningSum(numeros)));
	}
	
	
	   public static int[] runningSum(int[] nums) {
		   int[] result = new int[nums.length];
		   int suma=0;
		   for(int i=0;i<nums.length;i++) {
			   suma+=nums[i];
			   result[i]=suma;
		   }
		   
	        return result;
	    }
}

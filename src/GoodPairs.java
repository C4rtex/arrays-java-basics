
public class GoodPairs {

	public static void main(String[] args) {
		int[] arreglo= new int[] {1,2,3,1,1,3};
		System.out.println(numIdenticalPairs(arreglo));

	}
    public static int numIdenticalPairs(int[] nums) {
        int contador=0;
       for(int i=0;i<nums.length;i++){
           for(int k=i+1;k<nums.length;k++){
               if(nums[i]==nums[k]){
                   contador++;
               }
           }
       }
        return contador;
    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class EliminarElementoDeArray {

	public static void main(String[] args) {
		int[] array=new int[] {1,2,3,3,3,4,5,6,7};
		int[] array2=array.clone();

		
		array[0]=0;
		//System.out.println(Arrays.toString(array));
	//	System.out.println(Arrays.toString(array2));
		
		ArrayList<Integer> myArray = new ArrayList<>(Arrays.asList(1,2,3,3,3,4,5,6,7));
		ArrayList<Integer> myArray2 =  (ArrayList<Integer>) myArray.clone();
		Set<Integer> mySet=new HashSet<Integer>(myArray);
		myArray2.clear();
		myArray2.sort(null);
		for(Integer item:mySet) {
			myArray2.add(item);
		}
		System.out.println(myArray2);
		/*
		//Utilizando MAP
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++) {
			if(map.containsKey(array[i])) {
				continue;
			}
			map.put(array[i],1);
		}
		
		//Utilizando Set
		Set<Integer> mySet=new HashSet<Integer>(Arrays.stream(array).boxed().collect(Collectors.toList()));
		array	= mySet.stream().mapToInt(i->i).toArray();
		 */
	}
	
	public static double[] eliminarRepetidos(double[] nums) {
		Set<Double> eliminaRepetidos = new HashSet<Double>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
		return eliminaRepetidos.stream().mapToDouble(i->i).toArray();
		
	}
	
	

}

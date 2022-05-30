import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myArray=new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,4,5,6));
		Set<Integer> mySet = new HashSet<Integer>(myArray);
		myArray.clear();
		for(Integer s:mySet) {
			myArray.add(s);
		}
		System.out.println(myArray);
		
	}
}

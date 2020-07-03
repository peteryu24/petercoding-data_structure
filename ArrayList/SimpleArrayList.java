import java.util.ArrayList;

public class SimpleArraylist {
	public static void main(String[] args) {

		ArrayList<Integer> arrlist = new ArrayList<>();
		
		arrlist.add(3); // added to index 0
		arrlist.add(1,3); //added to index 1 (not the first index!)
		
		arrlist.remove(1); //index 1 removed
		
		System.out.println(arrlist.get(0)); // getting the value for index 0
		System.out.println(arrlist.size()); //size: 1
	} 
}

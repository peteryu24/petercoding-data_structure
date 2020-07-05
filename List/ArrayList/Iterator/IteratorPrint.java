import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPrint {
	public static void main(String[] args) {

		Iterator<Integer> arrlist = new IteratorPrint<>();

		arrlist.add(0);
		arrlist.add(1, 1);
		arrlist.add(2);
		arrlist.add(3, 3);
		arrlist.add(4);
		arrlist.add(5, 5);

		arrlist.remove(5);

		System.out.println("Index 0: " + arrlist.get(0));
		System.out.println("Index 1; " + arrlist.indexOf(1));
		System.out.println("Index's size: " + arrlist.size());
		System.out.println();

		Iterator<Integer> it1 = arrlist.iterator();  // four different ways to print an ArrayList
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		Iterator<Integer> it2 = arrlist.iterator();
		while (it2.hasNext()) {
			int value = it2.next();
			System.out.println(value);
		}
		
		for(int value : arrlist){ 
		    System.out.println(value);
		}
		
		for(int i=0; i<arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}

	}
}

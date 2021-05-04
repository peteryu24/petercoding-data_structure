package List;

public class ListTest {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		System.out.println("<<<l1 LinkedList>>>");
		l1.addFirst("a");
		l1.insert(l1.listSearch("a"),"b");
		l1.addLast("c");
		System.out.print("Size:" +l1.size()+" -> ");
		l1.print();
		l1.delete(l1.listSearch("b"), "c");
		System.out.print("Size:" +l1.size()+" -> ");
		l1.print();
		l1.deleteLastNode();
		System.out.print("Size:" +l1.size()+" -> ");
		l1.print();
		
		LinkedList l2 = new LinkedList();
		System.out.println("\n<<<l2 LinkedList>>>");
		l2.addFirst("1");
		System.out.print("Size:" +l2.size()+" -> ");
		l2.print();
		l2.insert(l2.listSearch("1"),"2");
		System.out.print("Size:" +l2.size()+" -> ");
		l2.print();
		l2.addLast("3");
		System.out.print("Size:" +l2.size()+" -> ");
		l2.print();
		l2.delete(l2.listSearch("2"), "3");
		System.out.print("Size:" +l2.size()+" -> ");
		l2.print();
		
		
		System.out.println("\n<<<l1+l2 LinkedList>>>");
		l1.ConcatList(l1, l2);
		System.out.print("Size:" +l1.size()+" -> ");
		l1.print();
		l1.reverse();
		System.out.print("Size:" +l1.size()+" -> ");
		l1.print();
		
	
		
	}
	

}

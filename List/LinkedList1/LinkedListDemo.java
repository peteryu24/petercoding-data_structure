
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);

		numbers.addLast(40);
		numbers.addLast(50);
		numbers.addLast(60);

		System.out.println(numbers.node(0));

		numbers.add(2, 25);

		System.out.println(numbers.toString());

		numbers.removeFirst();
		System.out.println(numbers.toString());

		numbers.remove(0);
		System.out.println(numbers.toString());

		numbers.removeLast();
		System.out.println(numbers.toString());

		System.out.println(numbers.size());

		System.out.println(numbers.get(0));

		System.out.println(numbers.indexOf(60));

	}
}

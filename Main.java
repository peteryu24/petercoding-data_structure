public class Main {
	public static void main(String[] args) {
		Array<String> s = new Array<String>();
		s.insert("apple");
		s.print();
		s.insert("banana");
		s.print();
		s.insert("cherry");
		s.print();
		s.insert("pineapple");
		s.print();
		s.insert("dort", 1);
		s.print();
		s.insert("echo", 4);
		s.print();
		s.insert("charlie");
		s.print();

		s.delete(4);
		s.print();
		s.delete(0);
		s.print();
		s.delete(0);
		s.print();
		s.delete(3);
		s.print();
		s.delete(0);
		s.print();

		System.out.println("1 is " + s.peek(1) + ".");
		System.out.println();

	}
}
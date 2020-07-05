public class ArrayListDemo {
	public static void main(String[] args) {
		Array<String> s = new Array<String>();
		s.insert("alpha");
		s.print();
		s.insert("beta");
		s.print();
		s.insert("charlie");
		s.print();
		s.insert("delta");
		s.print();
		s.insert("echo", 1);
		s.print();
		s.insert("foxtrot", 4);
		s.print();
		s.insert("golf");
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

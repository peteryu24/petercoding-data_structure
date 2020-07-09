package Stack;

public class ListStackTest {
	public static void main(String[] args) {

		ListStack<String> stack = new ListStack<String>();

		stack.push("alpha");
		stack.push("bravo");
		stack.push("charlie");
		System.out.println("The top is " + stack.peek());

		stack.push("delta");
		stack.print();
		stack.pop();
		System.out.println("The top is " + stack.peek());

		stack.push("echo");
		stack.print();
	}
}

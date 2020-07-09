package Stack;

public class ArrayStackTest {
	public static void main(String[] args) {

		ArrayStack<String> stack = new ArrayStack<String>();
		stack.push("alpha");
		stack.push("bravo");
		stack.push("charlie");

		System.out.println("The first index is: " + stack.peek());

		stack.push("delta");
		stack.print();
		stack.pop();

		System.out.println();
		System.out.println("The first index is: " + stack.peek());

		stack.push("echo");
		stack.print();
	}
}

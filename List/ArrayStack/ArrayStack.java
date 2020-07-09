package Stack;

import java.util.NoSuchElementException;

public class ArrayStack<E> {
	public E a[];
	public int top; 

	public ArrayStack() {
		a = (E[]) new Object[1];
		top = -1; 
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public E peek() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return a[top];
	}

	public void push(E newItem) {
		if (size() == a.length) {
			resize(2 * a.length);
		}
		a[++top] = newItem;
	}

	public E pop() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		E item = a[top];
		a[top--] = null;
		if (size() > 0 && size() == a.length / 4) {
			resize(a.length / 2);
		}
		return item;
	}

	public void resize(int newSize) {
		Object[] arr = new Object[newSize];
		for (int i = 0; i < size(); i++) {
			arr[i] = a[i];
		}
		a = (E[]) arr;
	}

	public void print() {
		System.out.print("The Stack: ");
		for (int i = 0; i < size(); i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}

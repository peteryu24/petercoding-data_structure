import java.util.*;

public class Array<E> {
	private E a[];
	private int size;

	public Array() {
		a = (E[]) new Object[1];
		size = 0;
	}

	public E peek(int k) {
		if (size == 0 || k >= size) {
			throw new NoSuchElementException();
		}
		return a[k];
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public void insertLast(E newItem) {
		if (size == a.length) {
			resize(2 * a.length);
		}
		a[size++] = newItem;
	}

	public void insert(E newItem, int k) {
		if (size == a.length) {
			resize(2 * a.length);
		}
		for (int i = size - 1; i >= k; i--) {
			a[i + 1] = a[i];
		}
		a[k] = newItem;
		size++;
	}

	public void insert(E newItem) {
		insertLast(newItem);
	}

	private void resize(int newSize) {
		Object[] t = new Object[newSize];
		for (int i = 0; i < size; i++) {
			t[i] = a[i];
		}
		a = (E[]) t;
	}

	public E delete(int k) {
		if (isEmpty()) {
			throw new NoSuchElementException();

		}
		E item = a[k];
		for (int i = k; i < size; i++) {
			a[i] = a[i + 1];
		}
		size--;
		if (size > 0 && size <= a.length / 4) {
			resize(a.length / 2);
		}
		return item;
	}

	public void print() {
		for (int i = 0; i < a.length; i++) {
			if (i < size) {
				System.out.printf(a[i] + "\t");
			} else {
				System.out.printf("null\t");
			}
		}
		System.out.println();
	}
}
import java.util.NoSuchElementException;

public class ArrlistExplain<E> { // <E> : Generic Class
	public E a[];// define Array's type : Generic
	public int size;

	public ArrlistExplain() {
		a = (E[]) new Object[1]; // Array's size : 1
		size = 0;
	}

	public E peek(int k) { // Generic type method , returns 'k'th array
		if (size == 0 || k >= size) {
			throw new NoSuchElementException(); // if size = 0 or tries to find a bigger array : error
		}
		return a[k]; // returns 'k'th array
	}

	public boolean isEmpty() { // is it a empty method?
		if (size == 0) {
			return true; // true if it's empty
		}
		return false;
	}

	public void insertLast(E newitem) { // inserts 'newitem' in the end of the array
		if (size == a.length) {
			resize(2 * a.length); // if the array is full, double the size
		}
		a[size++] = newitem; // insert 'newitem' , size + 1
	}

	public void insert(E newitem, int k) { // insert 'newitem' in 'k'th array
		if (size == a.length) {
			resize(2 * a.length); // if the array is full, double the size
		}
		for (int i = size - 1; i >= k; i--) { // size-1 : starts from the back, i>=k : till 'k'th, i-- : inverse
			a[i + 1] = a[i]; // each moves one array back
		}
		a[k] = newitem; // insert 'newitem' in the 'k'th array
		size++;
	}

	public void insert(E newitem) { // if there is no 'k'th array chosen, insert in the end
		insertLast(newitem);
	}

	public void resize(int newSize) { // resize
		Object[] t = new Object[newSize]; // new array : t[]
		for (int i = 0; i < size; i++) {
			t[i] = a[i]; // copy a[] to t[], a[] initializes
			a = (E[]) t; // put t[] back to a[]
		}
	}

	public E delete(int k) { // delete 'k'th array
		if (isEmpty()) {
			throw new NoSuchElementException(); // if it's empty
		}
		E item = a[k];
		for (int i = k; i < size; i++) {
			a[i] = a[i + 1]; // fill up the empty array from the back
		}
		size--;
		if (size > 0 && size <= a.length / 4) { // if the array's 3/4 is empty
			resize(a.length / 2); // delete half of it
		}
		return item;
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("It is Empty.");
		} else {
			for (int i = 0; i < size; i++) {
				System.out.println(a[i]);
			}
		}

	}
}
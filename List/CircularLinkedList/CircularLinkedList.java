import java.util.NoSuchElementException;

public class CircularLinkedList<E> {
	public Node last;
	public int size;

	public CircularLinkedList() {
		last = null;
		size = 0;
	}

	public void insert(E newItem) {
		Node newNode = new Node(newItem, null);
		if (last == null) { // if the list is empty
			newNode.setNext(newNode);
			last = newNode;
		} else {
			newNode.setNext(last.getNext()); // skipping
			last.setNext(newNode);
		}
		size++;
	}

	public Node delete() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		Node x = last.getNext();
		if (x == last) { // if there is one node
			last = null;
		} else {
			last.setNext(x.getNext()); // skipping
			x.setNext(null); // delete x's next
		}
		size--;
		return x;
	}

}

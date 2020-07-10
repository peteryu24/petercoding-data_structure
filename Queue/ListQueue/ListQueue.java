package Queue;

import java.util.NoSuchElementException;

public class ListQueue<E> {
	public Node<E> front, rear;
	public int size;

	public ListQueue() {
		front = rear = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void add(E newItem) {
		Node newNode = new Node(newItem, null);
		if (isEmpty()) {
			front = newNode;
		} else {
			rear.setNext(newNode);
		}
		rear = newNode;
		size++;
	}

	public E remove() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		E frontItem = front.getItem();
		if (isEmpty()) {
			rear = null;
		}
		size--;
		return frontItem;
	}

}

class Node<E> {
	public E item;
	public Node<E> next;

	public Node(E newItem, Node<E> node) {
		item = newItem;
		next = node;
	}

	public E getItem() {
		return item;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setItem(E newItem) {
		item = newItem;
	}

	public void setNext(Node<E> newNext) {
		next = newNext;
	}
}

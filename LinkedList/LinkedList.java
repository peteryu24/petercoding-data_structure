import java.util.ListIterator;

public class LinkedList {

	private Node head; // first node
	private Node tail; // last node
	private int size = 0; // size

	private class Node {
		private Object data; // actual data
		private Node next; // what is the next node?

		public Node(Object input) { // to make a node
			this.data = input; // the first data
			this.next = null; // doesn't have the next node yet
		}

		public String toString() { // to see the data in a node
			return String.valueOf(this.data);
		}
	}

	public void addFirst(Object input) {
		Node newNode = new Node(input); // 22 -> 11
		newNode.next = head; // used when another node is made
		head = newNode; // 24 -> 3 , needs to be changed everytime
		size++;
		if (head.next == null) { // if it's the only node made
			tail = head;
		}
	}

	public void addLast(Object input) {
		Node newNode = new Node(input);
		if (size == 0) {
			addFirst(input); // last or first are either same
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	Node node(int index) {
		Node x = head;
		for (int i = 0; i < index; i++) {
			x = x.next; // keeps moving until index
		}
		return x;
	}

	public void add(int k, Object input) {
		if (k == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(k - 1); // need to find a before node to connect
			// index 1 is returned (the one before)
			Node temp2 = temp1.next; // index 2 is found (the one after)
			Node newNode = new Node(input);
			temp1.next = newNode; // index 1 -> newNode
			newNode.next = temp2; // newNode -> index 2
			size++;
			if (newNode.next == null) {
				tail = newNode; // if there is no temp2
			}
		}

	}

	public String toString() {
		if (head == null) {
			return "[]";
		} else {
			Node temp = head;
			String str = "[";

			while (temp.next != null) {
				str += temp.data + ", ";
				temp = temp.next; // until there is no temp.next
			}
			str += temp.data;
			return str + "]";
		}
	}

	public Object removeFirst() {
		Node temp = head;
		head = head.next; // making the second node the first node
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}

	public Object remove(int k) {
		if (k == 0) {
			return removeFirst();
		} else {
			Node temp = node(k - 1);
			Node todoDeleted = temp.next; // the node being deleted
			temp.next = temp.next.next; // to skip
			Object returnData = todoDeleted.data;
			if (todoDeleted == tail) { // if the node being deleted is the tail
				temp = tail;
			}
			todoDeleted = null; // unnecessary
			size--;
			return returnData;
		}

	}

	public Object removeLast() {
		return remove(size - 1); // you can't delete only the tail
	}

	public int size() {
		return size;
	}

	public Object get(int k) {
		Node temp = node(k);
		return temp;

	}

	public Object indexOf(Object input) {
		Node temp = head;
		int index = 0;
		while (input != temp) {
			temp = temp.next;
			index++;
			if (temp == null) {
				return "There is no " + input;
			}
		}
		return index;
	}

}

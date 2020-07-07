import java.util.NoSuchElementException;

public class DoubleLinkedList<E> {
	public DNode head, tail;
	public int size;

	public DoubleLinkedList() {
		head = new DNode(null, null, null);
		tail = new DNode(null, head, null); // tail's previous is head
		head.setNext(tail); // head's next is tail
		size = 0;
	}

	public void insertBefore(DNode p, E newItem) { // inserting before p
		DNode t = p.getPrevious(); // t -> previous node
		DNode newNode = new DNode(newItem, t, p); // p -> the one after
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}

	public void insertAfter(DNode p, E newItem) {// inserting after p
		DNode t = p.getNext();
		DNode newNode = new DNode(newItem, p, t);
		t.setPrevious(newNode);
		p.setNext(newNode);
		size++;
	}

	public void delete(DNode x) { // deleting x
		if (x == null) {
			throw new NoSuchElementException();
		}
		if (size <= 0) {
			throw new NoSuchElementException();
		}
		DNode f = x.getPrevious();
		DNode r = x.getNext();
		f.setNext(r);
		r.setPrevious(f);
		size--;
	}

}

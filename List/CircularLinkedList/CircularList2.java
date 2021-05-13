package Circular;

public class CircularList {
	private int length = 0;
	private ListNode tail;

	public CircularList() {
	}

	public int size() {
		return length;
	}

	public void addFirst(Object x) { // list의 앞에 삽입
		ListNode newNode = new ListNode(x); // 새로운 노드 생성

		if (tail == null) { // list가 비어있으면
			tail = newNode;
			newNode.link = newNode;
		} else { // list에 노드가 있으면
			newNode.link = tail.link; // newNode.next = tail.next(첫노드)
			tail.link = newNode; // tail.next는 새로운 노드를 가리킨다
		}
		length++;
	}

	public void addLast(Object x) { // list의 뒤에 삽입
		ListNode newNode = new ListNode(x); // 새로운 노드 생성

		if (tail == null) { // list가 비어있으면
			tail = newNode;
			newNode.link = (newNode);
		} else { // list에 노드가 있으면
			newNode.link = tail.link; // newNode.next = tail.next(첫노드)
			tail.link = (newNode); // tail.next는 새로운 노드를 가리킨다
			tail = newNode; // newNode가 tail이 된다
		}
		length++;
	}

	public void insert(ListNode p, Object x) {
		ListNode newNode = new ListNode(x);
		ListNode h = tail.link;
		if (tail == null) { // list가 비어있으면
			tail = newNode;
			newNode.link = newNode;
		} else if (p == tail || p == null) {
			newNode.link = tail.link; // newNode.next = tail.next(첫노드)
			tail.link = (newNode); // tail.next는 새로운 노드를 가리킨다
			tail = newNode;

		} else {
			while(h.link!=p) {
				h=h.link;
			}
			h.link=newNode;
			newNode.link=h.link.link;
		}

		length++;
	}

	public void print() {
		if (tail == null) { // list가 비어있을 때
		}

		ListNode p = tail.link; // 첫노드

		while (p != tail) { // 마지막 노드 전까지 출력
			System.out.print(p.data + " ");
			p = p.link;
		}

		System.out.print(p.data + " "); // 마지막 노드 출력
		System.out.println();
		System.out.println("크기: " + length);
	}

	public void delete(ListNode p) { 
		ListNode h = tail.link;
		if (tail == null) { // list가 비어있으면

		}else {
			if(p.data.equals(tail)) {
				
			}
			
			length--;
		}
	}

	public ListNode listSearch(Object data) {
		ListNode p = tail.link;
		while (p != tail) {
			if (p.data.equals(data)) {
				return p;
			}
		}
		return p;
	}

	public ListNode listSearch1(Object data) {
		ListNode p = tail.link;
		if (p == null) {
			System.out.println("listSearch 에서 찾으시는 데이터가 없습니다.");
			return null;
		} else {
			do {
				if (p.equals(data)) {
					return p;
				} else {
					p = p.link;
				}
			} while (p != tail);
			return p;

		}
	}

}

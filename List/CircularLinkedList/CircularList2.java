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
			ListNode current = tail;
			while (current.link != tail) {
				current = current.link;
			}
			newNode.link = current.link;
			current.link = newNode;

		} else {
			ListNode current = tail;
			while (current.link != p) {
				current = current.link;
			}
			current = current.link;
			newNode.link = current.link;
			current.link = newNode;

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
		if (tail == null) { // 공백 리스트 - 삭제 할 리스트가 없음
			return;
		} else if (p == null) { // 위치 미지정 - 첫번째 노드 삭제
			tail.putLink(tail.getLink().getLink());
			length--;
		} else if (p == tail) { // 위치가 마지막 노드일 경우
			System.out.println("삭제할 다음 리스트가 없습니다.");
			return;
		} else { // p의 다음 노드
			p.putLink(p.getLink().getLink());
			length--;
		}
	}

	public ListNode listSearch(Object data) {
		ListNode node = new ListNode(data);
		if (tail == null) {
			System.out.println("노드가 비어있습니다.");
			return null;
		} else {
			ListNode current = tail;
			while (current.data != node.data) {
				current = current.link;
			}
			return current;
		}
	}

}

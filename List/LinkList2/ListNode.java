package List;

public class ListNode {
	Object data;
	ListNode link;

	public ListNode() {
	}

	public ListNode(Object n) {
		data = n;
		link = null;
	}

	public ListNode(Object n, ListNode next) {
		data=n;
		link=next;
	}

	public void putData(Object n) {
		data = n;
	}

	public Object getData() {
		return data;
	}

	public void putLink(ListNode next) {
		link=next;
	}

	public ListNode getLink() {
		return link;
	}
}

package List;

public class LinkedList {
	private int length=0;;
	private ListNode firstNode;

	public LinkedList() {
	}

	public int size() {
		return length;
	}

	public void addFirst(Object x) {
		ListNode newNode = new ListNode(x, firstNode);
		newNode.putLink(firstNode);
		firstNode = newNode;
		length++;

		/*
		 * ListNode newNode = new ListNode(); newNode.data=x; newNode.link=head;
		 * head=newNode;
		 */

	}

	public void insert(ListNode p, Object x) {
		ListNode newNode = new ListNode();
		newNode.data = x;
		if (firstNode == null) {
			firstNode = newNode;
			newNode.link = null;
		} else if (p == null) {
			newNode.link = firstNode;
			firstNode = newNode;
		} else {
			newNode.link = p.link;
			p.link = newNode;
		}
		length++;
	}

	public void addLast(Object x) {
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = null;
		if (firstNode == null) {
			firstNode = newNode;
		} else {
			ListNode p = firstNode;
			while (p.link != null) {
				p = p.link;
			}
			p.link = newNode;
		}
		length++;

	}

	public void delete(ListNode p, Object x) {
		if (firstNode == null) {

		} else if (p == null) {
			firstNode = firstNode.link;
			length--;
		} else {
			if (p.link == null) {

			} else {
				p.link = p.link.link;
				length--;
			}
		}
	}

	public void reverse() {
		ListNode p= firstNode;
		ListNode q= null;
		while(p!=null) {
			ListNode r=q;
			q=p;
			p=p.link;
			q.link=r;
		}
		firstNode=q;
		
	}

	public LinkedList ConcatList(LinkedList l1, LinkedList l2) {
		if(this.firstNode==null) {
			this.firstNode=l2.firstNode;
		}else if(l2.firstNode==null) {
			
		}else {
			ListNode p =firstNode;
			while(p.link!=null) {
				p=p.link;
			}
			p.link=l2.firstNode;
		}
		length=l1.size()+l2.size();
		return l1;
	}

	public ListNode listSearch(Object data) {
		ListNode p =firstNode;
		while(p!=null) {
			if(p.data.equals(data)) {
				return p;
			}else {
				p=p.link;
			}
		}
		return p;
	}

	public void deleteLastNode() {
		ListNode p,c;
		if(firstNode==null) {
			return;
		}else if(firstNode.link==null) {
			firstNode=null;
			length--;
		}else {
			p=firstNode;
			c=firstNode.link;
			length--;
			while(c.link!=null) {
				p=c;
				c=c.link;
				length--;
			}
			p.link=null;
		}
	}

	public void print() {
		ListNode p=firstNode;
		System.out.print("(");
		while(p!=null) {
			System.out.print(p.data);
			p=p.link;
			if(p!=null) {
				System.out.print(", ");
			}
		}
		System.out.print(")");
		System.out.println("");
	}
}

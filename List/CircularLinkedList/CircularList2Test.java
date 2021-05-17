package Circular;


public class CircularListTest {
	public static void main(String[] args) {
		CircularList l1 = new CircularList();
		
		System.out.println("<<<l1 리스트>>>");
		l1.addFirst("b");
		l1.addFirst("a");
		l1.addLast("d");
		l1.addLast("e");
		l1.addLast("f");
		l1.addLast("g");
		l1.insert(l1.listSearch("b"), "c"); // b 다음에 c 넣기
		l1.print();
		l1.delete(l1.listSearch("b"));  // b 다음 원소 삭제
		l1.print();
		
		
	
	
		
	}
	

}

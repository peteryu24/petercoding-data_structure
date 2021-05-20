package GenList;

public class GenListTest {
	public static void main(String[] args) {
		GenList g1 = new GenList();
		g1.insertData(new Integer(82));
		g1.insertData("Korea");
		
		GenList g2 = new GenList();
		g2.insertData(g1);
		g2.insertData("Seoul");
		
		GenList g3 = new GenList();
		g3.insertData("Busan");
		
		GenList g4 = new GenList();
		g4.insertData(g3);
		g4.insertData(g2);
		g4.insertData("City");
		g4.printGL();
		System.out.println("");
	}
}

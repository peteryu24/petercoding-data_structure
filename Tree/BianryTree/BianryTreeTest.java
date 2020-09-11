public class BianryTreeTest {

	public static void main(String[] args) {
		BinaryTree A = new BinaryTree();
		TreeNode node1 = A.makenode(null, 1, null);
		TreeNode node2 = A.makenode(null, 7, null);
		TreeNode node3 = A.makenode(node1, 3, node2);
		TreeNode node4 = A.makenode(null, 14, null);
		TreeNode node5 = A.makenode(node3, 9, node4);
		TreeNode node6 = A.makenode(null, 44, null);
		TreeNode node7 = A.makenode(null, 36, node6);
		TreeNode node8 = A.makenode(null, 97, null);
		TreeNode node9 = A.makenode(null, 94, node8);
		TreeNode node10 = A.makenode(node7, 67, node9);
		TreeNode node11 = A.makenode(node5, 22, node10);

		System.out.println("Preorder");
		A.preorder(node11);
		System.out.println("\n");

		System.out.println("Postorder");
		A.postorder(node11);
		System.out.println("\n");

		System.out.println("Inorder");
		A.inorder(node11);
		System.out.println("\n");

		System.out.println(A.nodecount(node11)); 
		System.out.println(A.leafcount(node11)); 
		System.out.println(A.depthcount(node11)-1); 

	}
}

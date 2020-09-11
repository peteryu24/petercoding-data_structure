
public class BianryTree {
	private TreeNode root;
	public static int count;
	public static int leafcount;

	public TreeNode makenode(TreeNode leftv, int data, TreeNode rightv) {
		root = new TreeNode(data);
		root.left = leftv;
		root.right = rightv;
		return root;
	}

	public void preorder(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + ",");
			preorder(root.left);
			preorder(root.right);
		}
	}

	public void postorder(TreeNode root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + ",");
		}
	}

	public void inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + ",");
			inorder(root.right);
		}
	}

	public int nodecount(TreeNode root) {
		int count = 0;
		if (root == null) {
			return 0;
		} else {
			count += 1 + nodecount(root.left) + nodecount(root.right);
		}
		return count;
	}

	public int leafcount(TreeNode root) {
		if (root != null) {
			if ((root.left == null) && (root.right == null)) {
				this.leafcount++;
			}
			leafcount(root.left);
			leafcount(root.right);
		}
		return this.leafcount;

	}

	public int depthcount(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + (Math.max(depthcount(root.left), depthcount(root.right)));
		}

	}
}

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data1) {
		data = data1;
		left = null;
		right = null;
	}

}

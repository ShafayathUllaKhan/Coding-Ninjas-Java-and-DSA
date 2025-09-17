package Chapter_20;

public class BST_5 {
	private BinaryTreeNode_1<Integer> root;
	private int size;
	
	
	private static boolean isPresentHelper(BinaryTreeNode_1<Integer> node,int x) {
		if(node == null) {
			return false;
		}
		if(node.data == x) {
			return true;
		}
		if(x < node.data) {
			return isPresentHelper(node.left,x);
		}else {
			return isPresentHelper(node.right,x);
		}
	}
	
	public boolean isPresent(int x) {
		return isPresentHelper(root,x);
	}
	
	private static BinaryTreeNode_1<Integer> insert(BinaryTreeNode_1<Integer> node,int x){
		if(node == null) {
			BinaryTreeNode_1<Integer> newRoot = new BinaryTreeNode_1<Integer>(x);
			return newRoot;
		}
		if(x >= node.data) {
			node.right = insert(node.right,x);
		}else {
			node.left = insert(node.left,x);
		}
		return node;
	}
	
	public void insert(int x) {
		root = insert(root,x);
		size++;
	}
	
	private static int minimum(BinaryTreeNode_1<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int minLeft = minimum(root.left);
		int minRight = minimum(root.right);
		return Math.min(root.data, Math.min(minLeft, minRight));
	}
	
	private static BSTDeleteReturn_7 deleteDataHelper(BinaryTreeNode_1<Integer> root, int x) {
		if(root == null) {
			return new BSTDeleteReturn_7(null,false);
			
		}
		if(root.data < x) {
			BSTDeleteReturn_7 outputRight = deleteDataHelper(root.right,x);
			root.right = outputRight.root;
			outputRight.root = root;
			return outputRight;
		}
		
		if(root.data > x) {
			BSTDeleteReturn_7 outputLeft = deleteDataHelper(root.left,x);
			root.left = outputLeft.root;
			outputLeft.root = root;
			return outputLeft;
		}
		
		// 0 children
		if(root.left == null && root.right == null) {
			return new BSTDeleteReturn_7(null,true);
		}
		
		// only left child
		if(root.left != null && root.right == null) {
			return new BSTDeleteReturn_7(root.left,true);
		}
		
		// only right child
				if(root.left == null && root.right != null) {
					return new BSTDeleteReturn_7(root.right,true);
				}
				
		// both children are present
		int rightMin = minimum(root.right);
		root.data = rightMin;
		BSTDeleteReturn_7 outputRight = deleteDataHelper(root.right,rightMin);
		root.right = outputRight.root;
		return new BSTDeleteReturn_7(root,true);
	}
	
	
	public boolean deleteData(int x) {
		BSTDeleteReturn_7 output = deleteDataHelper(root,x);
		root = output.root;
		if(output.deleted) {
			size--;
		}
		return output.deleted;
	}
	
	public int size() {
		return size;
	}
	
	private static void printTreeHelper(BinaryTreeNode_1<Integer> node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data + ": ");
		if(node.left != null) {
			System.out.print("L" + node.left.data + ", ");
		}
		
		if(node.right != null) {
			System.out.print("R" + node.right.data + ", ");
		}
		System.out.println();
		printTreeHelper(node.left);
		printTreeHelper(node.right);
	}
	
	public void printTree() {
		printTreeHelper(root);
	}
}

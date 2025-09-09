package Chapter_20;

import java.util.Scanner;

public class BinaryTreeUse_2 {
	
	public static BinaryTreeNode_1<Integer> takeTreeInputBetter(boolean isRoot,int parentData, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of" + parentData);
			}else {
				System.out.println("Enter right child of" + parentData);
			}
		}
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode_1<Integer> root = new BinaryTreeNode_1<Integer>(rootData);
		BinaryTreeNode_1<Integer> leftChild = takeTreeInputBetter(false,rootData,true);
		BinaryTreeNode_1<Integer> rightChild = takeTreeInputBetter(false,rootData,false);
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	
	public static BinaryTreeNode_1<Integer> takeTreeInput(){
		System.out.println("Enter root data");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode_1<Integer> root = new BinaryTreeNode_1<Integer>(rootData);
		BinaryTreeNode_1<Integer> leftChild = takeTreeInput();
		BinaryTreeNode_1<Integer> rightChild = takeTreeInput();
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	public static void printTreeDetailed(BinaryTreeNode_1<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ": ");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		
		if(root.right != null) {
			System.out.print("R" + root.right.data + ", ");
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	
	public static void printTree(BinaryTreeNode_1<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printTree(root.left);
		printTree(root.right);
	}
	
	public static int numNodes(BinaryTreeNode_1<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);
		return 1 + leftNodeCount + rightNodeCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeNode_1<Integer> root = new BinaryTreeNode_1<Integer>(1);
		BinaryTreeNode_1<Integer> rootLeft = new BinaryTreeNode_1<Integer>(2);
		BinaryTreeNode_1<Integer> rootRight = new BinaryTreeNode_1<Integer>(3);
		root.left = rootLeft;
		root.right = rootRight;
		BinaryTreeNode_1<Integer> twoRight = new BinaryTreeNode_1<Integer>(4);
		BinaryTreeNode_1<Integer> threeLeft = new BinaryTreeNode_1<Integer>(5);
		rootLeft.right = twoRight;
		rootRight.left = threeLeft;
		printTree(root);
		System.out.println();
		printTreeDetailed(root);
		System.out.println("Num nodes "+ numNodes(root));
	}
}

package Chapter_20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse_2 {
	
	public static BinaryTreeNode_1<Integer> takeInputLevelWise(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;	
		}
		BinaryTreeNode_1<Integer> root = new BinaryTreeNode_1<Integer>(rootData);
		Queue<BinaryTreeNode_1<Integer>> pendingChildren = new LinkedList<BinaryTreeNode_1<Integer>>();
		pendingChildren.add(root);
		while(!pendingChildren.isEmpty()) {
			BinaryTreeNode_1<Integer> front = pendingChildren.poll();
			System.out.println("Enter left child of" + front.data);
			int left = s.nextInt();
			if(left != -1) {
				BinaryTreeNode_1<Integer> leftChild = new BinaryTreeNode_1<Integer>(left);
				front.left = leftChild;
				pendingChildren.add(leftChild);
			}
			
			System.out.println("Enter right child of" + front.data);
			int right = s.nextInt();
			if(right != -1) {
				BinaryTreeNode_1<Integer> rightChild = new BinaryTreeNode_1<Integer>(right);
				front.left = rightChild;
				pendingChildren.add(rightChild);
			}
		}
		return root;
	}
	
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
	
	public static int largest(BinaryTreeNode_1<Integer> root) {
		if(root == null) {
			return -1;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);
		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}
	
	public static int numLeaves(BinaryTreeNode_1<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			return 1;
		}
		return numLeaves(root.left)+numLeaves(root.right);
	}
	
	public static void printAtDepthK(BinaryTreeNode_1<Integer> root, int k) {
		if(root == null) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
		}
		printAtDepthK(root.left , k-1);
		printAtDepthK(root.right, k-1);
	}
	
	public static BinaryTreeNode_1<Integer> removeLeaves(BinaryTreeNode_1<Integer> root){
		if(root == null) {
			return null;
		}
		if(root.left == null && root.right == null) {
			return null;
		}
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}
	
	public static int height(BinaryTreeNode_1<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	public static boolean isBalanced(BinaryTreeNode_1<Integer> root) {
		if(root == null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		if(Math.abs(leftHeight - rightHeight)>1){
			return false;
		}
		boolean isLeftBalanced = isBalanced(root.left);
		boolean isRightBalanced = isBalanced(root.right);
		return isLeftBalanced && isRightBalanced;
	}
	
	public static BalancedTreeReturn_3 isBalancedBetter(BinaryTreeNode_1<Integer> root) {
		if(root == null) {
			int height = 0;
			boolean isBal = true;
			BalancedTreeReturn_3 ans = new BalancedTreeReturn_3();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}
		BalancedTreeReturn_3 leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn_3 rightOutput = isBalancedBetter(root.right);
		boolean isBal = true;
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);	
		
		if(Math.abs(leftOutput.height - rightOutput.height)>1) {
			isBal = false;
		}
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		BalancedTreeReturn_3 ans = new BalancedTreeReturn_3();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
		
	}
	
	public static BinaryTreeNode_1<Integer> buildTreeFromPreInHelper(int []pre,int [] in,int siPre,int eiPre,int siIn,int eiIn){
		if(siPre > eiPre) {
			return null;
		}
		int rootData = pre[siPre];
		BinaryTreeNode_1<Integer>  root = new BinaryTreeNode_1<Integer>(rootData);
		
		int rootIndex = -1;
		for(int i=siIn;i<= eiIn;i++) {
			if(in[i]==rootData) {
				rootIndex = i;
				break;
			}
		}
		
		int siPreLeft = siPre + 1;
		int siInLeft = siIn;
		int eiInLeft = rootIndex -1;
		int siInRight=rootIndex + 1;
		int eiPreRight=eiPre;
		int eiInRight=eiIn;
		
		int leftSubtreeLength = eiInLeft - siInLeft + 1;	
		int eiPreLeft = siPreLeft + leftSubtreeLength -1;
		int siPreRight = eiPreLeft + 1;
		
		BinaryTreeNode_1<Integer> left = buildTreeFromPreInHelper(pre,in,siPreLeft,eiPreLeft,siInLeft,eiInLeft);
		BinaryTreeNode_1<Integer> right = buildTreeFromPreInHelper(pre,in,siPreRight,eiPreRight,siInRight,eiInRight);
		
		root.left = left;
		root.right = right;
		return root;
		
	}
	
	public static BinaryTreeNode_1<Integer> buildTreeFromPreIn(int pre[],int in[]){
		BinaryTreeNode_1<Integer> root = buildTreeFromPreInHelper(pre,in,0,pre.length-1,0,in.length-1);
		return root;
	}
	
	public static boolean searchBST(BinaryTreeNode_1<Integer> root,int data) {
		if(root == null) {
			return false;
		}
		if(root.data == data) {
			return true;
		}
		if(data < root.data) {
			return searchBST(root.left,data);
		}
		return searchBST(root.right,data);
	}
	
	public static void printBetweenK1K2(BinaryTreeNode_1<Integer> root,int k1,int k2) {
		if(root == null) {
			return;
		}
		if(root.data < k1) {
			printBetweenK1K2(root.right,k1,k2);
		}else if(root.data > k2) {
			printBetweenK1K2(root.left,k1,k2);
		}else {
			System.out.println(root.data);
			printBetweenK1K2(root.left,k1,k2);
			printBetweenK1K2(root.right,k1,k2);
		}
	}
	
	public static int minimum(BinaryTreeNode_1<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int leftMin = minimum(root.left);
		int rightMin = minimum(root.right);
		return Math.min(root.data,Math.min(leftMin, rightMin));
		
	}
	
	public static int largest1(BinaryTreeNode_1<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int largestLeft = largest1(root.left);
		int largestRight = largest1(root.right);
		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}
	
	public static boolean isBST(BinaryTreeNode_1<Integer> root) {
		if(root == null) {
			return true;
		}
		
		int leftMax = largest1(root.left);
		if(leftMax >= root.data) {
			return false;
		}
		int rightMIn = minimum(root.right);
		if(rightMIn < root.data) {
			return false;
		}
		
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);
		return isLeftBST && isRightBST;
	}
	
	public static IsBSTReturn_4 isBSTBetter(BinaryTreeNode_1<Integer> root) {
		if(root == null) {
			IsBSTReturn_4 ans = new IsBSTReturn_4(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
			return ans;
		}
		IsBSTReturn_4 leftAns = isBSTBetter(root.left);
		IsBSTReturn_4 rightAns = isBSTBetter(root.right);
		int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
		int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
		boolean isBST = true;
		if(leftAns.max >= root.data) {
			isBST = false;
		}
		if(rightAns.min < root.data) {
			isBST = false;
		}
		if(!leftAns.isBST) {
			isBST = false;
		}
		if(!rightAns.isBST) {
			isBST = false;
		}
		
		IsBSTReturn_4 ans = new IsBSTReturn_4(min,max,isBST);
		return ans;
	}
	
	public static boolean isBSTmorebetter(BinaryTreeNode_1<Integer> root,int minRange,int maxRange) {
		if(root == null) {
			return true;
		}
		if(root.data < minRange || root.data > maxRange) {
			return false;
		}
		boolean isLeftwithinRange = isBSTmorebetter(root.left,minRange,root.data-1);
		boolean isRightwithinRange = isBSTmorebetter(root.right,root.data,maxRange);
		return isLeftwithinRange && isRightwithinRange;
	}
	
	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode_1<Integer> root,int x){
		if(root == null) {
			return null;
		}
		if(root.data == x) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> leftOutput = nodeToRootPath(root.left,x);
		if(leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		
		ArrayList<Integer> rightOutput = nodeToRootPath(root.right,x);
		if(rightOutput != null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		
		return null;
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
		BinaryTreeNode_1<Integer> root1 = takeInputLevelWise();
		System.out.println("Largest "+ largest(root));
		System.out.println("num leaves"+ numLeaves(root));
		System.out.println("Print at depth k");
		printAtDepthK(root,2);
		BinaryTreeNode_1<Integer> newRoot = removeLeaves(root);
		printTreeDetailed(newRoot);
		
		System.out.println("is balanced"+isBalanced(root));
		System.out.println("is balanced "+isBalancedBetter(root).isBalanced);
		
		int in[] = {1,2,3,4,5,6,7};
		int pre[] = {4,2,1,3,6,5,7};
		BinaryTreeNode_1<Integer> rootPreIn = buildTreeFromPreIn(pre,in);
		printTreeDetailed(rootPreIn);
		System.out.println(searchBST(root,3));
		System.out.println(isBST(root));
		IsBSTReturn_4 ans = isBSTBetter(root);
		System.out.println(ans.min + " "+ ans.max + " "+ans.isBST);
		
		rootPreIn = takeTreeInputBetter(true,0,true);
		ArrayList<Integer> path = nodeToRootPath(rootPreIn,5);
		if(path == null) {
			System.out.println("Not Found");
		}else {
			for(int i:path) {
				System.out.println(i);
			}
		}
		
		// pending problems
		// height of tree level wise
		// diameter of binary tree
		// tree traversal
		// convert sorted array to bst
	}
}

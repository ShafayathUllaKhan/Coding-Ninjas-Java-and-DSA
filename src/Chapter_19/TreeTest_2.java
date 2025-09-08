package Chapter_19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeTest_2 {
	
	public static TreeNode_1<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		Queue<TreeNode_1<Integer>> pendingNodes = new LinkedList<>();
		System.out.println("Enter the root data");
		int rootData =s.nextInt();
		if(rootData == -1) {
			return null;
		}
		TreeNode_1<Integer> root =new TreeNode_1<Integer>(rootData);
		pendingNodes.add(root);
		
		while(!pendingNodes.isEmpty()) {
			TreeNode_1<Integer> front = pendingNodes.remove();
			System.out.println("Enter the no of children for: " + front.data);
			int numChild = s.nextInt();
			for(int i=0;i<numChild;i++) {
				System.out.println("Enter the "+ i + "th child data for" + front.data);
				int childData = s.nextInt();
				TreeNode_1<Integer> childNode = new TreeNode_1<>(childData);
				front.children.add(childNode);
				pendingNodes.add(childNode);
			}
		}
		return root;
	}
	public static int numberOfNodes(TreeNode_1<Integer> root) {
		int count = 1;
		for(int i=0;i<root.children.size();i++) {
			int childCount = numberOfNodes(root.children.get(i));
			count += childCount;
		}
		return count;
	}
	
	public static void printTree(TreeNode_1<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		for(int i=0;i<root.children.size();i++) {
			TreeNode_1<Integer> child = root.children.get(i);
			printTree(child);
		}
	}
    
	public static void printTreeBetter(TreeNode_1<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ": ");
		for(int i=0;i<root.children.size();i++) {
			System.out.print(root.children.get(i).data + " ");
		}
		System.out.println();
		for(int i=0;i<root.children.size();i++) {
			TreeNode_1<Integer> child = root.children.get(i);
			printTreeBetter(child);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode_1<Integer> root = new TreeNode_1<>(4);
		TreeNode_1<Integer> node1 = new TreeNode_1<>(2);
		TreeNode_1<Integer> node2 = new TreeNode_1<>(3);
		TreeNode_1<Integer> node3 = new TreeNode_1<>(1);
		TreeNode_1<Integer> node4 = new TreeNode_1<>(5);
		TreeNode_1<Integer> node5 = new TreeNode_1<>(6);
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node2.children.add(node4);
		node2.children.add(node5);		
		
		printTree(root);
		printTreeBetter(root);
		System.out.println(numberOfNodes(root));
		
		TreeNode_1<Integer> root1 = takeInput();
		printTreeBetter(root1);
	}
}

package Chapter_20;

public class BSTUse_6 {
	public static void main(String[] args) {
		BST_5 b = new BST_5();
		b.insert(5);
		b.insert(2);
		b.insert(7);
		b.insert(1);
		b.insert(3);
		b.insert(6);
		b.insert(8);
		
		b.printTree();
		System.out.println(b.isPresent(5));
		b.deleteData(5);
		
		System.out.println(b.isPresent(5));
		b.printTree();
		
		// avl trees
		// red black trees
		// difference between bst and balanced bst
		
	}
}

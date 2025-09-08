package Chapter_19;

import java.util.ArrayList;

public class TreeNode_1<T> {

	T data;
	ArrayList<TreeNode_1<T>> children;
	
	public TreeNode_1(T data) {
		this.data = data;
		this.children = new ArrayList<>();
	}
	
}

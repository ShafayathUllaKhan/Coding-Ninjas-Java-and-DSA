package Chapter_18;

import Chapter_17.Node_3;

public class StackUsingLL_5<T> {

	private Node_3<T> head;
	private int size;
	
	public StackUsingLL_5() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void push(T elem) {
		Node_3<T> newNode = new Node_3<T>(elem);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public T top() throws StackemptyException_4 {
		if(head  == null) {
			throw new StackemptyException_4();
		}
		return head.data;
	}
	
	public T pop() throws StackemptyException_4 {
		if(head == null) {
			throw new StackemptyException_4();
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
}

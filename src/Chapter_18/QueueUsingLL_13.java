package Chapter_18;

import Chapter_17.Node_3;

public class QueueUsingLL_13<T> {
	
	// all functions are O(1)
	private Node_3<T> front;
	private Node_3<T> rear;
	int size;
	
	public QueueUsingLL_13() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(T elem) {
		Node_3<T> newNode = new Node_3<>(elem);
		size++;
		if(rear == null) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public T front() throws QueueEmptyException_10 {
		if(front == null) {
			throw new QueueEmptyException_10();
		}
		return front.data;
	}
	
	public T dequeue() throws QueueEmptyException_10 {
		if(front == null) {
			throw new QueueEmptyException_10();
		}
		T temp = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		size--;
		return temp;
	}
}

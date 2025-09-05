package Chapter_18;

public class QueueUsingArray_8 {

	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public QueueUsingArray_8() {
		data = new int[5];
		front = -1;
		rear = -1;
	}
	
	public QueueUsingArray_8(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
	}
	
	public int size() {
		return size;// o(n)
	}
	
	public boolean isEmpty() {
		return size == 0;// o(n)
	}
	
	public void enqueue(int elem) throws QueueFullException_11 {
		if(size == data.length) {
			throw new QueueFullException_11();
		}
		if(size == 0) {
			front = 0;
		}
		//rear++;
//		if(rear == data.length) { // circular queue code
//			rear = 0;
//		}
		rear = (rear + 1)%data.length;// formula for above code
		data[rear] = elem;
		size++;
	}// o(n)
	
	public int front() throws QueueEmptyException_10 {
		if(size == 0) {
			throw new QueueEmptyException_10();
		}
		return data[front];// o(n)
	}
	
	public int dequeue() throws QueueEmptyException_10 {
		if(size == 0) {
			throw new QueueEmptyException_10();
		}
		int temp = data[front];
//		front++;
//		if(front == data.length) { // circular queue code 
//			front = 0;
//		}
		front = (front + 1) % data.length; // formula for above code
		size--;
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		return temp;// o(n)
	}
	
}

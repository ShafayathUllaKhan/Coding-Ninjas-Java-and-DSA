package Chapter_18;

public class StackUsingArray_1 {

	private int data[];
	private int topIndex;
	public StackUsingArray_1() {
		data = new int[10];
		topIndex = -1;
	}
	
	public StackUsingArray_1(int size) {
		data = new int[10];
		topIndex = -1;
	}
	
	public void push(int elem) throws StackfullException_3 {
		if(topIndex == data.length - 1) {
//			StackfullException_3 e = new StackfullException_3();
//			throw e;
			doubleCapacity();
			
		}
		data[++topIndex] = elem;
	}
	
	private void doubleCapacity() {
		// TODO Auto-generated method stub
		int temp[] = data;
		data = new int[2 * temp.length];
		for(int i=1;i<temp.length;i++) {
			data[i] = temp[i];
		}
		
	}

	public boolean isEmpty() {
		return topIndex == -1;
	}
	
	public int size() {
		return topIndex + 1;
	}
	
	public int top() throws StackemptyException_4 {
		if(topIndex == -1) {
			throw new StackemptyException_4();
		}
		return data[topIndex];
	}
	
	public int pop() throws StackemptyException_4 {
		if(topIndex == -1) {
			throw new StackemptyException_4();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
	}
}

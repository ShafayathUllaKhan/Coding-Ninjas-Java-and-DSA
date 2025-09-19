package Chapter_21;

import java.util.ArrayList;

public class Priority_Queue_7<T> {

	private ArrayList<Element_8<T>> heap;
	
	public Priority_Queue_7() {
		heap = new ArrayList<>();
	}
	
	public void insert(T value,int priority) {
		Element_8<T> e = new Element_8<>(value,priority);
		heap.add(e);
		int childIndex = heap.size()-1;
		int parentIndex = (childIndex - 1)/2;
		
		while(childIndex > 0) {
			if(heap.get(childIndex).priority < heap.get(parentIndex).priority) {
				Element_8<T> temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex-1)/2;
			}else {
				return;
			}
		}
	}
	
	public T getMin() throws PriorityQueueException_9 {
		if(isEmpty()) {
			throw new PriorityQueueException_9();
		}
		return heap.get(0).value;
	}
	
	public T removeMin() throws PriorityQueueException_9{
		if(isEmpty()) {
			throw new PriorityQueueException_9();
		}
		Element_8<T> removed = heap.get(0);
		T ans = removed.value;
		
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int parentIndex = 0;
		int leftChildIndex = 2*parentIndex+1;
		int rightChildIndex = 2*parentIndex+2;
		
		while(leftChildIndex < heap.size()) {
			int minIndex = parentIndex;
			if(heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
				minIndex = leftChildIndex;
			}
			
			if(rightChildIndex < heap.size()&& (heap.get(rightChildIndex).priority < heap.get(minIndex).priority)) {
				minIndex = rightChildIndex;
			}
			
			if(minIndex == parentIndex) {
				break;
			}
			
			Element_8<T> temp = heap.get(minIndex);
			heap.set(minIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);
			parentIndex = minIndex;
			leftChildIndex = 2*parentIndex + 1;
			rightChildIndex = 2*parentIndex + 2;
		}
		return ans;
	}
	
	public int size() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}
		return false;
	}
}

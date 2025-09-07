package Chapter_18;

public class QueueUse_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray_8 queue = new QueueUsingArray_8();
		QueueUsingLL_13<Integer> queue_ll = new QueueUsingLL_13<>();
		int arr[] = {10,20,30,40,50,60,70};
		for(int elem : arr) {
			//try {
				queue.enqueue(elem);
				queue_ll.enqueue(elem);
			//} catch (QueueFullException_11 e) {
				
			//}
		}
		
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException_10 e) {
				
			}
		}
		
		while(!queue_ll.isEmpty()) {
			try {
				System.out.println(queue_ll.dequeue());
			} catch (QueueEmptyException_10 e) {
				
			}
		}
	}

}

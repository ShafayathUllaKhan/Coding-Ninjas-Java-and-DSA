package Chapter_18;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new LinkedList<Integer>();// Queue is a interface you cannot create a object of interface
		queue.add(10);
		queue.add(20);
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.size());
	}

}

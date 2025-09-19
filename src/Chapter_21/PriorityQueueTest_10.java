package Chapter_21;

public class PriorityQueueTest_10 {

	public static void main(String[] args) throws PriorityQueueException_9 {
		// TODO Auto-generated method stub
		// minimum Priority_Queue try maximum
		Priority_Queue_7<String> pq = new Priority_Queue_7<String>();
		pq.insert("abc", 15);
		pq.insert("def", 13);
		pq.insert("fsas", 90);
		pq.insert("fsafsafa", 150);
		pq.insert("xvzxsaed", 120);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.getMin());
			pq.removeMin();
		}
	}
	

}

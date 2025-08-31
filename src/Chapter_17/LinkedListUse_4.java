package Chapter_17;

public class LinkedListUse_4 {
	
	public static Node_3<Integer> createLinkedList(){
		Node_3<Integer> n1 = new Node_3<>(10);
		Node_3<Integer> n2 = new Node_3<>(20);
		Node_3<Integer> n3 = new Node_3<>(30);
		Node_3<Integer> n4 = new Node_3<>(40);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
		
	}
	
	public static void print(Node_3<Integer> head) {
		Node_3<Integer> temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Node_3<Integer> n1 = new Node_3<Integer>(10);
//		System.out.println(n1.next);
		
		Node_3<Integer> head = createLinkedList();
		print(head);
	}

}

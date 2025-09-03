package Chapter_17;

import java.util.Scanner;

class DoubleNode{
	Node_3<Integer> head;
	Node_3<Integer> tail;
	DoubleNode(){
		
	}
	DoubleNode(Node_3<Integer> head, Node_3<Integer> tail){
		this.head = head;
		this.tail = tail;
	}
}

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
			System.out.print(temp.data+" ");
			temp = temp.next;
			
		}
	}
	
	public static void increment(Node_3<Integer> head) {
		Node_3<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}
	
	public static int length(Node_3<Integer> head) {
		Node_3<Integer> temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		return count;
	}
	
	public static Node_3<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node_3<Integer> head = null;
		while(data != -1) {
			Node_3<Integer> currentNode = new Node_3<Integer>(data);
			if(head==null) {
				head = currentNode;
			}else {
				Node_3<Integer> tail = head;
				while(tail.next != null) {
					tail = tail.next;
				}
				tail.next = currentNode;// O(nsqaure)
			}
			data = s.nextInt();
		}
		return head;
		
	}
	
	public static Node_3<Integer> takeInputBetter() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node_3<Integer> head = null,tail = null;
		while(data != -1) {
			Node_3<Integer> currentNode = new Node_3<Integer>(data);
			if(head==null) {
				head = currentNode;
				tail = currentNode;
			}else {
				tail.next = currentNode;
				tail = currentNode;// O(n)
			}
			data = s.nextInt();
		}
		return head;
		
	}
	
	public static Node_3<Integer> insert(Node_3<Integer> head,int elem,int pos) {
		Node_3<Integer> nodeToBeInserted = new Node_3<Integer>(elem);
		
		if(pos == 0) {
			nodeToBeInserted.next = head;
			head = nodeToBeInserted;
		}else {
			int count = 0;
			Node_3<Integer> prev = head;
			while(count<pos -1 && prev != null) {
				count++;
				prev = prev.next;		}
			if(prev != null) {
				nodeToBeInserted.next = prev.next;
				prev.next = nodeToBeInserted;
			}
		}
		return head;
	}
	
	public static void printR(Node_3<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printR(head.next);
	}
	
	public static void printreverseR(Node_3<Integer> head) {
		if(head == null) {
			return;
		}
		printR(head.next);
		System.out.print(head.data + " ");
		
	}
	
	public static Node_3<Integer> insertR(Node_3<Integer> head,int elem, int pos){
		if(head == null && pos >0) {
			return head;
		}
		if(pos == 0) {
			Node_3<Integer>newNode = new Node_3<>(elem);
			newNode.next = head;
			return newNode;
		}else {
			head.next = insertR(head.next,elem,pos-1);
			return head;
		}
	}
	
	public static Node_3<Integer> reverseR(Node_3<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node_3<Integer> smallHead = reverseR(head.next);
		Node_3<Integer> tail = smallHead;
		while(tail.next != null) {
			tail = tail.next;
		}
		tail.next = head;
		head.next = null;
		return smallHead;// O(nsquaure)
	}
	
	public static DoubleNode reverseRBetter(Node_3<Integer> head) {
		DoubleNode ans;
		if(head == null || head.next == null) {
			ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		DoubleNode smallAns = reverseRBetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;// O(n)
	}
	
	public static Node_3<Integer> reverseRBetter1(Node_3<Integer> head) {
		DoubleNode ans = reverseRBetter(head);
		return ans.head;
	}
	
	public static Node_3<Integer> reverseRBest(Node_3<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node_3<Integer> smallHead = reverseRBest(head.next);
		Node_3<Integer> reversedTail = head.next;
		reversedTail.next = head;
		head.next = null;
		return smallHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Node_3<Integer> n1 = new Node_3<Integer>(10);
//		System.out.println(n1.next);
		
		Node_3<Integer> head = createLinkedList();
		increment(head);
		head = insert(head,80,4);
		print(head);
		System.out.println(length(head));
	}

}

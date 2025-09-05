package Chapter_17;

import java.util.LinkedList;

public class Collections_Linked_List_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,100);// add at pos 1
		list.addFirst(80);// add at begining
		list.addLast(70);// add at last
		list.set(0, 60);// replace value at 0
		list.remove();// remove first element
		System.out.println(list.get(1));// gives value at pos 1
		System.out.println(list.size());// gives you number of elements
		//stack is an adt
	}
}

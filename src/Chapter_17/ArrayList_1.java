package Chapter_17;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<>(20);// default is 10
		arr.add(10);// previous capacity is full then it increases by 1.5 capacity for example array is 10 then increases to 15
		
		arr.add(20);
		arr.add(30);
		arr.add(1,80);
		arr.set(0, 100);
		arr.remove(2);// remove the element and move to left 
		Integer j = 10;
		arr.remove(j);
		System.out.println(arr.size());
		System.out.println(arr.get(1));
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		// Enhanced for loop - for each loop
		for(int k : arr) {
			System.out.println(k);
		}
		
	}

}

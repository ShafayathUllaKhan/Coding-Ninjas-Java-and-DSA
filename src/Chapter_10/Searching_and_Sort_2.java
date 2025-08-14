package Chapter_10;

import java.util.Scanner;

public class Searching_and_Sort_2 {
	
	public static int binarysearch(int a[],int n) {
		int low = 0;
		int end = a.length-1;
		int mid = 0;
		while(low<=end) {
			mid = low + (end-low)/2;
			if(a[mid] == n) {
				return mid;
			}else if(a[mid]<n) {
				low = mid + 1;
			}else if(a[mid]>n) {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Binary Search and the array should be sorted
		
		int a[] = {1, 2, 5, 7, 12, 33, 34, 54, 78, 87, 90};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched: ");
		int n = sc.nextInt();
	 
		System.out.println(binarysearch(a,n));
	}

}

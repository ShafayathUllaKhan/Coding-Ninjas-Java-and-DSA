package Chapter_10;

import java.util.Scanner;

public class Searching_and_Sort_1 {
	
	public static int search(int a[],int n) {
		for(int i=0;i<a.length;i++) {
			if(n == a[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// linear search
		int a[] = {5,7,1,2,33,90,87,54,12,34,78};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched: ");
		int n = sc.nextInt();
		System.out.println(search(a,n));
		
	}

}

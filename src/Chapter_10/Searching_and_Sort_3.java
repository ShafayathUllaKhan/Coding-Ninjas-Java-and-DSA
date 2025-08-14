package Chapter_10;

public class Searching_and_Sort_3 {
	
	public static void bubbleSort(int a[]) {
		for(int i=0;i< a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.print("Bubble Sort:- ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void selectionSort(int a[]) {
		
		for(int i=0;i< a.length-1;i++) {
			int smallest = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[smallest]) {
					smallest = j;
				}
			}
			int temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
		}
		System.out.println();
		System.out.print("Selection Sort:- ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void insertionSort(int a[]) {
		for(int i=1;i< a.length;i++) {
			int current = a[i];
			int prev = i-1;
			while(prev >=0 && current < a[prev] ) {
				a[prev + 1] = a[prev];
				prev--;
			}
			a[prev + 1] = current;
		}
		System.out.println();
		System.out.print("Insertion Sort:- ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {32,15,34,23,12,19};
		
		bubbleSort(a);// works well with small array 
		selectionSort(a); // this is not stable bubble sort and insertion sort is stable same value will be same but in selection sort it will change
		insertionSort(a);
	}

}

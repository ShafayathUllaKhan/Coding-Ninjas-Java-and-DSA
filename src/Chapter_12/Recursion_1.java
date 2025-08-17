package Chapter_12;

public class Recursion_1 {
	
	public static String replaceChar(String s, char a,char b) {
		if(s.length() == 0) {
			return s;
		}
		String smallOutput = replaceChar(s.substring(1),a,b);
		if(s.charAt(0) == a) {
			return b + smallOutput;
		}else {
			return s.charAt(0) + smallOutput;
		}
	}
	
	public static String replacePi(String s) {
		if(s.length() <= 1) {
			return s;
		}
		if(s.charAt(0)== 'p' && s.charAt(1)=='i') {
			String smallOutput = replacePi(s.substring(2));
			return "3.14" + smallOutput;
		}else {
			String smallOutput = replacePi(s.substring(1));
			return s.charAt(0) + smallOutput;
		}
		
	}

	public static int BinarySearch(int[] a,int b,int si,int ei) {
		if(si> ei) {
			return -1;
		}
		int mid = (si+ei) / 2;
		if(a[mid] == b) {
			return mid;
		}else if(a[mid]<b) {
			return BinarySearch(a,b,mid+1,ei);
		}
			return BinarySearch(a,b,si,mid-1);
		
		
	}
	
	public static void merge(int[] s1,int[] s2,int[] a) {
		int i = 0;
		int j= 0;
		int k = 0;
		while(i < s1.length && j < s2.length) {
			if(s1[i] < s2[j]) {
				a[k] = s1[i];
				i++;
				k++;
			}else {
				a[k] = s2[j];
				j++;
				k++;
			}
		}
		while(i < s1.length) {
			a[k] = s1[i];
			i++;
			k++;
		}
		
		while(j < s2.length) {
			a[k] = s2[j];
			j++;
			k++;
		}
	}
	
	public static void MergeSort(int[] a) {
		if(a.length <= 1) {
			return;
		}
		int b[] = new int[a.length / 2];
		int c[] = new int[a.length - b.length];
		
		for(int i=0;i<a.length/2;i++) {
			b[i] = a[i];
		}
		
		for(int i=a.length/2;i<a.length;i++) {
			c[i - a.length/2] = a[i];
		}
		MergeSort(b);
		MergeSort(c);
		merge(b,c,a);
		
	}
	
	public static int partition(int a[],int si,int ei) {
		int pivot = ei;
		int idx = si-1;
		for(int i=si;i<ei;i++) {
			if(a[i]<a[pivot]) {
				idx++;
				int temp = a[idx];
				a[idx] = a[i];
				a[i] = temp;
			}
		}
		idx++;
		int temp = a[idx];
		a[idx] = a[pivot];
		a[pivot] = temp;
		return idx;
	}
	
	public static void QuickSort(int[] a,int si,int ei) {
		if(a.length <= 1) {
			return;
		}
		
		if(si<ei) {
			int pivot = partition(a,si,ei);
			QuickSort(a,si,pivot-1);
			QuickSort(a,pivot+1,ei);
		}
		
	}
	
	// coding ninjas quicksort
	
	public static int partition_codingninjas(int a[],int si,int ei){
        int pivotElement=a[si];
        int smallerNumCount=0;
        for(int i=si+1;i<=ei;i++){
            if(a[i]<pivotElement){
                smallerNumCount++;
            }
        }
        int temp=a[si+smallerNumCount];
        a[si+smallerNumCount]=pivotElement;
        a[si]=temp;
        int i=si;
        int j=ei;
        while(i<j){
            if(a[i]<pivotElement){
                i++;
            }else if(a[j]>=pivotElement){
                j--;
            }else{
                 temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        return si+smallerNumCount;
    }
    public static void quickSort_codingninjas(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotIndex=partition(a,si,ei);
        quickSort_codingninjas(a,si,pivotIndex-1);
        quickSort_codingninjas(a,pivotIndex+1,ei);
    }
    
    public static void towerHanoi(int n,char s,char h,char d) {
    	if(n==1) {
    		System.out.println("move 1st disk from " + s + " to " + d);
    		return;
    	}
    	towerHanoi(n-1,s,d,h);
    	System.out.println("move "+ n + "th disk from "+ s + " to "+ d);
    	towerHanoi(n-1,h,s,d);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		char b = 'b';
		int array[] = new int[]{1,4,3,2};
		int mergearray[] = {4,2,1,6};
		System.out.println(replaceChar("aa",a,b));
		System.out.println(replacePi("aapi"));
		System.out.println(BinarySearch(array,4,0,3));
		MergeSort(array);
		for(int i =0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		QuickSort(mergearray,0,mergearray.length-1);
		for(int i =0;i<mergearray.length;i++) {
			System.out.print(mergearray[i]);
		}
	}

}

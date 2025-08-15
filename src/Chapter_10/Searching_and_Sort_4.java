package Chapter_10;

public class Searching_and_Sort_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Merging sorted arrays
		
		int a[] = {1,3,5,9,13,23};
		int b[] = {2,4,6,8};
		int c[] = new int[a.length+b.length];
		int i=0,j=0,k=0;
		for(;i<a.length&&j<b.length;) {
			if(a[i]<b[j]) {
				c[k] = a[i];
				i++;
				k++;
			}else {
				c[k] = b[j];
				j++;
				k++;
			}
			
		}
		while(i<a.length) {
			c[k] = a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			c[k] = b[j];
			j++;
			k++;
		}
		
		for(int s=0;s< c.length;s++) {
			System.out.print(c[s] + " ");// here if you give i it will give error java does not support shodowing but js supports
		}
	}

}

package Chapter_9;

public class Dimensional_Array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// spiral matrix 
//		int a[][] = {
//				{1,2,3,4},
//				{5,6,7,8},
//				//{9,10,11,12},{13,14,15,16}
//		};
		
		int a[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		int left = 0;int top = 0;int right = a[0].length-1;int bottom = a.length-1;
		
		while(top<=bottom && left<=right) {
			for(int i=left;i<=right;i++) {
				System.out.print(a[top][i]+" ");
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				System.out.print(a[i][right]+" ");
			}
			right--;
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					System.out.print(a[bottom][i]+" ");
				}
				bottom--;
			}
			if(left <= right) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(a[i][left]+" ");
				}
				left++;
			}
			
		}
		
		
		
	}

}

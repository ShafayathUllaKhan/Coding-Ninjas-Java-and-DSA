package Chapter_18;

public class StackUse_2 {

	public static void main(String[] args) throws StackfullException_3, StackemptyException_4 {
		// TODO Auto-generated method stub
		StackUsingArray_1 stack = new StackUsingArray_1();
		stack.push(10);
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		
		// Stack using ll
		StackUsingLL_5 stackll = new StackUsingLL_5();
		int arr[] = {5,6,7,1,9};
		for(int i=0;i<arr.length;i++) {
			stackll.push(arr[i]);
		}
		
		while(!stackll.isEmpty()) {
			System.out.println(stackll.pop());
		}
	}

}

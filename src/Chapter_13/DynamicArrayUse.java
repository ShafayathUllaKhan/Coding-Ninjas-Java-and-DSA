package Chapter_13;

public class DynamicArrayUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray d = new DynamicArray();
		
		for(int i=0;i<100;i++) {
			d.add(100+i);
		}
		System.out.println(d.size());
		d.set(2, 170);
		
		System.out.println(d.get(2));
		
		while(!d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println("Size - " + d.size());
		}
		
		
		
	}

}

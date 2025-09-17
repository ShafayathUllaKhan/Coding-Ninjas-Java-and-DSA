package Chapter_21;

public class MapUse_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map_5<String,Integer> map = new Map_5<>();
		for(int i=0;i<20;i++) {
			map.insert("abc"+i,i+1);
			System.out.println(map.loadFactor());
		}
		map.removeKey("abc3");
		map.removeKey("abc7");
		for(int i=0;i<20;i++) {
			System.out.println("abc"+i+":"+map.getValue("abc"+i));
		}
	}

}

package Chapter_22;

public class TrieUse_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trie_1 t = new Trie_1();
		t.add("NOTE");
		t.add("AND");
		System.out.println(t.search("AND"));
		t.remove("AND");
		System.out.println(t.search("AND"));
	}

}

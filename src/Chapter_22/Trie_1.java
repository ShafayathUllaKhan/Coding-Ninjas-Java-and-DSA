package Chapter_22;

class TrieNode{
	char data;
	boolean isTerminal;
	TrieNode children[];
	int childCount;
	
	public TrieNode(char data) {
		this.data = data;
		this.isTerminal = false;
		this.children = new TrieNode[26];
		this.childCount = 0;
	}
}
public class Trie_1 {

	private TrieNode root;
	
	public Trie_1() {
		root = new TrieNode('\0');
	}
	
	private void addHelper(TrieNode root,String word) {
		if(word.length() == 0) {
			root.isTerminal = true;
			return;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		
		addHelper(child,word.substring(1));
	}
	
	public void add(String word) {
		addHelper(root,word);
	}
	
	private boolean searchHelper(TrieNode root,String word) {
		if(word.length()==0) {
			return root.isTerminal;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return false;
		}
		return searchHelper(child , word.substring(1));
	}
	
	public boolean search(String word) {
		return searchHelper(root,word);
	}
	
	public void removeHelper(TrieNode root,String word) {
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return;
		}
		
		removeHelper(child,word.substring(1));
	}
	
	public void removeHelperBetter(TrieNode root,String word) {
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return;
		}
		
		removeHelperBetter(child,word.substring(1));
		if(!child.isTerminal && child.childCount == 0) {
			root.children[childIndex] = null;
			root.childCount--;
		}
	}
	
	public void remove(String word) {
		removeHelper(root,word);
		removeHelperBetter(root,word);
	}
}

// compressed tries

// pattern matching
// suffix tries
// l le ple mple ample sample
// prefix tries
// s sa sam sampl sample

// suffix tries + compressed tries

// huffman coding is text compression algorithm


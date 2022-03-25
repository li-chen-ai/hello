package hello;

import java.util.ArrayList;

public class Num208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Trie {
	
	ArrayList<String> s = new ArrayList<>();
	
    public Trie() {

    }
    
    public void insert(String word) {
    	s.add(word);
    }
    
    public boolean search(String word) {
    	return s.contains(word);
    }
    
    public boolean startsWith(String prefix) {
    	for(String temp : s)
    	{
    		if(temp.startsWith(prefix))
    			return true;
    	}
    	return false;
    }
}

class Trie02 {
	
	class TrieNode{
		private boolean isEnd = false;
		private TrieNode[] next= new TrieNode[26];
	}
	
	private TrieNode root;
	
    public Trie02() {
    	root = new TrieNode();
    }
    
    public void insert(String word) {
    	TrieNode node = root;
    	for(char c : word.toCharArray())
    	{
    		if(node.next[c-'a']==null)
    		{
    			node.next[c-'a'] = new TrieNode(); 
    		}
    		node = node.next[c-'a'];
    	}
    	node.isEnd = true;
    }
    
    public boolean search(String word) {
    	TrieNode node = root;
    	for(char c: word.toCharArray())
    	{
    		node = node.next[c-'a'];
    		if(node==null)
    			return false;
    	}
    	return root.isEnd;
    }
    
    public boolean startsWith(String prefix) {
    	TrieNode node = root;
    	for(char c:prefix.toCharArray())
    	{
    		node = node.next[c-'a'];
    		if(node==null)
    			return false;
    	}
    	return true;
    }
}
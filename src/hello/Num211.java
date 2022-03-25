package hello;

import java.util.ArrayList;
import java.util.HashMap;

public class Num211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordDictionary wordDictionary = new WordDictionary();
//		wordDictionary.addWord("a");
//		wordDictionary.addWord("a");
//		System.out.println(wordDictionary.search(".")); // return False
//		System.out.println(wordDictionary.search("a")); // return True
//		System.out.println(wordDictionary.search("aa")); // return True
//		System.out.println(wordDictionary.search("a")); // return True
//		System.out.println(wordDictionary.search(".a")); // return True
//		System.out.println(wordDictionary.search("a.")); // return True
		System.out.println(wordDictionary.search("a.")); // return True

	}

}

class WordDictionary {
    class wordNode
    {
    	boolean isEnd = false;
    	wordNode[] next = new wordNode[26];
    }
    
    private wordNode root;
    
    public WordDictionary() {
    	root = new wordNode();
    }
    
    public void addWord(String word) {
    	wordNode node = root;
    	for(char c: word.toCharArray())
    	{
    		if(node.next[c-'a']==null)
    			node.next[c-'a'] = new wordNode();
    		node = node.next[c-'a'];
    	}
    	node.isEnd = true;
    }
    
    public boolean search(String word) {
    	return dfs(word, root, 0);
    }
    
    public boolean dfs(String word, wordNode node, int sIdx)
    {
    	if(sIdx == word.length()) return node.isEnd;
    	if(word.charAt(sIdx) == '.')
    	{
        	for(int i = 0; i<26; i++)
    		{
    			if(node.next[i]!=null && dfs(word, node.next[i], sIdx+1))
    				return true;
    		}		
        	return false;
    	}			
    	else
    	{
    		if(node.next[word.charAt(sIdx)-'a'] == null)
    			return false;
    		else
    			return dfs(word, node.next[word.charAt(sIdx)-'a'], sIdx+1);
    	}
    }
}
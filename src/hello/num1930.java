package hello;

import java.util.HashSet;
import java.util.Set;

public class num1930 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPalindromicSubsequence("aabca"));
	}
	
    public static int countPalindromicSubsequence(String s) {
    	int count = 0;
    	Set<Character> set = new HashSet<>();
    	for(int i = 0;i<26;i++)
    	{
    		int begin=0,end=s.length()-1;
    		while(begin<s.length()-1 && (s.charAt(begin)-'a')!=i)
    		{
    			begin++;
    		}
    		while(end>=0 && (s.charAt(end)-'a')!=i)
    		{
    			end--;
    		}
    		if(end -begin <2) continue;
    		for(int j = begin+1;j<end;j++)
    		{
    			set.add(s.charAt(j));    			
    		}
    		count += set.size();
    		set.clear();
    	}
    	return count;
    }

}

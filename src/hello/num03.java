package hello;

import java.util.HashSet;
import java.util.Set;

public class num03 {
	
	public static void main(String[] args) {
//		aab
//		pwwkew
//		abcabcbb
		lengthOfLongestSubstring("pwwkew");
	}
	
    public static void lengthOfLongestSubstring(String s) {
    	char[] chars = s.toCharArray();
    	Set<Character> set = new HashSet<>();
    	int count = 0, i, j = 0;
    	char same = chars[0];
    	for(i = 0;i<s.length();) 
    	{
    		if(chars[i]==same || i == j)
    		{
	    		for(;j<s.length();j++)
	    		{
	    			if(set.contains(chars[j]))
	    			{
	    				same = chars[j];
	    				break;
	    			}
	    			{
	    				set.add(chars[j]);
	    			}		
	    		}
	    		if(j - i> count)
	    		{
	    			count  = j - i;
	    		}
	    		j++;
	    		i++;
    		}
    		else
    		{
    			set.remove(chars[i]);
    			i++;
    		}
    	}
    	System.out.println(count);
    }
    
}

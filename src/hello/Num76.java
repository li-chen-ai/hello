package hello;

import java.util.HashMap;
import java.util.Map;

public class Num76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minWindow(new String("ADOBECODEBANC"), new String("ABC")));
	}
	
    public static String minWindow(String s, String t) {
    	int start=0, end=0;
    	int[] ret = new int[] {-1, s.length()};
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	for(int i=0; i<t.length(); i++)
    		map.put(t.charAt(i), -1);
    	for(int i=0; i<s.length(); i++)
    	{
    		if(map.containsKey(s.charAt(i))) 
    		{
    			if(map.get(s.charAt(i))==-1)
    			{
    				map.put(s.charAt(i), i);
    			}

    			if(isok(map) == true)
    			{
    				end = i;
    				for(int j=start; j<i; j++)
    				{
    					if(map.containsKey(s.charAt(j)))
    					{
    						map.put(s.charAt(j), j);
    						if(isok(map))
    						{
    							start = j;
    						}
    					}
    				}
    				if(ret[1] - ret[0] > end - start)
    				{
    					ret[0] = start;
    					ret[1] = end;
    				}
    			}
    
    		}
    	}
    	return s.substring(ret[0],  ret[1]+1);
    }
    
    public static boolean isok(HashMap<Character, Integer> map)
    {
		for(char temp : map.keySet())
		{
			if(map.get(temp)==-1)
			{
				return false;
			}			
		}
		return true;
    }

}

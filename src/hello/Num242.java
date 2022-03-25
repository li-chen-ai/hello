package hello;

import java.util.HashMap;
import java.util.HashSet;

public class Num242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        char[] schar = s.toCharArray();
        for(char temp :schar)
        {
            if(!map1.containsKey(temp))
                map1.put(temp, 1);
            else
                map1.put(temp, map1.get(temp) + 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        char[] tchar = t.toCharArray();
        for(char temp :tchar)
        {
            if(!map2.containsKey(temp))
                map2.put(temp, 1);
            else
            	map2.put(temp, map2.get(temp) + 1);
        }
        if(map1.size() != map2.size())  return false;
        for(char temp : map1.keySet())
        {
            if(map1.get(temp) != map2.get(temp))
                return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int a: set) {
        	
        }
        return true;
    }

}

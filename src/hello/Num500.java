package hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static String[] findWords(String[] words) {
        Map<Character, Integer> map=new HashMap<>();
        map.put('q', 1);
        map.put('w', 1);
        map.put('e', 1);
        map.put('r', 1);
        map.put('t', 1);
        map.put('y', 1);
        map.put('u', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('p', 1);
        map.put('a', 2);
        map.put('s', 2);
        map.put('d', 2);
        map.put('f', 2);
        map.put('g', 2);
        map.put('h', 2);
        map.put('j', 2);
        map.put('k', 2);
        map.put('l', 2);
        map.put('z', 3);
        map.put('x', 3);
        map.put('c', 3);
        map.put('v', 3);
        map.put('b', 3);
        map.put('n', 3);
        map.put('m', 3);
        List<String> list=new ArrayList<>();
        for(String temp:words)
        {
        	char[] a = temp.toLowerCase().toCharArray();
        	for(int i=0;i<a.length-1;i++)
        	{
        		if(map.get(a[i])!=map.get(a[i+1]))
        			continue;
        	}
        	list.add(temp);
        }
        String[] ret=new String[list.size()];
        for(int i=0;i<list.size();i++)
        	ret[i]=list.get(i);
        return ret;
    }

}

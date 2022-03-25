package hello;

import java.util.HashMap;

public class Num13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "MCMXCIV";
		System.out.println(romanToInt(a));
	}
	
    public static int romanToInt(String s) {
    	HashMap<Character, Integer> map = new HashMap<>();
    	map.put('I', 1);
    	map.put('V', 5);
    	map.put('X', 10);
    	map.put('L', 50);
    	map.put('C', 100);
    	map.put('D', 500);
    	map.put('M', 1000);
    	int num=0;
    	for(int i = 0;i<s.length()-1;i++)
    	{
    		if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
    			num = num - map.get(s.charAt(i));
    		else
    			num+=map.get(s.charAt(i));
    	}
    	num += map.get(s.charAt(s.length()-1));
    	return num;
    }

}

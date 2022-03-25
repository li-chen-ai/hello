package hello;

import java.util.HashSet;
import java.util.Set;

public class Num260 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ret =singleNumber(new int[] {0,1});
		for(int temp:ret)
			System.out.println(temp);
	}
	
    public static int[] singleNumber(int[] nums) {
    	Set<Integer> set= new HashSet<>();
    	for(int temp:nums)
    	{
    		if(set.contains(temp))
    			set.remove(temp);
    		else
    			set.add(temp);
    	}
    	int[] ret=new int[set.size()];
    	int i=0;
    	for(int temp:set)
    		ret[i++]=temp;
    	return ret;
    }

}

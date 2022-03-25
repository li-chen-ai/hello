package hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Num229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		majorityElement(new int[] {2,1,1,3,1,4,5,6});
	}
	
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        int first = 0, second = 0, firstnum = 0, secondnum = 0, firstcount=0, secondcount=0;
        for(int i = 0; i<nums.length; i++)
        {
        	if(first==nums[i])
        	{
        		firstnum++;
        	}else if(second == nums[i])
        	{
        		secondnum++;
        	}else if(firstnum == 0)
        	{
        		first = nums[i];
        		firstnum++;
        	}else if(secondnum == 0)
        	{
        		second = nums[i];
        		secondnum++;
        	}else {
        		firstnum--;
        		secondnum--;
        	}
        	System.out.println(first+""+firstnum+""+second+""+secondnum);
        }
        
        for(int i = 0; i<nums.length; i++)
        {
        	if(first == nums[i])
        		firstcount++;
        	else if(second == nums[i])
        		secondcount++;
        }
        if(firstcount > nums.length/3)
        	ret.add(first);
        if(secondcount > nums.length/3)
        	ret.add(second);
        return ret;
    }

}

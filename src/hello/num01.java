package hello;

import java.util.HashMap;

public class num01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,3};
		int target = 6;
		twoSum(nums, target);
	}
	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> nummap = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(!nummap.containsKey(nums[i]))
				nummap.put(nums[i], i);
			if(nummap.containsKey(target-nums[i]) && nummap.get(target-nums[i])!=i)
			{
				System.out.println(nummap.get(target-nums[i])+" "+i);
				return new int[]{nummap.get(target-nums[i]),i};
			}
		}
		return new int[] {1,1};
	}

}

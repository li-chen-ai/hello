package hello;

public class Num209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minSubArrayLen(4, new int[] {1,4,4}));
	}
	
    public static int minSubArrayLen(int target, int[] nums) {
        int ret = nums.length+1, sum=0, start = 0;
        for(int end=0;end<nums.length;end++)
        {
            sum+=nums[end];
            while(sum >= target)
            {
                ret = ret < (end-start+1) ? (end-start+1) : ret;
                sum -= nums[start++];
            }
        }
        if(ret == nums.length+1) return 0;
        return ret;
    }

}

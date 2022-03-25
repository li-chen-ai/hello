package hello;

public class Num453 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int minMoves(int[] nums) {
        int min=nums[0];
        int sum = 0;
        for(int i :nums)
        {
            sum+=i;
            if(min>i)
                min = i;
        }
        return sum-min*nums.length;
    }

}

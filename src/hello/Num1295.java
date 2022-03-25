package hello;

public class Num1295 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {12,345,2,6,7896};
		System.out.print(findNumbers(nums));
	}
	
    public static int findNumbers(int[] nums) {
    	int count = 0;
    	for(int a:nums)
    	{
    		int bit = 0;
    		while(a!=0)
    		{
    			a /= 10;
    			bit++;
    		}
    			
    		if(bit % 2 == 0)
    			count++;
    	}
    	return count;
    }

}

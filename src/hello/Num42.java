package hello;

public class Num42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trap(new int[] {0}));
	}
	
    public static int trap(int[] height) {
    	int sum=0,i=0;
    	while(height[i]==0 && i<height.length-1) i++;
    	int low = height[i];
        for(;i<height.length;i++)
        {
        	if(low<=height[i])
        		low = height[i];
        	else
        		sum += low-height[i];
        }
        if(height[height.length-1] != low)
        {
        	int high=0;
        	for(i=height.length-1;i>=0 && height[i]!=low;i--)
        	{
        		high = high> height[i]?high:height[i];
        		sum-=(low-high);
        	}
        }
        return sum;
    }

}

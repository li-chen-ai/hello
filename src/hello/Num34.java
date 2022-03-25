package hello;

public class Num34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ret=searchRange(new int[] {2,2}, 2);
		System.out.println(ret[0]+" "+ret[1]);
	}

    public static int[] searchRange(int[] nums, int target) {
    	int low=0,high=nums.length-1;
    	while(low<=high)
    	{
    		int mid=low+(high-low)/2;
    		if(nums[mid]>target) {
    			high = mid-1;
    		}else if(nums[mid]<target) {
    			low = mid+1;
    		}
    		else {
    			if(low == high)
    				return new int[]{low, high};
    			low = mid;
    			high = mid;
    			while(low>=0 && nums[low] == target) low--;
    			while(high<=nums.length-1 && nums[high] == target) high++;
    			return new int[] {low+1, high-1};
    		}
    	}
    	return new int[] {-1, -1};
    }
}

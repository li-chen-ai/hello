package hello;

public class Num540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(singleNonDuplicate(new int[] {1,1,2}));
	}

    public static int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        int low=0,high=nums.length-1;
        while(low<high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
            	return nums[mid];
            else if(nums[mid] == nums[mid+1])
            {
                if(mid % 2 == 0)
                    low = mid+2;
                else
                    high = mid-1;
            }
            else{
                if(mid % 2 == 0)
                    high = mid-2;
                else
                    low = mid+1; 
            }
        }
        return nums[low];
    }
    
    
}

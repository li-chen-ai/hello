package hello;

public class Num153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMin(new int[] {3,4,5,1,2}));
	}
	
    public static int findMin(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<high)
        {
            int mid = low +(high-low)/2;
            if(nums[mid]<nums[mid+1])
            {
                if(nums[low] > nums[mid])
                    low = mid;
                else
                    return nums[low];
            }
            else
            {
                return nums[mid+1];
            }
        }
        return nums[high];
    }
}

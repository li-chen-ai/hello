package hello;

public class Num744 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(nextGreatestLetter(new char[] {'c', 'f', 'g'}, 'g'));
	}
	
    public static char nextGreatestLetter(char[] letters, char target) {
        int low=0,high=letters.length-1,mid=0;
        while(low<=high)
        {
            mid=low+(high-mid)/2;
            if(target >= letters[mid])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return letters[low];
    }

}

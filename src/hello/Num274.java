package hello;

import java.util.Arrays;

public class Num274 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hIndex(new int[] {3,0,6,1,5}));
	}
	
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int i;
        for(i = citations.length-1;i>=0;i--)
        {
        	if(citations.length-i > citations[i])
        		break;
        }
        return citations.length-i-1;
    }

}

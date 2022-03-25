package hello;

public class Num240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]m = new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		System.out.println(searchMatrix(m, 5));
	}

    public static boolean searchMatrix(int[][] matrix, int target) {
//    	for(int i=matrix[0].length-1;i>=0;i--)
//    	{
//    		for(int j=0;j<matrix.length;j++)
//    		{
//    			if(matrix[j][i]>target)
//    				break;
//    			if(matrix[j][i]==target)
//    				return true;
//    		}
//    	}
//    	return false;
    	int i=0,j=matrix[0].length-1;
    	while(i<matrix.length && j>=0)
    	{
    		if(matrix[i][j] == target)
    			return true;
    		else if(matrix[i][j]<target)
    			i++;
    		else
    			j--;
    	}
    	return false;
    }
}

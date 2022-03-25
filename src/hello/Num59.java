package hello;

public class Num59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateMatrix(4);
	}
	
    public static int[][] generateMatrix(int n) {  
    	
        int[][] ret = new int[n][n];
        int loop = 0;
        int count = 1;
        int i=0, j=0;
        
        while(loop < (n+1)/2)
        {
        	for(j = loop; j < n-loop; j++)
        	{
        		ret[i][j] = count++;
        	}
        	j--;
        	
        	for(i = loop+1; i < n-loop; i++)
        	{
        		ret[i][j] = count++;
        	}
        	i--;
        	
        	for(j = j-1; j >= loop; j--)
        	{
        		ret[i][j] = count++;
        	}
        	j++;
        	
        	for(i = i-1; i > loop; i--)
        	{
        		ret[i][j] = count++;
        	}
        	i++;
        	
        	loop++;
        	
        }
        
        for(i=0;i<n;i++)
        	for(j=0;j<n;j++)
        		System.out.println(ret[i][j]+" ");
        
        return ret;
    }

}

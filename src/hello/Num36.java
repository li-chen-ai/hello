package hello;

import java.util.HashSet;
import java.util.Set;

public class Num36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isValidSudoku(char[][] board) {
    	Set<Integer> set=new HashSet<>();
    	for(int i=0;i<board.length;i++)
    	{
    		for(int j=0;j<board[0].length;j++)
    		{
    			if(set.contains(board[i][j]-'0') && board[i][j]>='0' && board[i][j]<='9')
    				return false;
    			else
    				set.add((board[i][j]-'0'));
    		}
    		set.clear();
    	}
    	for(int i=0;i<board.length;i++)
    	{
    		for(int j=0;j<board[0].length;j++)
    		{
    			if(set.contains(board[j][i]-'0') && board[j][i]>='0' && board[j][i]<='9')
    				return false;
    			else
    				set.add((board[j][i]-'0'));
    		}
    		set.clear();
    	}
    	for(int i=0;i<3;i++)
    		for(int j=0;j<3;j++)
    		{
    			for(int k=0;k<3;k++)
    			{
    				for(int t=0;t<3;t++)
    				{
    					if(set.contains(board[i*3+k][j*3+t]-'0') && board[i*3+k][j*3+t]>='0' && board[i*3+k][j*3+t]<='9')
    						return false;
    					else
    						set.add(board[i*3+k][j*3+t]-'0');
    				}
    			}
    			set.clear();
    		}
    		
    	return true;
    }
}

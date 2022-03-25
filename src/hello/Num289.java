package hello;

public class Num289 {

	public static void main(String[] args) {
		int[][] a = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
		gameOfLife(a);
	}
//    public static void gameOfLife(int[][] board) {
//    	int[][] temp = new int[board.length+2][board[0].length+2];
//    	for(int i = 1;i<=board.length;i++)
//    		for(int j = 1;j<=board[0].length;j++)
//    			temp[i][j] = board[i-1][j-1];
//    	for(int i = 1;i<=board.length;i++)
//    	{
//    		for(int j = 1;j<=board[0].length;j++)
//    		{
//    			int num = temp[i-1][j-1]+temp[i-1][j]+temp[i][j-1]+temp[i+1][j]+temp[i][j+1]+temp[i+1][j-1]+temp[i-1][j+1]+temp[i+1][j+1];
//    			if(num == 3)
//    				board[i-1][j-1] = 1;
//    			if(num >3 || num <2)
//    				board[i-1][j-1] = 0;
//    		}
//    	}
//    	for(int i =0;i<board.length;i++)
//        {
//            System.out.print("[");
//            for(int j=0;j<board[0].length;j++)
//            {
//                System.out.print(board[i][j]);
//            }
//            if(i!=board.length-1)
//                System.out.print("],");
//            else
//                System.out.print("]");
//        }
//    }
	public static void gameOfLife(int[][] board) {
		int[] wei = {-1, 0, 1};
		for(int i = 0;i<board.length;i++) {
			for(int j =0;j<board[0].length;j++)
			{
				int count = 0;
				for(int k = 0;k<3;k++)
					for(int l=0;l<3;l++)
					{
						if(k!=2 || k!=l)
						{
							if((i+wei[k])>-1&&(i+wei[k])<board.length&&(j+wei[l])>-1&&(j+wei[l])<board[0].length)
								count+=Math.abs(board[i+wei[k]][j+wei[l]]);
						}
					}
				if(count >3 ||count<2)
					if(board[i][j] == 1)
						board[i][j] = -1;
					else
						board[i][j] = 0;
				if(count == 3) 
					board[i][j] = 1;
			}
		}
    	for(int i =0;i<board.length;i++)
    	{
          for(int j=0;j<board[0].length;j++)
          {
              if(board[i][j] != 1)
            	  board[i][j] = 0;
          }
      }
      for(int i =0;i<board.length;i++)
      {
          System.out.print("[");
          for(int j=0;j<board[0].length;j++)
          {
              System.out.print(board[i][j]);
          }
          if(i!=board.length-1)
              System.out.print("],");
          else
              System.out.print("]");
      }
	}

}

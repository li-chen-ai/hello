package hello;

public class Num904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int totalFruit(int[] fruits) {
    	int first=-1,second=-1;
    	int firstbegin=0,secondbegin=0;
    	int firstend=0, secondend=0;
    	for(int end=0;end<fruits.length;end++)
    	{
    		if(first == fruits[end])
    		{
    			firstend = end;
    		}
    		else if(second == fruits[end])
    		{
    			secondend = end;
    		}
    		else if(first == -1)
    		{
    			first = fruits[end];
    			firstbegin = end;	
                firstend = end;	
    		}else if(second == -1)
    		{
    			second = fruits[end];
    			secondbegin = end;
                secondend = end;   			
    		}else 
    		{
    			if(firstend > secondend)
    			{
                    firstbegin = secondend;
                    second = fruits[end];
                    secondbegin = end;
                    secondend = end;
    			}
    			else
    			{
                    first = second;
                    firstbegin = secondbegin;
                    firstend = secondend;
                    second = fruits[end];
                    secondbegin = end;
                    secondend = end;
    			}
    		}
    	}
    	return secondend - firstbegin;
    }

}

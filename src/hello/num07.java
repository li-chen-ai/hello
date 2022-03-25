package hello;

public class num07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(reverse(-236469));
	}
    public static int reverse(int x) {
    	int num=0;
    	boolean flag = true;
		if(x == Integer.MIN_VALUE)
			return 0;
    	while(x!=0)
    	{
    		if(Math.abs(num) > Integer.MAX_VALUE/10)
    			return 0;
    		num = num*10+x%10;
    		x/=10;
    	}
    	return num;
    }
}

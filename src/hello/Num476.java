package hello;

public class Num476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findComplement(5));
	}
	
    public static int findComplement(int num) {
    	int ret = 0;
    	int i = 0;
    	while(num!=0)
    	{
    		if(num%2==0)
    			ret += Math.pow(2, i);
    		i++;
    		num /= 2;
    	}
    	return ret;
    }

}

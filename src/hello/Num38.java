package hello;

public class Num38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay2(5));
	}
	
    public static String countAndSay(int n) {
    	String ret = "";
    	if(n==1) return ""+1;
    	else {
    		String s = countAndSay(n-1);
    		char before = ' ';
    		int count = 1;
    		for(int i = 0;i<s.length();i++)
    		{
    			if(before == s.charAt(i))
	    			count++;
    			else {
    				count = 1;
    				before = s.charAt(i);
    			}
				if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1))
					ret = ret + count + before;
    		}
    	}
    	return ret;
    }
    
    public static String countAndSay2(int n)
    {
    	String ret = "1";
    	for(int i = 2;i<=n;i++)
    	{
    		String temp = "";
    		for(int j = 0;j<ret.length();)
    		{
    			int m = j+1;
    			while(m<ret.length() && ret.charAt(m) == ret.charAt(j)) m++;
    			temp = temp + (m-j) + ret.charAt(j);
    			j = m;
    		}
    		ret = temp;
    	}
    	return ret;
    }
}

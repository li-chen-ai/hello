package hello;

public class Num67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary(new String("1"), new String("111")));
	}
	
    public static String addBinary(String a, String b) {
        int gap = 0;
        if(a.length()<b.length())
        {
        	String temp = a;
        	a = b;
        	b =temp;
        }
        gap = a.length()-b.length();
        char[] ret=a.toCharArray();
        int push = 0;
        for(int i = b.length()-1;i>=0;i--)
        {
        	
            ret[i+gap] = (char)((push + a.charAt(i+gap) - '0' + b.charAt(i) - '0')%2+'0');
            push = (push + a.charAt(i+gap) - '0' + b.charAt(i) - '0')/2;
//            System.out.println(i+" "+t%2+" "+t+" "+push);
        }
        if(gap!=0)
        {
	         for(int j=gap-1;j>=0;j--)
	        {
	        	
	        	ret[j] = (char)((a.charAt(j)-'0'+push)%2+'0');
	        	push = (a.charAt(j)-'0'+push)/2;
//	        	System.out.println(j+" "+t%2+" "+t+" "+push);
	        }      	
        }
        if(push == 1)
        	return "1"+new String(ret);
        return new String(ret);
    }
}

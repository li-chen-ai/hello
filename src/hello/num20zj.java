package hello;

public class num20zj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isnum("0e"));
	}
	
//    public static boolean isNumber(String s) {
//    	int start = 0, end = s.length()-1;
//    	while(s.charAt(start) == ' ')
//    	{
//    		start++;
//    		if(start==s.length())
//    			return false;
//    	}
//    	while(s.charAt(end) == ' ')
//    		end--;
//    	int indexe = s.indexOf('e');
//    	int indexE = s.indexOf('E');
//    	if(indexe!=-1 && indexE!=-1)
//    		return false;
//    	else if(indexe == -1 && indexE == -1)
//    	{
//    		if(s.lastIndexOf('.')!=-1)
//    			return isxiao(s, start, end);
//    		else
//    			return iszheng(s, start, end);
//    	}
//    	else 
//    	{
//            if(indexe==0 || indexE==0)
//                return false;
//    		indexe = (indexe>indexE?indexe:indexE) + 1;
//    		if(indexe >= s.length())
//    			return false;
//    		if(s.lastIndexOf('.')!=-1)
//    			return isxiao(s, start, indexe-2)&&iszheng(s, indexe, end);
//    		else
//    			return iszheng(s, start, indexe-2)&&iszheng(s, indexe, end);
//    	}
//    }
//
//    public static boolean isxiao(String s,int start, int end) {
//		if(s.charAt(start) == '+' || s.charAt(start) == '-')
//			start++;
//		if(start == s.lastIndexOf('.') && start == end)
//			return false;
//		while(start < s.lastIndexOf('.'))
//		{
//			if(s.charAt(start)>'9'||s.charAt(start)<'0')
//				return false;
//			start++;
//		}
//		while(end > s.lastIndexOf('.'))
//		{
//			if(s.charAt(end)>'9'||s.charAt(end)<'0')
//				return false;
//			end--;
//		}
//		return true;
//    }
//    
//    public static boolean iszheng(String s,int start, int end) {
//		if(s.charAt(start) == '+' || s.charAt(start) == '-')
//			start++;
//		while(start < end)
//		{
//			if(s.charAt(start)>'9'||s.charAt(start)<'0')
//				return false;
//			start++;
//		}
//		return true;
//    }
	public static boolean isnum(String s)
	{
		boolean dot = false, e = false, num = false;
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i)<='9'&&s.charAt(i)>='0')
				num = true;
			else if(s.charAt(i)=='.'&&dot == false && e == false)
				dot = true;
			else if(s.charAt(i)=='e'||s.charAt(i)=='E' && e == false)
			{
				e = true;
				num = false;
			}
			else if((s.charAt(i)=='+'||s.charAt(i)=='-')&&(i == 0 || s.charAt(i-1)=='e' || s.charAt(i-1) == 'E'))
			{
			}
			else
				return false;
		}
		return num;
	}

}

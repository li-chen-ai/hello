package hello;

public class Num844 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(backspaceCompare(new String("ab#c"), new String("#d#c")));
	}
	
	public static boolean backspaceCompare(String s, String t) {
		char[] schar = s.toCharArray();
		char[] tchar = t.toCharArray();
		int lowpoints = s.indexOf("#") >= 1 ? s.indexOf("#") : 0;
		int lowpointt = t.indexOf("#") >= 1 ? t.indexOf("#") : 0;
		for(int i=lowpoints+1;i<s.length() && i>=0; i++)
		{
			if(schar[i]=='#')
			{
				if(lowpoints>0)
					lowpoints --;
			}			
			else
				schar[lowpoints++] = schar[i];
		}
		for(int i=lowpointt+1;i<t.length() && i>=0; i++)
		{
			if(tchar[i]=='#')
			{
				if(lowpointt>0)
					lowpointt --;
			}	
			else
				tchar[lowpointt++] = tchar[i];
		}
        return new String(schar, 0, lowpoints).equals(new String(tchar, 0, lowpointt));
    }

}

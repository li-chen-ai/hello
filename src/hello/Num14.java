package hello;

public class Num14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
	}
	
    public static String longestCommonPrefix(String[] strs) {
    	if(strs.length==1) return strs[0];
    	int locate = strs[0].length(), loop=0;
    	for(int i=1;i<strs.length;i++)
    	{
    		loop = strs[i].length() > locate?locate:strs[i].length();
    		for(locate = 0; locate<loop;locate++)
    		{
        		if(strs[0].charAt(locate) != strs[i].charAt(locate))
        			break;
    		}
    	}
    	return strs[0].substring(0, locate);
    }

}

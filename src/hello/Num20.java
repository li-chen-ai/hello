package hello;

import java.util.Stack;

public class Num20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid(new String("()[]{}")));
	}

    public static boolean isValid(String s) {
    	Stack<Character> stack = new Stack<>();
    	for(char stemp:s.toCharArray())
    	{
    		if(stemp=='('||stemp=='['||stemp=='{')
    		{
    			stack.push(stemp);
    		}
    		else if(stack.isEmpty())
                return false;
    		else if(stemp==')')
    		{
    			
    			if(stack.pop() != '(')
    				return false; 				
    		}
    		else if(stemp==']')
    		{
    			if(stack.pop() != '[')
    				return false;
    		}
    		else if(stemp=='}')
    		{
    			if(stack.pop() != '{') 
    				return false;
    		}
    	}
    	return stack.isEmpty();
    }
}

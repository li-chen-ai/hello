package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Num94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		node1.left = node2;
//		node2.left = node3;
		System.out.print(inorderTraversal(node1));
	}
	
    public static List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> ret = new ArrayList<Integer>();
    	bianli(root, ret);
    	return ret;
    }
    
    public static void bianli(TreeNode root, List<Integer> a)
    {
    	if(root!=null)
    	{
	    	bianli(root.left, a);
	    	a.add(root.val);
	    	bianli(root.right ,a);    		
    	}
    }
    
    public static void bianli02(TreeNode root, List<Integer> a)
    {
    	TreeNode p = root;
    	Stack<TreeNode> stack = new Stack<>();
    	while(p!=null || !stack.isEmpty())
    	{
    		while(p != null)
    		{
    			stack.push(p);
    			p = p.left;
    		}
    		TreeNode temp = stack.pop();
    		a.add(temp.val);
    		p = temp.right;
    	}
    }
}

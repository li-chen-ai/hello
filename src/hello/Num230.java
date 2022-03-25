package hello;

import java.util.HashMap;
import java.util.Stack;

public class Num230 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(4);
		node1.left = node2;
		node2.right = node3;
		node1.right = node4;
		bianli a = new bianli(node1);
		System.out.println(a.getkvalue(3));
		System.out.println(kthSmallest(node1, 3));
	}
	
    public static int kthSmallest(TreeNode root, int k) {
    	int ret = 0;
    	return bianli02(root, k);
    }
    
    public static int bianli02(TreeNode root, int k)
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
    		k--;
    		if(k==0)
    			return temp.val;
    		p = temp.right;
    	}
    	return 0;
    } 
}

class bianli{
	private TreeNode root;
	private HashMap<TreeNode, Integer> map = new HashMap<>();
	
	public bianli(TreeNode root)
	{
		this.root = root;
		numcount(root);
	}
	
	public int numcount(TreeNode node)
	{
		if(node == null)
			return 0;
		else
		{
			map.put(node, 1+numcount(node.left)+numcount(node.right));
			return 1+numcount(node.left)+numcount(node.right);
		}	
	}
	
	public int getkvalue(int k)
	{
		TreeNode node = root;
		while(node != null)
		{
			if(map.get(node.left)+1 == k)
				return node.val;
			else if(map.get(node.left)+1 < k)
			{
				k -= map.get(node.left)+1;
				node = node.right;
			}
			else 
			{
				node = node.left;
			}
		}
		return 0;
	}
}

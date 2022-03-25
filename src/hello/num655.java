package hello;

import java.util.ArrayList;
import java.util.List;

public class num655 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node1 = new TreeNode(0);
//		TreeNode node2 = new TreeNode(2);
//		TreeNode node3 = new TreeNode(3);
//		TreeNode node4 = new TreeNode(4);
//		TreeNode node5 = new TreeNode(5);
//		node1.left = node2;
//		node2.left = node3;
//		node3.left = node4;
//		node1.right = node5;
		printTree(node1);
	}
	
    public static List<List<String>> printTree(TreeNode root) 
    {
    	int high = high(root);
    	int weight = (int) (Math.pow(2, high)-1);
//    	List<List<String>> tree = new ArrayList();
    	int[][] tree = new int[high][weight];
    	full(root, tree, 0, 0, weight-1);
    	for(int i = 0;i<high;i++)
    	{
    		for(int j=0;j<weight;j++)
    			System.out.print(tree[i][j]);
    		System.out.println();
    	}
    	List<List<String>> ret = new ArrayList();
    	for(int i = 0;i<high;i++)
    	{
    		List<String> temps = new ArrayList<String>();
    		for(int j=0;j<weight;j++)
    			if(tree[i][j] == 0)
    				temps.add("");
    			else
    				temps.add(""+tree[i][j]);
    		ret.add(temps);
    	}
    	System.out.print(ret);
    	return ret;
    }
    
    public static int high(TreeNode root)
    {
    	if(root == null)
    		return 0;
    	return (high(root.left)>high(root.right)?high(root.left):high(root.right))+1;
    }
    
    public static int[][] full(TreeNode root, int[][] tree, int level, int begin, int end)
    {
    	if(root!=null)
    	{
    		tree[level][(begin+end)/2] = root.val;
    		full(root.left, tree, level+1, begin, (begin+end)/2-1);
    		full(root.right, tree, level+1,  (begin+end)/2+1, end);
    	}
    	return tree;
    }

}

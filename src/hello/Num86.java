package hello;

public class Num86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(2);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(2);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
//		ListNode node1 = new ListNode(2);
//		ListNode node2 = new ListNode(1);
//		node1.next = node2;
		ListNode ret = partition02(node1, 3);
		while(ret!=null)
		{
			System.out.println(ret.val);
			ret = ret.next;
		}
	}
	
    public static ListNode partition(ListNode head, int x) {
    	ListNode pre = new ListNode();
    	ListNode bigthanx = new ListNode();                                             
    	pre.next = head;
    	ListNode ret = pre;
    	while(pre.next!=null && pre.next.val<x)
    	{
    		pre = pre.next;
    	}
    	// bigthanx 代表大于x的第一个节点
    	bigthanx = pre.next;
    	ListNode work = bigthanx;
    	if(work == null)
    		return ret.next;
    	while(work.next!=null)
    	{
    		if(work.next.val<x)
    		{
    			pre.next = work.next;
    			work.next = work.next.next;
    			pre = pre.next;
    			pre.next = bigthanx;
    		}
    		else
    			work = work.next;
    	}
    	return ret.next;
    }
    
    public static ListNode partition02(ListNode head, int x)
    {
    	if(head==null || head.next==null)
    		return head;
    	ListNode small=new ListNode();
    	ListNode ret = small;
    	ListNode big = new ListNode();
    	ListNode bighead = big;
    	while(head!=null)
    	{
    		if(head.val<x)
    		{
    			small.next = head;
    			small = small.next;
    			head =head.next;
    		}
    		else {
    			big.next=head;
    			big = big.next;
    			head = head.next;
    		}
    	}
    	big.next = null;
    	small.next = bighead.next;
    	return ret.next;
    }

}


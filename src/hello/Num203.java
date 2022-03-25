package hello;

public class Num203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node6 = new ListNode(6);
		ListNode node5 = new ListNode(5, node6);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(6, node3);
		ListNode node1 = new ListNode(2, node2);
		ListNode node0 = new ListNode(1, node1);
		System.out.print(removeElements(node0, 6));
	}

    public static ListNode removeElements(ListNode head, int val) {
        ListNode ret = new ListNode(-1, head);
        ListNode p = ret;
        while(p.next != null)
        {
            if(p.next.val == val)
            {
                p.next = p.next.next;
            }
            p = p.next;
            if(p == null)
            	break;
        }
        return ret.next;
    }
}

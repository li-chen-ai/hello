package hello;

public class num02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode ListNode1 = new ListNode(9);
		ListNode ListNode2 = new ListNode(9);
		ListNode ListNode3 = new ListNode(9);
		ListNode ListNode8 = new ListNode(9);
		ListNode ListNode9 = new ListNode(9);
		ListNode ListNode10 = new ListNode(9);
		ListNode ListNode11 = new ListNode(9);
		ListNode1.next = ListNode2;
		ListNode2.next = ListNode3;
		ListNode3.next = ListNode8;
		ListNode2.next = ListNode3;
		ListNode8.next = ListNode9;
		ListNode9.next = ListNode10;
		ListNode10.next = ListNode11;

		ListNode ListNode4 = new ListNode(9);
		ListNode ListNode5 = new ListNode(9);
		ListNode ListNode6 = new ListNode(9);
		ListNode ListNode7 = new ListNode(9);
		ListNode4.next = ListNode5;
		ListNode5.next = ListNode6;
		ListNode6.next = ListNode7;
//		ListNode ListNode1 = new ListNode(5);
//
//
//		ListNode ListNode4 = new ListNode(5);


		addTwoNumbers(ListNode1, ListNode4);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		int[][] value = new int[100][2];
//
//		int i=0,j=0;
//		for(;l1!=null || l2!=null;)
//		{
//			if(l1!=null)
//			{
//				value[i++][0]=l1.val;
//				l1 = l1.next;
//			}
//			else
//			{
//				value[j++][1]=l2.val;
//				l2=l2.next;
//			}
//		}
//		i = i>j?i:j;
//		ListNode l3 = new ListNode();
//		ListNode l4 = l3;
//		int flag = 0;
//		for(int t=0;t<i;t++)
//		{
//			ListNode temp = new ListNode();
//			if(t<j)
//			{
//			temp.val = (value[t][1]+value[t][0]+flag)%10;
//			flag =  (value[t][1]+value[t][0]+flag)/10;
//			}
//			else
//			{
//				temp.val = (value[t][0]+flag)%10;
//				flag =  (value[t][0]+flag)/10;
//			}
//			l3.next = temp;
//			l3 = temp;
//		}
//		if(flag == 1)
//			l3.next = new ListNode(1);
//		l3 = l4.next;
//		for(;l3!=null;)
//		{
//			System.out.print(l3.val);
//			l3 = l3.next;
//		}
//		return l3;
// ***************
//		ListNode l3 = new ListNode();
//		ListNode l4 = l3;
//		int flag = 0;
//		while(l1!=null&&l2!=null)
//		{
//			l4.next = new ListNode((l1.val+l2.val+flag)%10);
//			flag = (l1.val+l2.val+flag)/10;
//			l4 = l4.next;
//			l1 = l1.next;
//			l2 = l2.next;
//		}
//		while(l1!=null)
//		{
//			l4.next = new ListNode((l1.val+flag)%10);
//			flag = (l1.val+flag)/10;
//			l4 = l4.next;
//			l1 = l1.next;
//		}
//		while(l2!=null)
//		{
//			l4.next = new ListNode((l2.val+flag)%10);
//			flag = (l2.val+flag)/10;
//			l4 = l4.next;
//			l2 = l2.next;
//		}
//		if (flag == 1)
//			l4.next = new ListNode(1);
//		return l3.next;
// *****************
    }

}

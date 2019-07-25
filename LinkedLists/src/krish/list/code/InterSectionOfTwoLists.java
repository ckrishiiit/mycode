package krish.list.code;

/*class ListNode {
	   int val;
	   ListNode next;
	   ListNode(int x) { val = x; }
}*/

public class InterSectionOfTwoLists {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		if(headA == null || headB == null)
			return null;
		
		ListNode a = headA, b = headB;
		
		while(a != b) {
			if(a == null)
				a = headB;
			else
				a  = a.next;
			if(b == null)
				b = headA;
			else
				b = b.next;
		}
		return a;
	}
}

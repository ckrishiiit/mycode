package krish.list.code;

/*class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}*/


public class LinkedListCycle {
	
    public ListNode detectCycle(ListNode head) {
    	
    	ListNode slow = head, fast = head;
    	
    	while(fast != null && fast.next != null) {
    		fast = fast.next.next;
    		slow = slow.next;
    		if(slow == fast)
    			break;
    	}
    	
    	if(fast == null || fast.next == null)
    		return null;
    	
    	slow = head;
    	while(slow != fast) {
    		slow = slow.next;
    		fast = fast.next;
    	}
    	return slow;
    }
}

package krish.list.code;

class ListNode {
	   int val;
	   ListNode next;
	   ListNode(int x) { val = x; }
}
//Reverse a singly linked list.

//Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL

public class ReverseLinkedList {

	/*
	 *   Idea is to travese List while traversing modify links
         Time Complexity: O(n)
	 */
    public ListNode reverseList(ListNode head) {
	      
    	if(head == null)
    		return null;
    	
    	ListNode prev = null, curr = head, next = null;
    	while(curr != null) {
    		next = curr.next;
    		curr.next = prev;
    		prev = curr;
    		curr = next;
    	}
    	head = prev;
    	return head;
	}
}

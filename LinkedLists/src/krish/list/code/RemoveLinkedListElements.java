package krish.list.code;

/*class ListNode {
int val;
ListNode next;
ListNode(int x) { val = x; }
}*/

public class RemoveLinkedListElements {

public ListNode removeElements(ListNode node, int val) {
        
        ListNode head = node, prev = null, curr = node;
        while( curr != null) {
         
            if(curr.val == val){
                
                if(prev == null){
                    curr = curr.next;
                    while(curr != null && curr.val == val){
                        curr = curr.next;
                    }
                    head = curr;
                    if(head == null)
                        return null;
                }
                else{
                       while(curr != null && curr.val == val) {
                        curr = curr.next;
                    }
                    
                    prev.next = curr;
                    prev = curr;
                    if(curr != null)
                    curr = curr.next;
                }
            }
            else{
                prev = curr;
                curr = curr.next;
            }
            
        }
        return head;
    }
}

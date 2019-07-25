package krish.list.code;

public class MyList<E> {

   static class Node<E> {
	   
	   E item;
	   Node<E> next;
	   Node(E item){
		   this.item = item;
		   this.next = null;
	   }
   }
   
   Node<E> head = null;
   
   public MyList() {
	   head = null;
   }
   
   public void addAtHead(E item) {
	   if(head == null) {
		   head = new Node<E>(item);
		   head.next = null;
	   }
	   else {
		   Node<E> curr = new Node<E>(item);
		   curr.next = head;
		   head = curr;
	   }
   }
   
   private Node<E> getTailNode(Node<E> head) {
	   
	   Node<E> temp = head;
	   while(temp.next != null) {
		   temp = temp.next;
	   }
	   return temp;
   }
   
   public void addAtTail(E item) {
	   if(head != null) {
		   Node<E> curr = new Node<E>(item);
		   Node<E> tail = getTailNode(head);
		   tail.next = curr;
	   }
   }
   
   public void printList() {
		// TODO Auto-generated method stub
		Node<E> temp = head;
		   while(temp != null) {
			   System.out.print(temp.item+"->");
			   temp = temp.next;
		   }
		
	}
   
   public Node<E> getNode(int index) {
	   
	   if(index < 0)
		   return null;
	   
	   Node<E> curr = head;
	   for(int i=0; i<index && curr != null; i++) {
		   curr = curr.next;
	   }
	   return curr;
   }
   
   //Delete Node
   public void deleteAtIndex(int index) {
	   
	   Node<E> curr = getNode(index);
	   
	   if(curr ==  null)
		   return;
	  
	   Node<E> prev = getNode(index-1);
	   Node<E> next = curr.next;
	   if(prev != null)
		   prev.next = next;
	   else
		   head = next;
   }
   
   public Node<Integer> removeElements(Node<Integer> node, int val) {
       
	   Node<Integer> head = node, prev = null, curr = node;
	   
	   while(curr != null) {
		   
		   if(curr.item == val) {
			   
		   }
	   }
	   return head;
   }
   
}

package krish.list.code;

public class MyLinkedList {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyList<Integer> list = new MyList();
		list.addAtHead(20);
		list.addAtTail(10);
		list.addAtTail(4);
		list.addAtTail(2);
		list.addAtTail(8);
		list.addAtHead(5);
		System.out.println("before");
		list.printList();
		list.deleteAtIndex(0);
		System.out.println();
		list.printList();
		
	}

}

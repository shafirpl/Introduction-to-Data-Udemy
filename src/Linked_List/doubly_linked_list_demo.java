package Linked_List;

public class doubly_linked_list_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubly_linked_list list = new doubly_linked_list();
		list.insertAtHead(10);
		list.insertAtHead(20);
		list.insertAtHead(30);
		list.insertAtHead(40);
		
		list.deleteAtHead();
		list.deleteAtHead();
		
		list.insertAtHead(30);
		list.insertAtHead(40);
		
		System.out.println(list);
		list.printBackwards();
		
		list.reverse();
		
		System.out.println("Reversed list:"+list);

	}

}

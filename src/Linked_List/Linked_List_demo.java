package Linked_List;

public class Linked_List_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linked_list list = new linked_list();
		
		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(2);
		list.insertAtHead(12);
		list.insertAtHead(19);
		list.insertAtHead(20);
		

		
		System.out.println(list);
		System.out.println(list.getlength());
		
		list.deleteAtHead();
		
		System.out.println(list);
		System.out.println(list.getlength());
		
		System.out.println(list.find(100));
		System.out.println(list.find(12));
		
	}

}

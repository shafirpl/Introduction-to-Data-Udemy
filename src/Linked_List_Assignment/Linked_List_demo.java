package Linked_List_Assignment;

public class Linked_List_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linked_list list = new linked_list();
		
		linked_list list2 = new linked_list();
		
		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(2);
		list.insertAtHead(12);
		list.insertAtHead(19);
		list.insertAtHead(20);
		
		list2.insertAtHead(500);
		list2.insertAtHead(400);
		list2.insertAtHead(300);
		list2.insertAtHead(200);
		list2.insertAtHead(100);
		
		
		
		System.out.println(list);
		System.out.println(list.findElement(5));
		list.reverse();
		System.out.println(list);
		System.out.println(list2);
		list2.append(list, 4);
		System.out.println(list2);
		
		linked_list list3 = new linked_list();
		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(2);
		list.insertAtHead(2);
		list.insertAtHead(2);
		list.insertAtHead(12);
		list.insertAtHead(10);
		list.insertAtHead(20);
		list.insertAtHead(20);
		
	}

}

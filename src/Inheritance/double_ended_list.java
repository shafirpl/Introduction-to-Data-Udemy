package Inheritance;



public class double_ended_list extends linked_list {
	
	public void insertAtTail(int data) {
		node newNode = new node(data);
		if(super.head==null) {
			super.head = newNode;
			
		}
		
		if(super.tail==null) {
			//System.out.println("Before tail: "+this.tail);
			super.tail = newNode;
			//System.out.println("After tail: "+this.tail);
			//System.out.println("After tail head is: "+this.head);
			return;
		}
		
		super.tail.setNextNode(newNode);
		super.tail = newNode;
		//return;
		
	}

}

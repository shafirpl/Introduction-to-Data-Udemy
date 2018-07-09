package Linked_List;

public class double_ended_list extends linked_list {
	
	private node head;
	private node tail;
	

	
	public void insertAtTail(int data) {
		node newNode = new node(data);
		if(this.head==null) {
			this.head = newNode;
			
		}
		
		if(this.tail==null) {
			System.out.println("Before tail: "+this.tail);
			this.tail = newNode;
			System.out.println("After tail: "+this.tail);
			System.out.println("After tail head is: "+this.head);
			return;
		}
		
		tail.setNextNode(newNode);
		tail = newNode;
		//return;
		
	}
	
//	public void insertAtHead(int data) {
//		 node node = new node(data);
//		 node.setNextNode(this.head);
//		 this.head = node;
//		 
//	 }
//	 
//	 public int getlength() {
//		 int length = 0;
//		 node current = this.head;
//		 while(current!=null) {
//			 length++;
//			 current = current.getNextNode();
//		 }
//		 return length;
//		 
//	 }
//	 
//	 public void deleteAtHead() {
//		 this.head = this.head.getNextNode();
//	 }
//	 
//	 public node find(int data) {
//		 node current = this.head;
//		 while(current!=null) {
//			 if (current.getData() == data) return current;
//			 current = current.getNextNode();
//		 }
//		 return null;
//	 }
		@Override
		public String toString() {
			node current = this.head;
			String result = "{";
			while(current!=null) {
			result = result + current.toString()+","+" ";
			current = current.getNextNode();
			}
			result = result+"}";
			return result;
		}
	


}

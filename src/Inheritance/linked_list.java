package Inheritance;

public class linked_list {
	 protected node head;
	 protected node tail;
	 
	 //using protected so that they can only be accessed from
	 //subclasses and not from anywhere
	 
	 public void insertAtHead(int data) {
		 node node = new node(data);
		 node.setNextNode(this.head);
		 this.head = node;
		 
	 }
	 
	 public int getlength() {
		 int length = 0;
		 node current = this.head;
		 while(current!=null) {
			 length++;
			 current = current.getNextNode();
		 }
		 return length;
		 
	 }
	 
	 public void deleteAtHead() {
		 this.head = this.head.getNextNode();
	 }
	 
	 public node find(int data) {
		 node current = this.head;
		 while(current!=null) {
			 if (current.getData() == data) return current;
			 current = current.getNextNode();
		 }
		 return null;
	 }
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




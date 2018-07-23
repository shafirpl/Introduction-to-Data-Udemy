package Linked_List;

public class doubly_linked_list{
	private doubly_node head;
	public void insertAtHead(int data) {
		 doubly_node node = new doubly_node(data);
		 if(this.head!=null) {
			 node.setNextNode(this.head);
			 this.head.setPrevNode(node); 
		 }

		 this.head = node;
		 
	 }
	 
	 public int getlength() {
		 int length = 0;
		 doubly_node current = this.head;
		 while(current!=null) {
			 length++;
			 current = current.getNextNode();
		 }
		 return length;
		 
	 }
	 
	 public void deleteAtHead() {
		 this.head.getNextNode().setPrevNode(null);
		 this.head = this.head.getNextNode();
	 }
	 
	 public doubly_node find(int data) {
		 doubly_node current = this.head;
		 while(current!=null) {
			 if (current.getData() == data) return current;
			 current = current.getNextNode();
		 }
		 return null;
	 }
	 
	 public void printBackwards() {
		 doubly_node current;
		 String result="{";
		 current = this.head;
		 while(current.getNextNode()!=null) {
			 current = current.getNextNode();
		 }
		 
		 while(current!=null) {
			 result = result + current.toString()+","+" ";
			 current = current.getPrevNode();
		 }
		 result = result + "}";
		 System.out.println(result);
	 }
	 
	 public void reverse() {
		 doubly_node current;
		 current = this.head;
		 while(current.getNextNode()!=null) {
			 current = current.getNextNode();
		 }
		 this.head = current;
		 
		 while(current!=null) {
			 doubly_node prev = current.getPrevNode();
			 doubly_node next = current.getNextNode();
			 
			 current.setNextNode(prev);
			 current.setPrevNode(next);
			 
			 current = prev;
			 
		 }
		 
		 
			 
		 
		 //System.out.println(head.he());
	 }
	 
	 
	 	public void insertion_Sort() {
	 		doubly_node current = this.head.getNextNode();
	 		while(current!=null) {
	 			int value = current.getData();
	 			while(current.getPrevNode()!=null && current.getPrevNode().getData()>value) {
	 				current.getPrevNode().setNextNode(current.getNextNode());
	 				if(current.getNextNode()!=null) current.getNextNode().setPrevNode(current.getPrevNode());
	 				current.setNextNode(current.getPrevNode());
	 				current.setPrevNode(current.getPrevNode().getPrevNode());
	 				if(current.getPrevNode()!=null) current.getPrevNode().setNextNode(current);
	 				current.getNextNode().setPrevNode(current);
	 			}
	 			if(current.getPrevNode()==null) this.head = current;
	 			current = current.getNextNode();
	 		}
	 	}
		@Override
		public String toString() {
			doubly_node current = this.head;
			String result = "{";
			while(current!=null) {
			result = result + current.toString()+","+" ";
			current = current.getNextNode();
			}
			result = result+"}";
			return result;
		}
	
	

}

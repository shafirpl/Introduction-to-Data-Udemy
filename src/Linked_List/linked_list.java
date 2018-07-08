package Linked_List;

public class linked_list {
 private node head;
 
 public void insertAtHead(int data) {
	 node node = new node(data);
	 node.setNextNode(this.head);
	 this.head = node;
	 
 }
	@Override
	public String toString() {
		node current = head;
		String result = "{";
		while(current!=null) {
		result = result + current.toString()+","+" ";
		current = current.getNextNode();
		}
		result = result+"}";
		return result;
	}
 }



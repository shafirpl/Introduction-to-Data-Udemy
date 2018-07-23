package Linked_List;

public class sorted_linked_list {
	private node head;
	
	/*In two cases new node becomes the head node
	 * the list is empty
	 * the head is greater than the new node
	 * 
	 */
	
	public void insert(int data) {
		node newNode = new node(data);
		if(this.head == null) {
			this.head = newNode;
			return;
		}
		
		if(this.head.getData()>newNode.getData()) {
			newNode.setNextNode(head);
			head = newNode;
			return;
		}
		
		node current = this.head;
		
		while(current.getNextNode()!=null) {
			
			if(newNode.getData()>=current.getNextNode().getData()) {
				current = current.getNextNode();
			}
			else break;
			
			
			
		}
		
		newNode.setNextNode(current.getNextNode());
		current.setNextNode(newNode);
		
		
		
	}
	
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

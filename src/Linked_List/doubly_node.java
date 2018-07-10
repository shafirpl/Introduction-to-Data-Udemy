package Linked_List;

public class doubly_node {
	
	private doubly_node nextNode;
	private int data;
	private doubly_node prevNode;
	
	
	 doubly_node(int data){
		this.data = data;
	}
	
	public doubly_node getNextNode() {
		return this.nextNode;
	}
	
	public doubly_node getPrevNode() {
		return this.prevNode;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNextNode(doubly_node node) {
		this.nextNode = node;
	}
	
	public void setPrevNode(doubly_node node) {
		this.prevNode = node;
	}
	
	
	
	@Override
	public String toString() {
		return ("Data:" + this.data);
	}

}

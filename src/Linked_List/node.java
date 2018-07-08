package Linked_List;

public class node {

	private node nextNode;
	private int data;
	
	
	node(int data){
		this.data = data;
	}
	
	public node getNextNode() {
		return this.nextNode;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNextNode(node node) {
		this.nextNode = node;
	}
	
	@Override
	public String toString() {
		return ("Data:" + this.data);
	}
}

package Linked_List_Assignment;
import java.util.*;

public class linked_list {
 private node head;
 
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
 
 protected node gethead() {
	 return this.head;
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
 
// public void reverse() {
//	 node current = this.head;
//	 if(current==null) return;
//	 node prev = null;
//	 while(current!=null) {
//		 
//		 node next = current.getNextNode();
//		 current.setNextNode(prev);
//		 prev = current;
//		 current = next;
//		 System.out.println("prev Node: "+prev);
//		 System.out.println("current Node: "+current);
//		 
//	 }
//	 this.head = prev;
//	 System.out.println(this.head.getNextNode());
// }
 
 public void reverse() {
	 node prev = null;
	 node current = this.head;
	 node next = current.getNextNode();
	 
	 while(current!=null) {
		 current.setNextNode(prev);
		 prev = current;
		 current = next;
		 if(current!=null) next = current.getNextNode();
		
	 }
	 this.head = prev;
	 
 }
 
 public node findElement(int n) {
	 node current = this.head;
	 if(n==this.getlength()-1) return current;
	 if(n>this.getlength()) throw new ArithmeticException("n is not valid");
	 
	 for(int i=0; i<this.getlength()-n-1;i++) {
		 current = current.getNextNode();
	 }
	 
	 return current;
 }
 
 public void append(linked_list list, int n) {
	 if(n==0) return;
	 if(n>list.getlength()) throw new ArithmeticException("length is not valid");
	 int length = list.getlength();
	 node head = list.gethead();
	 for(int i =0; i<length-n; i++) {
		 head = head.getNextNode();
	 }
	 
	 node current = head;
	 
	 while(current.getNextNode()!=null) {
		 current = current.getNextNode();
	 }
	 
	 current.setNextNode(this.head);
	 this.head = head;	 
 }
 
 public void removeDupliateUsingSets() {
	 node current = this.head;
	 Set<Integer> set = new HashSet<Integer>();
	 
	 //for any set, it only takes unique values. If we want to add duplicate values, it will return false and won't 
	 //add the value
	 
	 while(current!=null) {
		 boolean flag = set.add(current.getNextNode().getData());
		 if(flag == false && current.getNextNode()!=null) {
			 current.setNextNode(current.getNextNode().getNextNode());
		 }
		 current = current.getNextNode();
	 }
	 
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




public class insertion_sort_assignment {
private Employee[] members;

insertion_sort_assignment(Employee[] members){
	this.members = members;
}


private void insertion_sort() {
	for(int i=1; i<members.length;i++) {
		Employee temp = members[i];
		int j = i; 
		while(j>0 && members[j-1].getemployeeNumber()>temp.getemployeeNumber()) {
		 members[j] = members[j-1];
		 j--;
		}
		members[j] = temp;
	}
}

public void getresults() {
	insertion_sort();
	for(int i=0; i<this.members.length;i++) {
		System.out.println(this.members[i].getemployeeNumber()+" "+
	this.members[i].getfirstName());
	}
}


}

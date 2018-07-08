
public class Employee {
 private int employeeNumber;
 private String firstName;
 private String lastName;
 private String emailId;
 
 Employee(int employeeNumber,String firstName, String lastName,String emailId){
	 
	 this.emailId = emailId;
	 this.employeeNumber = employeeNumber;
	 this.firstName = firstName;
	 this.lastName = lastName;
 }
 
 public int getemployeeNumber() {
	 return this.employeeNumber;
 }
 
 public String getfirstName() {
	 return this.firstName;
 }
 
 public String getlastName() {
	 return this.lastName;
 }
 
 public String getemailId() {
	 return this.emailId;
 }
}

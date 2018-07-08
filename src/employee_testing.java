
public class employee_testing {

	public static void main(String[] args) {
		Employee employee1 = new Employee(123456, "hello", "hello", "hello");
		Employee employee2 = new Employee(123456, "hi", "hi", "hi");
		Employee employee3 = new Employee(123455, "bye", "bye", "bye");
		Employee employee4 = new Employee(123454, "ni", "ni", "ni");
		Employee employee5 = new Employee(123460, "tal", "tal", "tal");
		Employee employee6 = new Employee(1, "kel", "kel", "kel");
		
		Employee[] array = {employee1,employee2,employee3,employee4,employee5,employee6};
		
		
		insertion_sort_assignment result = new insertion_sort_assignment(array);
		result.getresults();

	}

}


public class Employee {
	private String firstName;
	private String lastName;
	private int employeeID;
	private double salary;
	
	//below is the constructor method
	public Employee() {
		firstName = null;
		lastName = null;
		employeeID = 0;
		salary = 0.0;
	}
	
	//below is the set methods
	public void setFirstName(String first_name){
		firstName = first_name;
	}
	
	public void setLastName(String last_name){
		lastName = last_name;
	}
	
	public void setEmployeeID(int IDNumber) {
		employeeID = IDNumber;
	}
	
	public void setSalary(double income) {
		salary = income;
	}
	
	//below is the get methods
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public double getSalary() {
		return salary;
	}
	
	//below is the employeeSummary method (prints all account attributes)
	public void employeeSummary() {
		System.out.println("Employee name: " + firstName + " " + lastName);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Salary: $" + salary);
	}
}

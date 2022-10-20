
public class Manager extends Employee {
	private String department;
	
	public Manager() {
		super();
		department = null;
	}
	
	public void setDepartment(String dept) {
		department = dept;
	}
	
	public String getDepartment(){
		return department;
	}
	
	//below is the employeeSummary method (prints all superclass and subclass attributes)
	public void employeeSummary() {
		super.employeeSummary();
		System.out.println("Department: " + department);
	}

}

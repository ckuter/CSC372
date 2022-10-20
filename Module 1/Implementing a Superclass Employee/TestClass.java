
public class TestClass {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();	
		
		employee.setFirstName("Leonardo");
		employee.setLastName("di ser Piero da Vinci");
		employee.setEmployeeID(1452);
		employee.setSalary(72153.24);
		employee.employeeSummary();
		System.out.println();
		
		manager.setFirstName("Michelangelo");
		manager.setLastName("di Lodovico Buonarroti Simoni");
		manager.setEmployeeID(1475);
		manager.setSalary(107307.15);
		manager.setDepartment("Artistry");
		manager.employeeSummary();

		
	

	}

}

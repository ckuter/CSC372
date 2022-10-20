
public class student implements Comparable<student>{
	private String name;
	private String address;
	private double GPA;
	
	public student (String name, String address, double GPA) {
		this.name = name;
		this.address = address;
		this.GPA = GPA;
	}
	
	//the get methods
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	//the set methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddres(String address) {
		this.address = address;
	}
	
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nAddress: " + address + "\nGPA: " + GPA;
	}
	
	@Override
	public int compareTo(student s) {
		return getName().compareTo(s.getName());
	}

}

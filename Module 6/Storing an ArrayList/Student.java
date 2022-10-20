
public class Student {
	int rollno;
	String name;
	String address;
	
	public Student (String name, int rollno, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public String toString() {
		return "Name: " + name + ", Roll No. " + rollno + ", Address: " + address;
	}
}

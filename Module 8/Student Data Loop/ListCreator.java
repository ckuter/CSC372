	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Scanner;

public class ListCreator {
	public static void main(String[] args) {
		try (Scanner chris = new Scanner(System.in)) {
			int totalStudents = 0;
			
			System.out.println("Hello and welcome to the Student Information Data Center!");
			System.out.println();
			System.out.println("Please input the number of students you will be inputting.");
			System.out.print("Total number of students: ");
			totalStudents = chris.nextInt(); chris.nextLine();
			
			List<student> studentList = new LinkedList<student>();
			
			for (int i = 0; i < totalStudents; i++) {
				System.out.println();
				System.out.println("Student " + (i + 1) + " Information");
					
				System.out.print("Name: ");
				String name = chris.nextLine();
					
				System.out.print("Address: ");
				String address = chris.nextLine();
				
			
				System.out.print("GPA: ");
				String stringGPA = chris.nextLine();
				while (validGPA(stringGPA) == false){
					System.out.print("GPA: ");
					stringGPA = chris.nextLine();	}
				 double GPA = Double.parseDouble(stringGPA);
			
				student s = new student(name, address, GPA);
				studentList.add(s);
			}
				
			Collections.sort(studentList);
			Iterator<student> pine = studentList.iterator();
			try {
				FileWriter scribbler = new FileWriter("List of Students.txt");
				while (pine.hasNext()) {
					scribbler.write(pine.next().toString() + "\n\n");
				}
				scribbler.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			finally {
				System.out.println();
				System.out.println("Thank you for using the Student Information Data Center. \nYour file containing the above students' information has finished being created.");
				System.out.println("Have a good day!");
			}
		}
	}
	
	public static boolean validGPA(String s) {
		try {
			Double.parseDouble(s);
			double GPA = Double.parseDouble(s);
			if ((GPA < 0.0) || (GPA > 4.0)) {
				throw new Exception();
			}
			else {
				return true;
			}
		}
		catch(NumberFormatException e) {
			System.out.println();
			System.out.println(s + " is not a valid double. Please try again.");
			System.out.println();
			return false;
		}
		catch(Exception e) {
			System.out.println();
			System.out.println(s + " is not a valid GPA. One's GPA should be a value between 0.0 to 4.0. Please try again.");
			System.out.println();
			return false;
		}
	}
}

import java.util.ArrayList;

public class TheHub {
	
	public static void rollSort(ArrayList<Student> students) {
		SortByRoll sortbyroll = new SortByRoll();
		int n = students.size();
		
		for (int i = 0; i < n-1; i++) {
			int minimum = i;
			
			for (int j = i+1; j < n; j++)
				if (sortbyroll.compare(students.get(j), students.get(minimum)) < 0)
					minimum = j;
			
			Student temp = students.get(minimum);
			students.set(minimum, students.get(i));
			students.set(i, temp);
		}
	}
	
	public static void nameSort(ArrayList<Student> students) {
		SortByName sortbyname = new SortByName();
		int n = students.size();
		
		for (int i = 0; i < n-1; i++) {
			int minimum = i;
			
			for (int j = i+1; j < n; j++)
				if (sortbyname.compare(students.get(j), students.get(minimum)) < 0)
					minimum = j;
			
			Student temp = students.get(minimum);
			students.set(minimum, students.get(i));
			students.set(i, temp);
		}
	}

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		//creates the 10 students that will be sorted
		Student s1 = new Student("Felipe Delgado", 9574, "85 Redwood Drive, Huntington Station, NY 11746");
        Student s2 = new Student("Kyleigh LeBlanc", 3553, "8427 Lower River St., Olive Branch, MS 38654");
        Student s3 = new Student("Reed Petersen", 1031, "59 Inverness Ave., West Islip, NY 11795");
        Student s4 = new Student("Aubree Montoya", 5086, "83 North Cedar Swamp Street, West Bend, WI 53095");
        Student s5 = new Student("Cassius Hurley", 4093, "7403 Woodsman Ave., Chippewa Falls, WI 54729");
        Student s6 = new Student("Jameson Stafford", 9644, "158 Fieldstone Street, Merrick, NY 11566");
        Student s7 = new Student("Giovanny Flyyn", 2664, "306 Courtland Street, Saint Albans, NY 11412");
        Student s8 = new Student("Caiden Carr", 7272, "465 S. Vine St., Livingston, NJ 07039");
        Student s9 = new Student("Korbin Brady", 5430, "275 Shore Ave., Fairport, NY 14450");
        Student s10 = new Student("Amir Strickland", 3377, "9641 Cypress Drive, Ogden, UT 84404");
        
        //adds the students to the ArrayList
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
		
        //sort the students by roll
		rollSort(students);
		System.out.println("Here is the order after the list of students has been sorted by roll: ");
		System.out.println("---------------------------------------------------------------------------------------");
		
		for (Student x : students) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		//sort the students by name
		nameSort(students);
		System.out.println();
		System.out.println("Here is the order after the list of students has been sorted by name: ");
		System.out.println("---------------------------------------------------------------------------------------");

		for (Student x : students) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------------------------------------------------------");

	}

}

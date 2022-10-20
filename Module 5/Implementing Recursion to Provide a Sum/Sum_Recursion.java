import java.util.Scanner;

public class Sum_Recursion {

	public static void main(String[] args) {
		try (Scanner addme = new Scanner(System.in)) {
			int[] Array = new int[5];
			
			System.out.println("To start, please enter the five numbers you would like to add below: ");
			
			for (int i = 0; i < 5; i++) {
				Array[i] = addme.nextInt();
			}
			
			int result = sum(Array,5);
			System.out.println("The sum of your five numbers is " + result + ".");
		}
	}
	
	public static int sum(int[] A, int b) {
		if (b > 0) {
			return (A[b-1] + sum(A, b-1));
		}
		else {
			return 0;
		}
	}
}

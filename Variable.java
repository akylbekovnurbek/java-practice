import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in) ;
		System.out.print("Fullname: ");
		String fullname = scan.nextLine();
		System.out.print("Age: ");
		int age = scan.nextInt();
		System.out.print("Is student: ");
		boolean isStudent = scan.nextBoolean();
		System.out.print("Inn: ");
		long inn = scan.nextLong();
		System.out.print("Height: ");
		float height = scan.nextFloat();
		System.out.print("Weight: ");
		double weight = scan.nextDouble();
		



	}
}
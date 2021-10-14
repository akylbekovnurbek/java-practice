import java.util.Scanner;

public class Swapping {
	 public static void main(String[] args) {
	 	Scanner scan = new Scanner(System.in);
	 	System.out.print("a: ");
        int a = scan.nextInt();

        System.out.print("b: ");
	 	int b = scan.nextInt();
	 	System.out.println("Before swapping: a = " + a + ", b = " + b);

	 	int t = a;
	 	a = b;
	 	b = t;

	 	/*
	 	Старый вариант:
	 	a = a + b;
	 	b = a - b;
	 	a = a - b;
	 	import java.util.Scanner;
	 	*/

	 	System.out.println("After Swapping: a = " + a + ", b = " + b);

	 }
}
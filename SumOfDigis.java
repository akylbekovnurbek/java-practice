import java.util.Scanner;
public class SumOfDigis {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);


		int number = scan.nextInt();
		int sum = 0;

		sum += number %10; // 0 + 4 = 4
		number /= 10;  // 1234 / 10 = 123.4 -> 123
		
		sum += number %10;  // 4 + 3
		number = number / 10; // 123 / 10 = 12.3 -> 12
	    
	    sum += number %10; // 7 + 2
		number = number / 10; // 12 / 10 = 1.2 -> 1
		
		sum += number %10; // 9 + 1
		number /= number%10; // 1 / 10 = 0.1 -> 0

		System.out.println("Sum = " + sum);









		
	}


}
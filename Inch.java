import java.util.Scanner;

public class Inch{
     public static void main(String[] args) {
          Scanner scan = new Scanner (System.in);

          final double CM_PER_INCH = 2.54;

          int inch = scan.nextInt();
          double answer = inch * CM_PER_INCH;
          
          System.out.printf("%d in. =%.2f cm.%n", inch, answer);
     }
}
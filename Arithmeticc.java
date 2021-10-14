import java.util.Scanner;
     public class Arithmeticc {
         public static void main(String[] args){
         Scanner scan = new Scanner (System.in);
         int a, b;
         System.out.print("a: ");
         a = scan.nextInt() ;
         System.out.print("b: ");
         b = scan.nextInt() ;

         // + для текста -> конкатенация
         // + для чисел -> арифметическое сложение

         System.out.println(a + " + " + b + " = " + (a + b)); // 5+5=11
         System.out.println(a + " - " + b + " = " + (a - b));
         System.out.println(a + " * " + b + " = " + (a * b));
         System.out.println(a + " / " + b + " = " + (a / b));
         System.out.println(a + " % " + b + " = " + (a % b));

}
}
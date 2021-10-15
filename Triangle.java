import java.util.Scanner;
     public class Main {
         public static void main(String[] args){
         Scanner scan = new Scanner (System.in);
         
         double a = scan.nextDouble(); 
         double b = scan.nextDouble(); 
         double c = scan.nextDouble(); 
         
         if (a<b){
             double t = a;
             a = b;
             b = t;
         }
         if (a<c){
             double t = a;
             a = c;
             c = t;
         }
         if (b<c){
             double t = b;
             b = c;
             c = t;
         }
         
         if ((a+b)>c&&(b+c)>a&&(c+a)>b) {
             System.out.printf("Perimetro = %.1f%n", a+b+c);
         }
         else {
             System.out.printf("Area = %.1f%n", (0.5*(a+b)*c));
         }
         
         
    }
 
}
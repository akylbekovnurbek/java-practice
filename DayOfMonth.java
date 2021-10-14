import java.util.Scanner;
     public class DayOfMonth {
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
         System.out.printf("a= %f %f %f%n" , a , b,c);
         
         
         if (a>=b+c){
             System.out.println("NAO FORMA TRIANGULO");
         }
         else if (a*a==b*b+c*c){
             System.out.println("TRIANGULO RETANGULO");
         }
         if (a*a>b*b+c*c){
             System.out.println("TRIANGULO OBTUSANGULO");
         }
         if (a*a<b*b+c*c){
             System.out.println("TRIANGULO ACUTANGULO");
         }
         if ((a==b)&&(a==c)){
             System.out.println("TRIANGULO EQUILATERO");
         }
         if (((a==b)&&(a!=c))||((a==c)&&(a!=b))||((b==c)&&(b!=a))){
             System.out.println("TRIANGULO ISOSCELES");
         }
 
    }
 
}
         
            
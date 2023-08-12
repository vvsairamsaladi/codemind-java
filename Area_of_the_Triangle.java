import java.util.Scanner;
 public class are{
     public static void main(String[] args)
     {
         Scanner art = new Scanner(System.in);
         double a = art.nextDouble();
         double b = art.nextDouble();
         double c = art.nextDouble();
         double s = ((a+b+c)/2);
         double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
         System.out.printf("%.2f",area);
     }
 }
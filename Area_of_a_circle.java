import java.util.Scanner;
public class circle
{
    public static void main(String[] sr)
    {
        Scanner are = new Scanner(System.in);
        double r = are.nextDouble();
        double area = (r*r*3.14);
        System.out.printf("%.2f",area);
        
    }
}
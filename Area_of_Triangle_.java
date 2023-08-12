import java.util.Scanner;
public class triangle
{
    public static void main(String[] args)
    {
        Scanner ar = new Scanner(System.in);
        double A = ar.nextDouble();
        double B = ar.nextDouble();
        double C = ar.nextDouble();
        double s = ((A+B+C)/2);
        double area = Math.sqrt(s*(s-A)*(s-B)*(s-C));
        System.out.printf("%.2f",area);
    }
}
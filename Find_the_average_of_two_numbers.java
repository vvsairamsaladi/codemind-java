import java.util.Scanner;
public class sr
{
    public static void main(String[] args)
    {
        double N,M,avg;
        Scanner num = new Scanner(System.in);
        N = num.nextDouble();
        M = num.nextDouble();
        avg = ((N+M)/2);
        System.out.printf("%.4f",avg);
    }
}
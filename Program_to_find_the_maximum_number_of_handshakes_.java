import java.util.Scanner;
public class Sa
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hask = (n*(n-1))/2;
        System.out.print(hask);
    }
}
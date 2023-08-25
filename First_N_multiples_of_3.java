import java.util.Scanner;
public class Sa
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for(i=1; i<=n; i++)
        {
            System.out.printf("%d ",i*3);
        }
    }
}
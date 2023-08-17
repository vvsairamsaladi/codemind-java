import java.util.Scanner;
public class Sa
{
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         int y = sc.nextInt();
        if(x==0 && y%2==0)
        {
            System.out.print("YES");
        }
        else if (x%2==0&&x!=0)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}
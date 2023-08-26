import java.util.Scanner;
public class Sa
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = sc.nextInt();
        int b = sc.nextInt();
        
        int a = (t*s*512*b*2)/1024;
        System.out.print(a+ " KB");
    }
}
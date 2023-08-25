import java.util.Scanner;
public class Ra
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k;
        if(a>50&&b>60&&c>100)
        {
            k=10;
        }
        else if(a>50&&b>60)
        {
            k=9;
        }
        else if(b>60&&c>100)
        {
            k=8;
        }
        else if(a>50&&c>100)
        {
            k=7;
        }
        else if(a>50||b>60||c>100)
        {
            k=6;
        }
        else 
        {
            k=5;
        }
        System.out.println(k);
    }
}
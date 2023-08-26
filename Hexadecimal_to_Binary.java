import java.util.Scanner;
public class Sa
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int d=1;d<=t;d++)
        {
        String a = sc.next();
        int b = Integer.parseInt(a,16);
        String c =Integer.toString(b,2);
         int n = c.length();
         if(n%4==0)
         {
             System.out.println(c);
         }
          else if(n%4==1)
          {
              System.out.println("000"+c);
          }
          else if(n%4==2)
          {
              System.out.println("00"+c);
          }
          else if(n%4==3)
          {
              System.out.println("0"+c);
          }
        }
    }
}
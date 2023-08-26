import java.util.Scanner;
public class Sa
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int f=1;f<=t;f++){
        String a = sc.next();
        int b = Integer.parseInt(a,2);
        System.out.println(Integer.toString(b,8));
        }
        
    }
}           
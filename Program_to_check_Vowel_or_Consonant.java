import java.util.Scanner;
public class Sa
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c=='a'||c=='A'||c=='o'||c=='O'||c=='e'||c=='E'||c=='i'||c=='I'||c=='u'||c=='U')
        {
            System.out.print("Vowel");
        }
        else
        {
            System.out.print("Consonant");
        }
    }
}
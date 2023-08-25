import java.util.Scanner;
public class Ra
{
   public static void main(String[] args)
   {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       String k="";
       int c=0;
       {
           {
               if(n%3==0)
               {
                   k+="Pling";  
                   c++;
               }
               if(n%5==0)
               {
                   k+="Plang";
                   c++;
                   
               }
               if(n%7==0)
               {
                    k+="Plong";
                    c++;
               } 
           }
       }
       if(c==0)
       {
           System.out.print(n);
       }
       else
       {
           System.out.print(k);
       }
   }
}
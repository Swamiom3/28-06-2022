import java.util.*;

   class Fibonacci
   {
     public static void main(String[]args)

     {
     Scanner sc=new Scanner(System.in);
     System.out.print("\n\t\tENTER YOUR VALUE : ");
     int n=sc.nextInt();
     

     int a=0,b=1; int c=0;
     System.out.println("\n\t\t "+a+"\n\t\t "+b+" ");
     int i=2;

         while(i<=n)
         {
         c=a+b;
          
           System.out.println("\n\t\t "+c);
         a=b;
         b=c;
         i++;

         }

      }

    }

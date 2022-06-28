import java.util.*;

class Hcf3

 {
 
    public static void main(String[]om)

     {
      Scanner sc=new Scanner(System.in);
      System.out.println("\n\t\tENTER YOUR THREE NUMBERS TO FIND FACTORS");
      int n1=sc.nextInt();
     


      int i=1;  

         while(i<=n1)

         {
         if(n1%i==0 && i%2==0)

              System.out.println("\n\t\t\tTHIS IS YOUR EVEN FACTORS : "+i);

        
         
         i++;

         }
        

     }

 }

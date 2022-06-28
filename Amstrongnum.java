import java.util.*;

    class Amstrongnum 
    {
    
      public static void  main(String[]omkar)

        {
          Scanner sc=new Scanner(System.in);
          System.out.println("ENTER YOUR NUMBER");
          int n=sc.nextInt();


          int rem,sum=0;

          int i=n;


          while(i!=0)
          {

          rem=i%10;
          sum=sum+(rem*rem*rem*rem);

          i=i/10;
   
           }

          if(n==sum)
            System.out.println("\n\t\tTHIS IS ARMSTRIONG NUM");

          else 
            System.out.println("\n\t\t\tTHIS IS NOT ARMSTRONG NUM");

        }
     }
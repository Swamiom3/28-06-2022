class Hcf

 {
 
    public static void main(String[]om)

     {

      int a=12,b=16;
      int i=1; int hcf=0;

         while(i<=a || i<=b)

         {
         if(a%i==0 && b%i==0)
         hcf=i;
         
         i++;

         }
 
         System.out.println("\n\t\t\tTHIS IS YOUR FACTORS : "+hcf);

     }

 }

import java.util.*;

public class FinalsLabAct1
{
   static Scanner sc = new Scanner(System.in);
   
   int number;
   
   FinalsLabAct1()
   {
      try
      {
         System.out.println("Enter a number to calculate its square root: ");
         number = sc.nextInt();
         
         if(number < 0)
            throw new ArithmeticException();
         
         System.out.println("The square root of " + number + " is " + Math.sqrt(number));
         
      }
      catch(ArithmeticException e)
      {
         System.out.println("You can't square a negative value, try again.....");
         new FinalsLabAct1();
      }

   }
   
   public static void main(String [] args)
   {
      new FinalsLabAct1();
   }
}
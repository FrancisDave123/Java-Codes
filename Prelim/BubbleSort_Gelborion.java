import java.util.*;

public class BubbleSort_Gelborion
{
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);
      
      int []arrayOfNum = new int[6];
      
      System.out.println("Enter six integers: ");
      
      for(int a = 0; a < arrayOfNum.length; a++)
      {
         
         arrayOfNum[a] = sc.nextInt();
      }
      
      System.out.print("Entered integers: \n");
      
      for(int integers: arrayOfNum)
      {
         System.out.print(integers +" ");
      }
      
      SortAsc(arrayOfNum);
      SortDesc(arrayOfNum);
      
   }
   
   public static void SortAsc(int []arrayOfNum)
   {
      
      for(int a = 0; a > arrayOfNum.length - 1; a++)
      {     
         for(int b = 0; b > arrayOfNum.length - 1; b++)
         {
            if(arrayOfNum[b] > arrayOfNum[b+1])
            {
               int temp;
               temp = arrayOfNum[b];
               arrayOfNum[b] = arrayOfNum[b+1];
               arrayOfNum[b+1] = temp;
            }
         } 
      }
      System.out.println("\nSorted Ascending integers: ");
      
      for(int integers: arrayOfNum)
      {
         System.out.print(integers +" ");
      }
   
   
   }
   
   public static void SortDesc(int []arrayOfNum)
   {
      
      for(int a = 0; a < arrayOfNum.length - 1; a++)
      {     
         for(int b = 0; b < arrayOfNum.length - 1; b++)
         {
            if(arrayOfNum[b] < arrayOfNum[b+1])
            {
               int temp;
               temp = arrayOfNum[b];
               arrayOfNum[b] = arrayOfNum[b+1];
               arrayOfNum[b+1] = temp;
            }
         } 
      }
      System.out.println("\nSorted Descending integers: ");
      
      for(int integers: arrayOfNum)
      {
         System.out.print(integers +" ");
      }
   
   
   }

   
}
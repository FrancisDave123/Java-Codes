//Written By: Francis Dave M. Gelborion BSIT 2A
//Date: September 11, 2023
//Activity 3 Menu of sorting array of grades by ascending and descending order.

import java.util.*;

public class LabAct3InsertionSort
{
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("How many grades would you like to enter? ");
      int numberOfGrades = sc.nextInt();
      
      double [] gradesArray = new double[numberOfGrades];
      
      System.out.println("Enter " + numberOfGrades + " final grades: ");
      
      int choice;
      
      for(int a = 0; a < gradesArray.length; a++)
      {
         gradesArray[a] = sc.nextDouble();
      }
      
      do
      {
         System.out.println("\n1. Insertion Sort in Ascending Order");
         System.out.println("2. Insertion Sort in Descending Order");
         System.out.println("3. Exit");
         
         choice = sc.nextInt();
         
         switch(choice)
         {
            case 1: 
            //Ascending Order using Insertion Sort
            for(int a = 1; a < gradesArray.length; a++)
            {
               double temp = gradesArray[a];
               int b = a - 1;
               while(b >= 0 && gradesArray[b] > temp)
               {
                  gradesArray[b + 1] = gradesArray[b];
                  b--;
               }
               gradesArray[b+1] = temp;
            }
            
            System.out.println("Grades in Ascending Order: ");
            for(double element: gradesArray)
            {
               System.out.print(element + " ");
            }
            break;
            
            case 2:
            //Descending Order using Insertion Sort
            for(int a = 1; a < gradesArray.length; a++)
            {
               double temp = gradesArray[a];
               int b = a - 1;
               while(b >= 0 && gradesArray[b] < temp)
               {
                  gradesArray[b + 1] = gradesArray[b];
                  b--;
               }
               gradesArray[b+1] = temp;
            }
            
            System.out.println("Grades in Descending Order: ");
            for(double element: gradesArray)
            {
               System.out.print(element + " ");
            }
            break;
            //Stop the process
            case 3:
            break;
            
            
            default:
            System.out.println("Enter a valid number!!");

         }
          
      }while(choice != 3);
      
      
   }
}
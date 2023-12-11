import java.util.*;

public class LabActivity4
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      final int row = 12;
      final int col = 2;
      double [][] array = new double[row][col];
      
      getData(array); //Asks the user to populate and prints all the elements
      AverageHigh(array); //Gets the average of all the highest temperatures each month
      AverageLow(array); //Gets the average of all the lowest temperatures each month
      HighestTemp(array); //Gets the highest temperature
      LowestTemp(array); //Gets the lowest temperature
   }
   
   public static void getData(double[][] myArray)
   {
      //Initialized an array with values of all months
      String[] months = {"January\t", "February\t", "March\t\t", "April\t\t", "May\t\t", "June\t\t", 
                         "July\t\t", "August\t", "September","October\t", "November\t", "December\t"};
   
      Scanner sc = new Scanner(System.in);
      
      
      //Populating the 2d array with temperatures each month
      for(int a = 0; a < myArray.length; a++)
      {
         System.out.println("Enter temperature in month " + months[a]);
         
         for(int b = 0; b < myArray[a].length; b++)
         {
            double temperature = sc.nextDouble();
            myArray[a][b] = temperature;
         }
      }
      //Printing all the temperatures
      for(int c = 0; c < myArray.length; c++)
      {
         System.out.print(months[c] + ": \t\t\t   ");
         for(int d = 0; d < myArray[c].length; d++)
         {
            System.out.print(" " + myArray[c][d] );
         }
         System.out.println();
      }
   }
   
   public static void AverageHigh(double [][] myArray)
   {
      double maxTemp = 0, totalTemp = 0, averageTemp = 0;
      
      //Finding the highest temperature each month
      for(int a = 0; a < myArray.length; a++)
      {
         maxTemp = myArray[a][0]; 
         for(int b = 0; b < myArray[a].length; b++)
         {
            if(maxTemp < myArray[a][b])
            {
               maxTemp = myArray[a][b];   
            }
         }
         totalTemp = totalTemp + maxTemp;
      }
      averageTemp = totalTemp / myArray.length;
      System.out.println("Average High Temperature: " + averageTemp);
   }
   
   public static void AverageLow(double [][] myArray)
   {
      double minTemp = 0, totalTemp = 0, averageTemp = 0;
      
      for(int a = 0; a < myArray.length; a++)
      {
         minTemp = myArray[a][0];
         for(int b = 0; b < myArray[a].length; b++)
         {
            if(minTemp > myArray[a][b])
            {
               minTemp = myArray[a][b];   
            }
         }
         totalTemp = totalTemp + minTemp;
      }
      averageTemp = totalTemp / myArray.length;
      System.out.println("Average Low Temperature: " + averageTemp);
   }
   public static void HighestTemp(double [][] myArray)
   {
      double maxTemp = myArray[0][0];
      for(int a = 0; a < myArray.length; a++)
      {
         for(int b = 0; b < myArray[a].length; b++)
         {
            if(maxTemp < myArray[a][b])
            {
               maxTemp = myArray[a][b];   
            }
         }
      }
      System.out.println("Highest Temperature: " + maxTemp);
   }
   public static void LowestTemp(double [][] myArray)
   {
      double minTemp = myArray[0][0];
      for(int a = 0; a < myArray.length; a++)
      {
         for(int b = 0; b < myArray[a].length; b++)
         {
            if(minTemp > myArray[a][b])
            {
               minTemp = myArray[a][b];   
            }
         }
      }
      System.out.println("Lowest Temperature: " + minTemp);
   }
}
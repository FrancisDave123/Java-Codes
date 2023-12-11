//FinalsLabAct2

import java.util.*;

public class Employee extends EmployeeException
{
   static Scanner sc = new Scanner(System.in);
   static String idNum;
   static double hourlyWage;
   static int employeeCounter = 0;

   Employee(String idNum, double hourlyWage)
   {
      try
      {
          if(hourlyWage < 100 || hourlyWage > 400)
          {
            throw new EmployeeException("Employee " + idNum + " wage is " + hourlyWage + " thus cannot be created.");
          }         
      }
      catch(EmployeeException e)
      {
         System.out.println(e.getMessage());
      }
   }
   
   public static void main(String [] args)
   {
      while(employeeCounter < 5)
      {
         System.out.println("Enter employee ID number: ");
         idNum = sc.next();
               
         System.out.println("Enter employee hourly wage of employee " + idNum + ":");
         hourlyWage = sc.nextDouble();
         
         new Employee(idNum, hourlyWage);
         
         employeeCounter++;
      } 
   }
}
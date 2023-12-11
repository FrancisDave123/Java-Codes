//Francis Dave M. Gelborion BSIT 2A
//Date: Sept 06, 2023

import java.util.*;

public class TestArrayStudents
{
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);
      
      int size;
      int idNum;
      String lname, fname, course;
      double fgrade;
      
      System.out.print("Enter number of students to sort: ");
      size = sc.nextInt();
      
      Student [] student = new Student[size]; 
      
      for(int i = 0; i < student.length; i++)
      {
         System.out.print("Enter student number for student " + (i + 1) + ": ");
         idNum = sc.nextInt();
         
         sc.nextLine();
         
         System.out.print("Enter student #" +(i + 1)+ "'s last name: ");
         lname = sc.nextLine();
         
         System.out.print("Enter student #" + (i + 1) + "'s first name: ");
         fname = sc.nextLine();
         
         System.out.print("Enter student #" +(i + 1) + "'s course: ");
         course = sc.nextLine();
         
         System.out.print("Enter student #" + (i + 1) + "'s final grade: ");
         fgrade = sc.nextDouble();
         
         student[i] = new Student(idNum, lname, fname, course, fgrade);
      }
      
      BubbleSort(student);
      
      System.out.print("Students List");
      
      for(Student s: student)
      {
         System.out.print("\nName: " + s.getLname() + ", " + s.getFname() +
                          "\nId Number: " + s.getIdNum() +
                          "\nCourse: " + s.getCourse() +
                          "\nFinal Grade: " + s.getFgrade());
      }
   }
   
   public static void BubbleSort(Student [] student)
   {
      for(int a = 0; a < student.length - 1; a++)
      {
         for(int b = 0; b < student.length - 1; b++)
         {
            if(student[b].getFgrade() > student[b+1].getFgrade())
            {
               Student temp;
               temp = student[b];
               student[b] = student[b+1];
               student[b+1] = temp;
            }
         }
      }
   }
}
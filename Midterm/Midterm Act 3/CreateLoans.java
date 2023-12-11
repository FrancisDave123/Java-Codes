import java.util.*;

public class CreateLoans
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      Loan [] loans = new Loan[1];
      
      double primeInterest = 0.085, loanAmount, interestRate;
      String lname, fname, term;
      
      
      System.out.println("The current prime interest rate is " + primeInterest * 100 + "%\n");
      
      Loan businessLoan;
      Loan personalLoan;
      
      while(true)
      {
         System.out.println("Select loan type: " + 
                            "\n1.Business Loan" + 
                            "\n2.Personal Loan");
         int loanType = sc.nextInt();
         
         for(int a = 0; a < loans.length; a++)
         {
            switch(loanType)
            {
               case 1: 
               
                  System.out.println((a+1) +". Enter last name: ");
                  lname = sc.next();
                  System.out.println("Enter loan amount: ");
                  loanAmount = sc.nextInt();
                  System.out.println("Enter loan term (1-year, 3-years, 5-years)");
                  term = sc.nextLine();
                  sc.nextLine();
                  interestRate = 0.01 + primeInterest;
                  businessLoan = new BusinessLoan((a+1), lname, loanAmount, term, interestRate);  
                  loans[a] = businessLoan;
                  break;
               case 2:
                  System.out.println((a+1) +". Enter last name: ");
                  lname = sc.next();
                  System.out.println("Enter loan amount: ");
                  loanAmount = sc.nextInt();
                  System.out.println("Enter loan term (1-year, 3-years, 5-years)");
                  term = sc.nextLine();
                  sc.nextLine();
                  interestRate = 0.02 + primeInterest;
                  personalLoan = new PersonalLoan((a+1), lname, loanAmount, term, interestRate);  
                  loans[a] = personalLoan;
                  break;
            }
         }
         System.out.println(Arrays.toString(loans));  
      }
      
   }
}
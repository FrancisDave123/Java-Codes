import java.util.*;

public abstract class Loan implements LoanConstants
{
   Scanner sc = new Scanner(System.in);
   
   int loanNumber;
   String lname;
   double amountLoan;
   double interestRate;
   String term;
   double total;
   
   public Loan(int loanNumber, String lname, double amountLoan, String term, double interestRate)
   {
      this.loanNumber = loanNumber;
      this.lname = lname;
      
      while(amountLoan > maxLoanAmount)
      {
         System.out.println("Loan Amount above $100,000 is not permitted");
         amountLoan = sc.nextInt();
      }
      this.amountLoan = amountLoan;
      
      if(term != shortTerm && term != mediumTerm && term != longTerm)
         this.term = shortTerm;
      else
         this.term = term;
      this.interestRate = interestRate;
      total = amountLoan * interestRate;
   }
   
   public String toString()
   {
      return "\nLoan Number: \t\t\t\t " + loanNumber +
             "\nCustomer's Last Name:\t " + lname +
             "\nAmount of Loan:\t\t\t " + amountLoan +
             "\nLoan Term: \t\t\t\t\t" + term +
             "\nInterest Rate: \t\t\t " + interestRate +
             "\nTotal Amount:  \t\t\t " + total;
   }
   
   
   
}
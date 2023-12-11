public class PersonalLoan extends Loan
{
   double interestRate;
   
   public PersonalLoan(int loanNumber, String lname, double amountLoan, String term, double interestRate)
   {
      super(loanNumber, lname, amountLoan, term, interestRate);
   }
   
   public double setInterestRate(double interestRate)
   {
      return 0.02;
   }
   
   public void getInterestRate()
   {
      this.interestRate = interestRate;
   }
}
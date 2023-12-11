public class BusinessLoan extends Loan
{
   double interestRate;
   
   public BusinessLoan(int loanNumber, String lname, double amountLoan, String term, double interestRate)
   {
      super(loanNumber, lname, amountLoan, term, interestRate);
      // 0.01(Interest Rate) + 0.085(Current Prime Interest Rate)
   }
   
   public double setInterestRate(double interestRate)
   {
      return 0.01;
   }
   
   public void getInterestRate()
   {
      this.interestRate = interestRate;
   }
   
   
}
import java.util.*;

public class Loan
{
  private String amount;
  private String interest;
  private int years;


   public Loan()
   {
       this.amount   = "";
       this.interest  = "";
       this.years = 0;
   }

   public Loan(String amount, String interest, int years)
   {
	   this.amount   = amount;
	   this.interest  = interest;
	   this.years = years;

   }

   public void setAmount(String amount)
   { this.amount = amount; }

   public void setInterest(String interest)
   { this.interest = interest; }

   public void setYears(int years)
   { this.years = years; }

   public String getAmount()
   { return amount; }

   public String getInterest()
   { return interest; }

   public int getYears()
   { return years; }

   public double getMonpay()
   {
	   int months = years * 12;
	   double gamount = Integer.parseInt(amount);
	   double ginterest = Double.parseDouble(interest);
	   double monpay = 0;
	   double top= gamount * ginterest;
	   double bottom= (1- Math.pow((1 + ginterest), -months));
	   return monpay;
   }

   public double getsumMonpay()
   {
	   int months = years * 12;
	   double monpays = getMonpay ();
	   double sum = monpays * months;
	   return sum;
   }


	public double getsuminterest()
	{
		double samount = Integer.parseInt(amount);
	    double sinterest = Double.parseDouble(interest);
		double tinterest = ( samount * sinterest * years);
		return tinterest;
	}
	public String toString()
	   {

	       String result = "$ " + getMonpay() + "  " + "$ " + getsumMonpay() + "  " + getsuminterest();
           return result;
	   }
	   public boolean equals(Object other)
	      {
	        if(other == null)
	          return false;
	        if(other == this)
	          return true;
	        if( !(other instanceof Loan) )
	          return false;
	        Loan otherLoan = (Loan)other;
	        return true;
   }
}
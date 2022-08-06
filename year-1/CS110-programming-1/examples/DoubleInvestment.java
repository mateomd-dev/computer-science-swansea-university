/**
   This program computes the time required to double an investment.
	It uses a loop which goes round (*iterates*) once per year
   Because we don't know how many years it will take, we use a while loop.
*/
public class DoubleInvestment
{
   public static void main(String[] args)
   {  
     	final double RATE = 2.0;	//Interest rate
     	double balance = 10000;		//Starting amount
     	final double TARGET =  balance * 2;
     	int year = 0;

       // Count the years required for the investment to double
       while(balance < TARGET){
			double interest = balance * RATE / 100;
			balance += interest;
			year++;
			System.out.println("After " + year + " years you have " + balance);
		}			
      
		// Print out the result
		System.out.println("The investment doubled after "
				+ year + " years.");
   }
}

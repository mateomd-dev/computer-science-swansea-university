/* This version is the same as the previous one - except that we move the definition
 * of the double variable interest *inside* the for loop.
 *
 * It's generally good practice to define variables within the blocks of code where
 * we use them.
 */

class YearsInvestment3 {
	public static void main(String[] args) {
		final int YEARS_COUNT = 10;	//No. of years investment will run
		final double RATE = 2.0;
		final double INITIAL_BALANCE = 10000;	
		double balance = INITIAL_BALANCE;
		
		//Loop to calculate value of investment
		//We know the number of loops so use for
		for(int years = 0; years < YEARS_COUNT; years++) {
			double interest = balance * RATE / 100; //define interest inside the loop
			balance += interest;
		}
		
		//Print out result
		System.out.println("After " + YEARS_COUNT +
			" you will have £" + balance);
	}
}
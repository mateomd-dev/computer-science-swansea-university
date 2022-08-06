/*A program that works out how much money we have after 5 years - this
 *program should really use a for loop because we know how many times
 *the loop will go around. In the next program, we'll rewrite it.
 */

class SimpleYearsInvestment1 {
	public static void main(String[] args) {

		int years = 0;
		double balance = 10000;
		
		while (years < 10) {
			double interest = balance * 0.02;
			balance += interest;
			years++;
			System.out.println(years + ": " + balance);
		}
		
		System.out.println("After " + years +
		" years: £"
		+ balance);
	}
}
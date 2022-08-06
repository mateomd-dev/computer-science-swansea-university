/* The same program as SimpleYearsInvestment1 but using a for loop
 */

class SimpleYearsInvestment2 {
	public static void main(String[] args) {
		double balance = 10000;
		
		for(int years = 0; years < 5; years++) {
			double interest = balance * 0.02;
			balance += interest;
			System.out.println(years + ": " + balance);
		}
	
		System.out.println("After 5 years: £"
		+ balance);
	}
}
/* More concepts related to scope - note that we have declared two variables
 * called tax, each in it's own {..} - these are *separate* variables
 * As an exercise, try declaring another variable called tax outside the if - else
 * statement.
 */

public class TaxScope {
	public static void main(String[] args){
		int salary = 45000;
		double tax;

		if (salary > 40000) {
			double tax = salary * 0.4;
			System.out.println("High Rate " + tax);
		} else {
			double tax = salary * 0.2;
			System.out.println("Low Rate " + tax);
		}
	}
}
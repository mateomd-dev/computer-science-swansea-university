/*
 * This version fixes the problem in version 2 by grouping the lines with { }
 * EVEN IF YOU HAVE ONLY ONE LINE IN AN IF STATEMENT IT'S GOOD PRACTICE TO USE { }
 */

import java.util.Scanner;

class Birthday3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What day of the month is your birthday? ");
		int day = in.nextInt();
			
		if (day == 20) {
			System.out.println("That's Neal's birthday too.");
			System.out.println("And it's Jake's too.");
		}
		
		System.out.println("You said " + day);
	}
}
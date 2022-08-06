/*
 * This version uses an else statement instead of testing that day is not 20
 */

import java.util.Scanner;

class Birthday5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What day of the month is your birthday? ");
		int day = in.nextInt();
			
		if (day == 20) {
			System.out.println("That's Neal's birthday too.");
			System.out.println("And it's Jake's too.");
		}else {
			System.out.println("Bad luck...");
		}
		
		System.out.println("You said " + day);
	}
}
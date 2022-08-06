/*
 * This version adds an extra line to be done if day is 20 - but that line will *always*
 * be executed because we don't have { } grouping the two lines together
 */

import java.util.Scanner;

class Birthday2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What day of the month is your birthday? ");
		int day = in.nextInt();
			
		if (day == 20)1
			System.out.println("That's Neal's birthday too.");
			System.out.println("And it's Jake's too.");
		
		System.out.println("You said " + day);
	}
}
/*
 * This version does something different if day is not 20 - it does it in the 'obvious' but
 * wrong way - if uses an other if statement that checks if day is not 20
 */

import java.util.Scanner;

class Birthday4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What day of the month is your birthday? ");
		int day = in.nextInt();
			
		if (day == 20) {
			System.out.println("That's Neal's birthday too.");
			System.out.println("And it's Jake's too.");
		}
		if (day != 20) {
			System.out.println("Bad luck...");
		}
		
		System.out.println("You said " + day);
	}
}
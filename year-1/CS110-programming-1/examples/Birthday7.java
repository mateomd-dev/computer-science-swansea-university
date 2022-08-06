/*
 * This version uses a boolean variable to test if day is 20 - it's not really very helpful
 * in a programme like this, but is handy when we get to do *loops*
 */

import java.util.Scanner;

class Birthday7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What day of the month is your birthday? ");
		int day = in.nextInt();
		
		boolean isTwenty = day == 20;	
		if (isTwenty) {
			System.out.println("That's Neal's birthday too.");
			System.out.println("And it's Jake's too.");
		} else  if (day == 12){
			System.out.println("That's Noordin's birthday.");
		} else if (day == 31) {
			System.out.println("That's Andrew's birthday.");
		} else {
			System.out.println("Bad luck...");
		}
		
		System.out.println("You said " + day);
	}
}
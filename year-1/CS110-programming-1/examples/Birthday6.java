/*
 * This version has a four way if statement with a final else.
 * The logic is:
 * check if day is 20 - if so print messages for Neal & Jake and skip the rest of the else-if parts
 *      (and the final else part)
 * otherwise check if day is 12 - if so print Nurdin's message and skip the rest
 * otherwise check if day is 31 - if so print Andrew's message and skip the rest
 * finally, if *none* of the above were true, do the final else part.
 */

import java.util.Scanner;

class Birthday6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What day of the month is your birthday? ");
		int day = in.nextInt();
			
		if (day == 20) {
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
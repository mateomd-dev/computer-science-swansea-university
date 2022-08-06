/*
 * This version has a single if statement.
 * If day is 20, it prints Neal's birthday message
 * It 'works' but there will be problems if you add any more lines to be done if day is 20
 * because we have not used { and } to *group* the lines to be done by the if statement
 */

import java.util.Scanner;

class Birthday1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What day of the month is your birthday? ");
		int day = in.nextInt();
			
		if (day == 20) 
			System.out.println("That's Neal's birthday too.");
				
		System.out.println("You said " + day);
	}
}
/* The Say Lemon game - this is kind of like blackjack with different words (and less interesting things happening
 *
 * Notice the code for getting the responses from the user is very repetitive - we are doing more or less the
 * same thing twice
 */

import java.util.Scanner;

public class SayLemon {
	public static void main(String[] args) {
		
		String again;
		String playAgain;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Welcome to Say Lemon");
			do {
				System.out.println("Yay!!! Say Lemon!!");
				do {
					System.out.print("Again? Type Lemon for yes, Kiwi for no ");
					again = in.nextLine();
				} while(!again.equalsIgnoreCase("lemon") &&
						!again.equalsIgnoreCase("kiwi"));
			}while(again.equalsIgnoreCase("lemon"));
			do {
				System.out.print("Play again (go on...). Type yes or no ");
				playAgain = in.nextLine();
			} while(!playAgain.equalsIgnoreCase("yes") &&
					!playAgain.equalsIgnoreCase("no"));
		} while(playAgain.equalsIgnoreCase("yes"));
	}
}
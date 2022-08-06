import java.util.Scanner;

/* This program also doesn't need a break - and uses a do-while loop so it also
 * doesn't need a boolean variable.
 */

public class GuessTheFruit2 {
	public static void main(String[] args) {
		final String SECRET_FRUIT = "lemon";
		
		System.out.println("Welcome to Guess the Fruit!");
		
		Scanner in = new Scanner(System.in);
		
		String guess;
		
		do {
			System.out.print("What's your guess: ");
			guess = in.next();
		} while(!guess.equals(SECRET_FRUIT));
		
		System.out.println("Congratulations! It is a " + SECRET_FRUIT);
	}
}
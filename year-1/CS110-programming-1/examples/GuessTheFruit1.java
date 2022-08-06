import java.util.Scanner;

/* This program rewrites the previous one with a 'break' statement
 * to use a boolean variable instead
 */

public class GuessTheFruit1 {
	public static void main(String[] args) {
		final String SECRET_FRUIT = "lemon";
		
		System.out.println("Welcome to Guess the Fruit!");
		
		Scanner in = new Scanner(System.in);
		
		String guess;
		
		boolean finished = false;
		while (!finished) {
			System.out.print("What's your guess: ");
			guess = in.next();
			if (guess.equals(SECRET_FRUIT)) {
				finished = true;
			}
		}
		
		System.out.println("Congratulations! It is a " + SECRET_FRUIT);
	}
}
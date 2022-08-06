import java.util.Scanner;

/* This program is an example of a loop and a 'break' statement - the loop is
 * while(true) which means it never ends - except that the 'break' statement jumps
 * out and exits it. Break statements *can* come in handy *sometimes* but it's usually
 * better (easier to understand and change) if the loop enters and exits at the loop
 * condition - instead of just jumping out from the middle.
 */

public class GuessTheFruit0 {
	public static void main(String[] args) {
		final String SECRET_FRUIT = "lemon";
		
		System.out.println("Welcome to Guess the Fruit!");
		
		Scanner in = new Scanner(System.in);
		
		String guess;
		
		while (true) {
			System.out.print("What's your guess: ");
			guess = in.next();
			if (guess.equals(SECRET_FRUIT)) {
				break;
			}
		}
		
		System.out.println("Congratulations! It is a " + SECRET_FRUIT);
	}
}
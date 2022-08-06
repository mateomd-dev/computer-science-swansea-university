import java.util.Scanner;

/*
 * A very of the program to read yes or no but with better
 * style
 *
 * This one uses .equalsIgnoreCase() instead of .equals() to 
 * allow input in any case.
 */
public class BasicYesNoStyle {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String inValue;
		
		final String OK = "yes"; //We can, say, change languages
		final String NOT_OK = "no";

		do {
			//Could make these other strings final too
			System.out.print("Enter yes or no: ");
			inValue = in.nextLine();
			System.out.println("You said: " +
				inValue);
		} while(!inValue.equalsIgnoreCase(OK) &&
			!inValue.equalsIgnoreCase(NOT_OK));
		
		System.out.println("Bye..");
	}
}

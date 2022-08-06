/* This is the fifth version of the Volume program
   It has *way* more comments than is normal - I've
	only done this version to explain in detail each
	part of the code.
	
	Notice how overdoing the comments makes the code
	harder to read by cluttering it up - that's why
	you should only put in the ones you need.
 */

/* This line says we are going to use a Scanner - we
will see more kinds of imports later in the module */
import java.util.Scanner;

class Volume5 {
	public static void main(String[] args) {
			
		/*This creates a Scanner called in - only need to do this once
		in a program */	
		Scanner in = new Scanner(System.in);	
		/* These are constants - putting final in front of a declaration
		of a variable means you can only assign a value to it once.
		We put the names of final variables (constants) in capitals,
		with underscores between the words */
		final int CANS_IN_PACK = 6;
		final double CAN_VOLUME = 0.355;
		
		final double BOTTLE_VOLUME = 2.0;
		
		/* System.out.print is different to System.out.println
		 	because it doesn't add a newline at the end */
		System.out.print("Enter the number of packs of cans: ");
		
		/* This line declares a new variable - not a constant this time
			because it doesn't say final - and reads in an integer typed
			at the keyboard: in.nextInt() - you can also read in other
			types of data. For example, in.next() reads a String. */
		int numberOfPacks = in.nextInt();
		System.out.print("Enter the number of bottles: ");
		int numberOfBottles = in.nextInt();
		
		/* Here we declare some more variables - two used for intermediate
			values in the computation, and one for the final result */
		double totalCanVolume = CANS_IN_PACK * CAN_VOLUME * numberOfPacks;
		double totalBottleVolume = numberOfBottles * BOTTLE_VOLUME;
		
		double totalVolume = totalCanVolume + totalBottleVolume;
		
		/* Print the result - the + joins the text in the String
			"The total volume is: " to the value of totalVolume */
		System.out.println("The total volume is: " + totalVolume);
	}
}
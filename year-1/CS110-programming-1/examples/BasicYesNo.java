import java.util.Scanner;

public class BasicYesNo {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String inValue;

		do {
			System.out.print("Enter yes or no: ");
			inValue = in.nextLine();
			System.out.println("You said: " +
				inValue);
		} while(!inValue.equalsIgnoreCase("yes") &&
			!inValue.equalsIgnoreCase("no"));
		
		System.out.println("Bye..");
	}
}

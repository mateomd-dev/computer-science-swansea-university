import java.util.Scanner;

public class YesNoLemon {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String inValue;

		do {
			System.out.println("Lemon");
			System.out.print("Again? ");
			
			do {
				System.out.print("Enter yes or no: ");
				inValue = in.nextLine();
			} while(!inValue.equalsIgnoreCase("yes") &&
				!inValue.equalsIgnoreCase("no"));
		} while(inValue.equalsIgnoreCase("yes"));
		
		System.out.println("Bye..");
	}
}

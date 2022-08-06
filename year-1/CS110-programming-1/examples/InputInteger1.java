import java.util.Scanner;

class InputInteger1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String rawInput;
		int input;
		boolean notValid = true;
		
		do {
			try {
				System.out.print("Enter an integer: ");
				rawInput = in.next();
				input = Integer.parseInt(rawInput);
				notValid = false;
			}
			catch(NumberFormatException n){
				System.out.println("Not an integer.");
			}
			
		} while(notValid);
		System.out.println("Thank you.");
	}
}
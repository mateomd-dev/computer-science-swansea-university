import java.util.Scanner;

class InputInteger {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int input;
		
		System.out.print("Enter an integer: ");
		while(!in.hasNextInt()){
			System.out.println("Sorry that's not an integer, try again.");
			String getRidOfIt = in.next();
		}
		input = in.nextInt();
		System.out.println("Thank you.");
	}
}
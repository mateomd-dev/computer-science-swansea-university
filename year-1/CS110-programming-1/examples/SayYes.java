import java.util.Scanner;

class SayYes {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String response;
		
		do{
			System.out.println("Hi there!");
			System.out.print("Want me to say hello again? ");
			response = in.next();
		} while(response.equalsIgnoreCase("yes"));
	}
}
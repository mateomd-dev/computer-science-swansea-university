//Version of Say Lemon using while loop but with
//repeated code
import java.util.Scanner;

public class SayLemon0 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("I'll keep saying Lemon, if you say yes...");
		
		System.out.println("lemon");
		System.out.print("Say lemon again? ");		
		String yesNo = in.nextLine();
		
		while(yesNo.equals("yes")){
			System.out.println("lemon");
			System.out.print("Say lemon again? ");
			yesNo = in.nextLine();
		}
		
		System.out.println("Bye..");
	}
}
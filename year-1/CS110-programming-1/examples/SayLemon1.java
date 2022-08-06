//Version of Say Lemon using while loop and no
//repeated code
import java.util.Scanner;

public class SayLemon1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("I'll keep saying Lemon, if you say yes...");
		
		String yesNo = "yes";
		
		while(yesNo.equals("yes")){
			System.out.println("lemon");
			System.out.print("Say lemon again? ");
			yesNo = in.nextLine();
		}
		
		System.out.println("Bye..");
	}
}
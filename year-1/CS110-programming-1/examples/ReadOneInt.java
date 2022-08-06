/*Program that reads and prints a single integer
 */
import java.util.Scanner;

public class ReadOneInt {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int value = in.nextInt();
		System.out.println("You typed: " + value);
	}
}
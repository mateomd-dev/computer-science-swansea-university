/*Program that reads and prints three integers
 */
import java.util.Scanner;

public class ReadMultipleInts {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the depth: ");
		int depth = in.nextInt();
		System.out.print("Enter the length: ");
		int length = in.nextInt();
		System.out.print("Enter the width: ");
		int width = in.nextInt();
		
		System.out.println("Depth: " + depth +
			" Length: " + length +
			" Width: " + width);
	}
}
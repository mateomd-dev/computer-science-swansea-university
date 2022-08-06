/*
 * Program to add VAT to a price - version 4
 *
 * This version combines all the calculations into one expression in the 'println' statement
 * Although shorter, the code is harder to read - which is not good...
 */

import java.util.Scanner;

class AddVat4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final double VAT_VALUE = 20.0;
	
		System.out.print("Enter the item price: ");
		double price = in.nextDouble();

		System.out.println("You pay: " + (price + (price * VAT_VALUE/100)));
	}
}